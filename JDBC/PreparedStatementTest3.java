package day03;
import java.sql.*;
import java.util.Scanner;

import common.DBUtil;
public class PreparedStatementTest3 {

	public static void main(String[] args) throws Exception{
		Connection con=DBUtil.getCon();
		//검색할 사원의 이름을 입력받아서 해당 사원정보를 출력하세요
		//사번, 사원명, 부서명, 담당업무, 입사일, 근무지 가져와 출력하기
		 Scanner sc = new Scanner(System.in);
	     System.out.println("검색할 이름을 입력하세요");	       
	     String name = sc.nextLine();
	      
	        String sql =  "select empno, ename, e.deptno , job , hiredate ,d.loc";
	        		sql +=" from emp e join dept d on e.deptno = d.deptno";
	        		sql +=" where ename = upper(?)";
	        		
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, name);
        ResultSet rs=ps.executeQuery();
        int cnt=0;
        while(rs.next()) {
        	cnt++;
        	int empno=rs.getInt(1);
        	String ename=rs.getString(2);
        	int dno=rs.getInt(3);
        	String job=rs.getString(4);
        	Date hdate=rs.getDate(5);
        	String loc=rs.getString(6);
        	System.out.println(empno+"\t"+ename+"\t"+dno+"\t"+job+"\t"+hdate+"\t"+loc);
        }//-------------------
        if(cnt==0)
        	System.out.println("검색한 사원은 없습니다");
        
        rs.close();
        ps.close();
		con.close();
	}

}
