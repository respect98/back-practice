package day09;
import java.util.*;
public class VectorTest2 {

	public static void main(String[] args) {
		// [1] Person객체 3개 생성하세요
		// [2] Person을 저장할 Vector를 생성하고 3개 객체 저장하기
		// [3] for루프 이용해서 벡터에 저장된 Person의 이름과 나이를 출력하세요
		Person p1 = new Person("홍길동",20);
		Person p2 = new Person("콩순이",12);
		Person p3 = new Person("김아무개",24);
		Person p4 = new Person("김수지",22);
		Vector<Person> p = new Vector<>(10,5);
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		for(int i=0; i<p.size(); i++) {
			Person ps=p.get(i);
			System.out.println(ps.getName()+": "+ps.getAge()+"세");
		}
		//Enumeration<E> elements()
		//Iterator<E> iterator()
		
		/*Enumeration<E> elements()
		 * : 벡터에 저장된 객체들을 한꺼번에 꺼내오고자 할 때 사용.
		 * Enumeration과 Iterator인터페이스는 객체들을 집합체로
		 * 관리하도록 해주는 인터페이스이다.
		 * 이들 인터페이스에서는 각각의 객체들을 한 순간에 하나씩
		 * 처리할 수 있는 메소드를 제공한다.
		 * # Enumeration의 경우**********************************
		 * 	- boolean hasMoreElements() : 논리적 커서(첫번째 요소 직전에
		 * 				위치) 이후에 요소들이 있는지 물어서 있으면true
		 * 				없으면 false를 반환
		 *  - E nextElement(): 논리적 커서를 다음 요소로 이동하고
		 *  			현재 가리키고 있는 요소를 반환한다.
		 * # Iterator의 경우**************************************
		 * 	- boolean hasNext()
		 *  - E next() 
		 * */
		System.out.println("----------------");
		Enumeration<Person> en = p.elements();
		
		while(en.hasMoreElements()) {
			Person ps = en.nextElement();
			System.out.println(ps.getName());
		}
		System.out.println("*******************");
//		while(en.hasMoreElements()) {
//			Person ps = en.nextElement();
//			System.out.println(ps.getName());
//		}
		
		//Iterator<E> iterator()메서드 활용해서 p의 요소들 이름#나이 출력하기
		
		Iterator<Person> ip = p.iterator();
		for(int i=1;ip.hasNext();i++) {
			Person ps = ip.next();
			System.out.println(i+": "+ps.getName()+"#"+ps.getAge());
		}
		//벡터에 저장된 요소들을 배열로 카피해보자
		//void copyInto(Object[] anArray)
		Person[] arr = new Person[p.size()];
		p.copyInto(arr);
		
		for(Person a:arr) {
			System.out.println(a.getName());
		}
		
		
		//void removeAllElements()
		//void clear()
		//벡터에 저장된 객체 모두 지우기
		p.clear();
		System.out.println("--Clear 이후-------");
		for(Person ps:p) {
			System.out.println(ps.getName());
		}
	}

}
