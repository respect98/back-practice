package memo.model;
import java.sql.*;
import java.util.*;
import common.util.*;
//Data Access Object : 모델에 속하며 영속성(Persistence) 계층이라고 부른다.
//데이터베이스의 data에 접근하기 위한 객체, 간단하게 DB에 접속하여 데이터의
//CRUD작업을 시행하는 클래스, 즉 DAO는 DB를 사용하여 데이터의 조회 및 조작하는 기능을 전담
public class MemoDAO {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public int insertMemo(MemoVO memo) throws SQLException{
		try {
			con=DBUtil.getCon();
			//String : immutable (불변성) 원본은 변하지 않음. + (문자열결합)
			//StringBuilder, StringBuffer : 문자열을 메모리 버퍼에 넣고 수정,삭제,삽입 등의 편집작업을 할 수 있음
			StringBuilder buf=new StringBuilder("insert into memo(idx,name,msg,wdate) ")
							      .append(" values(memo_seq.nextval, ?, ?, sysdate)");
			//String에 StringBuilder를 그대로 넣을 순 없다. toString()을 붙여야 한다
			String sql=buf.toString(); //두 println()은 같은 값을 출력한다
			ps=con.prepareStatement(sql);
			ps.setString(1, memo.getName());
			ps.setString(2, memo.getMsg());
			int n=ps.executeUpdate();
			return n;
		}finally {//finally 구문은 예외처리가 발생여부를 떠나 무조건 실행하도록 하는 구문입니다.
			close();
		}
	}//----------------------------------
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}catch(SQLException e) {
		}
	}//--------------------------------
	public List<MemoVO> selectMemoAll() throws SQLException {
		try {
			con=DBUtil.getCon();
			StringBuilder buf=new StringBuilder("select idx, rpad(name,12,' ') name, rpad(msg,100,' ') msg,")
							.append(" wdate from memo order by idx desc");
			String sql=buf.toString();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			List<MemoVO> arr=makeList(rs);
			return arr;
		}finally {
			close();
		}
	}//--------------------------------
	
	private List<MemoVO> makeList(ResultSet rs) throws SQLException {
		List<MemoVO> arr=new ArrayList<>();
		while(rs.next()) {
			int idx=rs.getInt("idx");
			String name=rs.getString("name");
			String msg=rs.getString("msg");
			java.sql.Date wdate=rs.getDate("wdate");
			MemoVO vo=new MemoVO(idx,name,msg,wdate);
			arr.add(vo);
		}//while----
		return arr;
	}//--------------------------------
	public int deleteMemo(int idx) throws SQLException {
		try {
			con=DBUtil.getCon();
			String sql="delete from memo where idx=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, idx);
			return ps.executeUpdate();			
		}finally {
			close();
		}
	}//-----------------------------------
	public MemoVO selectMemo(int idx) throws SQLException{
		try {
			con=DBUtil.getCon();
			String sql="select idx,name,msg,wdate from memo where idx=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, idx);
			rs=ps.executeQuery();
			List<MemoVO> arr=makeList(rs);
			if(arr!=null && arr.size()==1) {
				return arr.get(0);
			}
			return null;
		}finally {
			close();
		}
	}//-----------------------------------
	
	//update문 
	public int updateMemo(MemoVO vo) throws SQLException{
		try {
			con=DBUtil.getCon();
			StringBuilder buf=new StringBuilder("update memo set name=?, msg=? ")
											.append(" where idx=?");
			String sql=buf.toString();
			ps=con.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getMsg());
			ps.setInt(3, vo.getIdx());
			return ps.executeUpdate();
		}finally {
			close();
		}
	}//------------------------------------
	
	public List<MemoVO> findMemo(int type, String keyword) throws SQLException {
		try {
			con=DBUtil.getCon();
			String colName=(type==0)?"name":"msg";
			//String sql = "SELECT * FROM memo WHERE msg like '%"+keyword+"%' order by idx desc";
			StringBuilder buf=new StringBuilder("select idx,name,msg,wdate from memo")
					.append(" where "+colName+" like ?");
			String sql=buf.toString();
			ps=con.prepareStatement(sql);
			ps.setString(1, "%"+keyword+"%");
			rs=ps.executeQuery();
			List<MemoVO> arr=makeList(rs);
			return arr;
		}finally {
			close();
		}
	}//------------------------------------

}////////////////////////////////













