package user.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import common.util.DBUtil;
import user.model.*;

public class UserDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public UserDAO() {
//		System.out.println("userDAO생성자()...");
	}

	public UserVO loginCheck(String userid, String pwd) throws SQLException, NotUserException {
		try {
			con = DBUtil.getCon();
			UserVO user = this.selectUserbyUserid(userid);
			if (user == null) {//아이디가 없는 경우 => 예외 발생
				throw new NotUserException(userid+"란 아이디는 존재하지 않아요");
			}
			//비밀번호 일치여부를 체크
			String dbPwd=user.getPwd();
			if(!dbPwd.equals(pwd)) {//비번이 틀린 경우 => 예외발생
				throw new NotUserException("비밀번호가 일치하지 않아요");
			}
			return user;//아이디와 비번이 일치한 경우 user를 반환
		} finally {
			close();
		}
	}
	/*
	 *  --system으로 접속해서 multi에게 view생성 권한 부여
		grant create view, create synonym to multi;
		--status값이 -1보다 큰 회원들만 모아서 memberView를 생성하자
		create or replace view memberView
		as
		select member.*, decode(status,0,'활동회원',-1,'정지회원',-2,'탈퇴회원',9,'관리자') statusStr
		from member where status>-2;
		
		select * from memberView order by idx desc;
		*/
	// userid=>unique한 값
	private UserVO selectUserbyUserid(String userid) throws SQLException {
		try {
			con = DBUtil.getCon();
			//String sql = "select member.*, decode(status,0,'활동회원',-1,'정지회원',-2,'탈퇴회원') statusStr from member where userid=?";
			String sql="select * from memberView where userid=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, userid);
			rs = ps.executeQuery();
			List<UserVO> arr = makeList(rs);
			if (arr != null && arr.size() == 1) {
				UserVO user = arr.get(0);
				return user;
			}
			return null;
		} finally {
			close();
		}
	}

	public boolean idCheck(String userid) throws SQLException {
		try {
			con = DBUtil.getCon();
			StringBuilder buf = new StringBuilder("select idx from member where userid=?");
			String sql = buf.toString();
			ps = con.prepareStatement(sql);
			ps.setString(1, userid);
			rs = ps.executeQuery();

			boolean b = rs.next(); // b가 true면 해당 아이디가 있다는 얘기=> false를 반환, false면 해당 아이디가 없다는 얘기=> true반
			return !b;

		} finally {
			close();
		}
	}

	public int insertUser(UserVO user) throws SQLException {
		try {
			con = DBUtil.getCon();
			StringBuilder buf = new StringBuilder("insert into member ")
					.append(" values(member_seq.nextval,?,?,?,?,?,?,?,?,?,sysdate,1000,0)");
			String sql = buf.toString();
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setString(2, user.getUserid());
			ps.setString(3, user.getPwd());
			ps.setString(4, user.getHp1());
			ps.setString(5, user.getHp2());
			ps.setString(6, user.getHp3());
			ps.setString(7, user.getPost());
			ps.setString(8, user.getAddr1());
			ps.setString(9, user.getAddr2());

			return ps.executeUpdate();
		} finally {
			close();
		}
	}// ----------------------------------

	public List<UserVO> listUser() throws SQLException {
		try {
			con = DBUtil.getCon();
			StringBuilder buf = new StringBuilder("select member.*,")
					.append(" decode(status,0,'활동회원',-1,'정지회원',-2,'탈퇴회원') statusStr")
					.append(" from member order by idx desc");
			String sql = buf.toString();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			List<UserVO> arr = makeList(rs);
			return arr;
		} finally {
			close();
		}

	}// ---------------------------------------------------------
	public UserVO selectUserByIdx(int idx)throws SQLException{
		try {
			con=DBUtil.getCon();
			//String sql = "select member.*, decode(status,0,'활동회원',-1,'정지회원',-2,'탈퇴회원') statusStr from member where idx=?";
			String sql="select * from memberView where idx=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, idx);
			rs=ps.executeQuery();
			List<UserVO> arr = makeList(rs);
			if(arr==null || arr.size()==0) {
				return null;
			}
			UserVO user = arr.get(0);
			return user;
		}finally {
			close();
		}
	}
	
	private List<UserVO> makeList(ResultSet rs) throws SQLException {
		List<UserVO> arr = new ArrayList<>();
		while (rs.next()) {
			int idx = rs.getInt("idx");
			String name = rs.getString("name");
			String userid = rs.getString("userid");
			String pwd = rs.getString("pwd");
			String hp1 = rs.getString("hp1");
			String hp2 = rs.getString("hp2");
			String hp3 = rs.getString("hp3");
			String post = rs.getString("post");
			String addr1 = rs.getString("addr1");
			String addr2 = rs.getString("addr2");
			java.sql.Date indate = rs.getDate("indate");
			int mileage = rs.getInt("mileage");
			int status = rs.getInt("status");
			String statusStr = rs.getString("statusStr");
			UserVO user = new UserVO(idx, name, userid, pwd, hp1, hp2, hp3, post, addr1, addr2, indate, mileage,
					status, statusStr);
			arr.add(user);
		}

		return arr;

	}//----------------------------------------
	
	public int updateUser(UserVO user) throws SQLException {
		try {
			con=DBUtil.getCon();
			StringBuilder buf=new StringBuilder("update member set name=?, userid=?, pwd=?, hp1=?, hp2=?, hp3=?,")
					.append(" post=?, addr1=?, addr2=?, status=? where idx=?");
			String sql=buf.toString();
			ps=con.prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setString(2, user.getUserid());
			ps.setString(3, user.getPwd());
			ps.setString(4, user.getHp1());
			ps.setString(5, user.getHp2());
			ps.setString(6, user.getHp3());
			ps.setString(7, user.getPost());
			ps.setString(8, user.getAddr1());
			ps.setString(9, user.getAddr2());
			ps.setInt(10, user.getStatus());
			ps.setInt(11, user.getIdx());
			return ps.executeUpdate();			
		}finally {
			close();
		}
		
	}//--------------------------------------------------

	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			System.out.println("close() error: " + e);
		}
	}
}
