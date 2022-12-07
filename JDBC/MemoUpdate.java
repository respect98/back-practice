package day02;
import java.sql.*;
import java.util.*;
public class MemoUpdate {
	
	private Connection con;
	private Statement stmt;
	
	private String url="jdbc:oracle:thin:@localhost:1521:XE";
	private String user="scott", pwd="tiger";
	
	public MemoUpdate() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}//생성자-----------------
	
	public void close() {
		try {
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}		
	}//--------------------
	
	public int updateMemo(MemoVO memo) {
		try {
			con=DriverManager.getConnection(url, user, pwd);
			//sql문 => update문 작성하기
			String sql="UPDATE memo SET name='"+memo.getName()+"', msg='"+memo.getMsg()+"', wdate=sysdate WHERE idx="+memo.getIdx();
			System.out.println(sql);
			//stmt얻어오기
			stmt=con.createStatement();
			//executeUpdate()로 실행하고 그 결과를 return한다
			int n=stmt.executeUpdate(sql);
			return n;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}finally {
			close();
		}
	}//-------------------------------
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("수정할 글번호 입력: ");
		int idx=sc.nextInt();
		
		System.out.println("수정할 작성자명: ");
		String name=sc.next();
		
		//엔터값 건너뀌기
		sc.skip("\r\n");
		
		System.out.println("수정할 메모내용: ");
		String msg=sc.nextLine();
		
		System.out.println(idx+"/"+name+"/"+msg);
		
		//VO객체에 입력받은 값 담아주기
		MemoVO vo=new MemoVO(idx, name, msg, null);
		
		//insert/update문==> VO객체에 담는다.
		//delete==> 글번호로 삭제
		//select==> 단일행 반환==> VO객체 담는다
		//          다중행 반환 ==> ArrayList<VO>
		
		MemoUpdate app=new MemoUpdate();
		int n=app.updateMemo(vo);
		
		String res=(n>0)?"글 수정 성공":"수정 실패";
		System.out.println(res);

	}//-----------------------------

}



