package day10;

import java.util.*;

public class HashMapTest {
	// 회원의 (아이디==비밀번호) 저장
	HashMap<String, String> map = new HashMap<>();

	public void join() {
		map.put("hong", "123");
		map.put("choi", "abc");
		map.put("admin", "tiger");
		System.out.println(">>> 회원가입 완료 <<<");
	}// ---------------------------

	public void loginCheck() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("아이디: ");
			String userid = sc.next();
			System.out.println("비밀번호: ");
			String pwd = sc.next();
			
			boolean b = map.containsKey(userid);
			if(!b) {//없는 아이디인 경우
				System.out.println(userid+"는 없는 아이디입니다");
				continue;
			}else {
				String realPwd=map.get(userid);
				boolean b2=realPwd.equals(pwd);
//				boolean b2=map.containsValue(pwd);[x]
				if(!b2) {
					System.out.println("비밀번호가 틀립니다");
					continue;
				}
				if(userid.equals("admin")) {
					System.out.println("관리자 모드를 이용할 수 있습니다");
					
				}else {
					//일반 유저인 경우
					System.out.println("환영합니다"+userid+"님~~~");
				}
				break;
				
			}//else---------------------

			/*입력한 값이 map에 저장되어 있는지 체크
			 * 1) 해당 아이디가 map에 저장되어 있는지 검사
			 * 		(a) 없다면=> "없는 아이디입니다"
			 * 		(b) 있다면
			 * 				 	=> 비밀번호 체크
			 * 
			 * 					=>비밀번호 일치하면
			 * 					 [1] 일반 유저 =>환영메세지 보여주기
			 * 					 [2] 관리자면 => 관리자 모드를 이용할 수 있어요
			 * 				    =>반복문 벗어나기
			 * 
			 * 					=>비밀번호 불일치하면 => "비밀번호가 틀려요"
			 * 					=>반복문 계속수행
			 * */
			
		}//while--------------------
	}// ----------------------------

	public static void main(String[] args) {

		HashMapTest hm = new HashMapTest();
		hm.join();
		hm.loginCheck();
	}

}
