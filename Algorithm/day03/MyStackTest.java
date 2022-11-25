package day03;
import common.*;
public class MyStackTest {

	public static void main(String[] args) {
		MyStack<String> sk1=new MyStack<>();
		sk1.push("Java");
		sk1.push("JDBC");
		sk1.push("Oracle");
		sk1.push("MongoDB");
		
		System.out.println(sk1.peek());
		String item=sk1.pop();
		System.out.println("삭제된 데이터: "+item);
		System.out.println(sk1.peek());
		sk1.pop();
		sk1.pop();
		System.out.println(sk1.peek());
		sk1.pop();
		System.out.println(sk1.isEmpty());
//		sk1.pop();
		
		MyStack<Integer> sk2 = new MyStack<>();
		sk2.push(10);
		sk2.push(20);
		System.out.println(sk2.peek());
		
		//Member 객체 3개 생성해서 스택에 저장해보세요
		MyStack<Member> sk3= new MyStack<>();
		Member m1= new Member("홍길동",26,178);
		Member m2= new Member("고길동",45,168);
		Member m3= new Member("금길동",22,182);
		
		sk3.push(m1);
		sk3.push(m2);
		sk3.push(m3);
		
		//반복문 이용해서 회원정보 한꺼번에 출력해보세요
		
		while(!sk3.isEmpty()) {
			System.out.println(sk3.pop().toString());
		}
		
	}

}
