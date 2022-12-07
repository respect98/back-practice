package day02;

import java.sql.*;
import java.util.*;

//모든 메모글을 가져와 출력하자 (글번호 내림차순)
public class MemoSelect {
	
	Connection con;
	Statement stmt;
	ResultSet rs;

	private String url="jdbc:oracle:thin:@localhost:1521:XE";
	private String user="scott", pwd="tiger";
	
	public MemoSelect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//--------------------
	
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}		
	}//--------------------

	public static void main(String[] args) {
		MemoSelect app=new MemoSelect();
		ArrayList<MemoVO> memoList =app.selectMemoAll();
		
		app.printMemo(memoList);
		
		System.out.println("검색할 작성자명 입력: ");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		
		ArrayList<MemoVO> findList=app.findMemoByName(name);
		app.printMemo(findList);
		
		
		System.out.println("검색할 메모내용 키워드 입력: ");
		String keyword=sc.next();
		findList=app.findMemoByMsg(keyword);
		app.printMemo(findList);
		
		System.out.println("검색할 글번호 입력: ");
		int idx=sc.nextInt();
		MemoVO vo=app.selectMemo(idx);
		String str=(vo==null)?"검색한 글은 없어요":vo.getIdx()+"\t"+vo.getName()+"\t"+vo.getMsg()+"\t"+vo.getWdate();
		System.out.println(str);
			
	}//--------------------
	//글번호(PK)--로 특정 글을 가져오는 메서드
	public MemoVO selectMemo(int idx) {
		try {
			con=DriverManager.getConnection(url, user, pwd);
			String sql="select * from memo where idx="+idx;
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			ArrayList<MemoVO> arr=makeList(rs);
			
			if(arr!=null && arr.size()==1) {
				MemoVO vo=arr.get(0);
				return vo;
			}
			return null;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			close();
		}		
	}//--------------------------------
	
	public ArrayList<MemoVO> findMemoByMsg(String keyword){
		try {
			con=DriverManager.getConnection(url,user,pwd);
			String sql = "SELECT * FROM memo WHERE msg like '%"+keyword+"%' order by idx desc";
			stmt = con.createStatement();
			rs=stmt.executeQuery(sql);		
			return makeList(rs);			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			close();
		}
	}//----------------------------------
	
	public ArrayList<MemoVO> findMemoByName(String keyword){
		try {
			con = DriverManager.getConnection(url, user, pwd);
			String sql="select idx, name, msg, wdate from memo where name like '%"+keyword+"%' order by idx desc";
			System.out.println(sql);
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			ArrayList<MemoVO> arr=makeList(rs);
			return arr;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			close();
		}
	}//---------------------------------
	
	public ArrayList<MemoVO> makeList(ResultSet rs) throws SQLException{
		ArrayList<MemoVO> arr=new ArrayList<>();
		//boolean next() : 커서는 결과테이블의 beforeFirst에 위치하고 있다가 next()가 호출되면 커서를 다음칸으로 이동시키고
		//					이동한 곳에 레코드가 있으면 true를 반환한다.
		while(rs.next()) {
			int idx = rs.getInt("idx");
			String name=rs.getString("name");
			String msg=rs.getString("msg");
			java.sql.Date wdate=rs.getDate("wdate");
			MemoVO vo=new MemoVO(idx, name, msg, wdate);//vo객체==> 레코드 1개 (row)
			arr.add(vo);
		}//while-------------
		return arr;
	}//---------------------------------------------
	
	
	private ArrayList<MemoVO> selectMemoAll() {
		try {
			con=DriverManager.getConnection(url, user, pwd);
			String sql="SELECT idx, name, RPAD(msg,30,' ') msg, wdate FROM memo ORDER BY idx DESC";
			stmt=con.createStatement();
			/*boolean b=stmt.execute(sql);
			ResultSet rs=stmt.getResultSet();
			System.out.println("b: "+b);//select문이면 true반환
			*/
			//ResultSet executeQuery() : select문일 경우
			rs=stmt.executeQuery(sql);			
			ArrayList<MemoVO> arr=makeList(rs);
			return arr;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			close();
		}
	}//--------------------

	private void printMemo(ArrayList<MemoVO> memoList) {
		if(memoList!=null && memoList.size()>0) {
			System.out.println("------------------------------------------------------");
			System.out.println("\t글번호\t작성자명\t메모내용\t\t작성일");
			System.out.println("------------------------------------------------------");
			for(MemoVO memo:memoList) {
				System.out.println("\t"+memo.getIdx()+"\t"+memo.getName()+"\t"+memo.getMsg()+"\t\t"+memo.getWdate());
			}
			System.out.println("------------------------------------------------------");
		}else {
			System.out.println("해당 데이터가 없습니다.");
		}
	}//--------------------

}///////////////////////////////////////////////////////



