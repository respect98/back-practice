package day10;
import java.util.*;
public class HashSetTest2 {

	public static void main(String[] args) {
		// Person객체 3개 생성해서
		// HashSet에 저장한 뒤
		// 반복문 이용해서 사람 정보를 출력하세요(이름,나이)
		Person p1 = new Person("홍길동",22);
		Person p2 = new Person("박완규",33);
		Person p3 = new Person("아무개",44);
		
		HashSet<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		for(Person p: set) {
			System.out.println(p.getName()+","+p.getAge());
		}
		System.out.println("***************");
		Person p4 = new Person("김철수",12);
		set.add(p4);
		Person p5=p1;
		set.add(p5);
		System.out.println("set.size(): "+set.size());
		
		for(Person p: set) {
			System.out.println(p.getName()+","+p.getAge());
		}
		

	}

}
