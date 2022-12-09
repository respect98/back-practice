package day04;
import java.util.Scanner;

import common.DBUtil;
import day02.MemoVO;
import java.sql.*;
/*
create or replace procedure memo_edit(
pidx in memo.idx%type,
pname in memo.name%type,
pmsg in memo.msg%type
)
is
begin
    update memo set name=pname, msg=pmsg where idx=pidx;
end;
/
 * */
public class CallableStatementTest2 {

	public static void main(String[] args) throws Exception{
		/*메모글을 수정하는 memo_edit프로시저를 호출하는 jdbc를 구현하세요
		 * */
		Scanner sc=new Scanner(System.in);
		System.out.println("글번호를 입력해주세요:");
		int idx = sc.nextInt();
		sc.skip("\r\n");
		System.out.println("사용자명 :");
		String name = sc.nextLine();
		System.out.println("메세지를 입력해주세요 :");
		String msg = sc.nextLine();
		System.out.println(idx+"/"+name+"/"+msg);
		MemoVO vo=new MemoVO(idx, name,msg,null);
		Connection con=DBUtil.getCon();
		String sql="{call memo_edit(?,?,?)}";
		
		CallableStatement cs=con.prepareCall(sql);
		cs.setInt(1, vo.getIdx());
		cs.setString(2, vo.getName());
		cs.setString(3, vo.getMsg());
		int n=cs.executeUpdate();
		System.out.println("메모글 수정 완료!!"+n);
		cs.close();
		con.close();
	}
}
