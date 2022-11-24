package day09;
import java.util.*;
/*ArrayTest
 * - java.util.List 계열
 * - Vector와 기능은 동일
 * - Vector는 메서드들이 동기화가 구현되어 있는 반면,
 * - ArrayList는 동기화되어 있지 않음 => 가볍다 => 웹에서 주로 사용
 * */
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("Java");
		arrList.add("HTML");
		arrList.add("CSS");
		System.out.println(arrList.size()+"개 저장");
		
		//iterator()메서드 이용해서 한꺼번에 출력하기
		Iterator<String> s = arrList.iterator();
		for(int i=1; s.hasNext(); i++) {
			String p=s.next();
			System.out.println(i+" "+p);
		}
		
//		Object[] toArray();
		Object[] arr= arrList.toArray();
		for(Object obj: arr) {
			System.out.println(obj);
		}
		String str = arrList.get(2);
		System.out.println(str);
		
		Collections.sort(arrList);
		System.out.println("sort이후--------------");
		s=arrList.iterator();
		for(int i=1; s.hasNext(); i++) {
			String p = s.next();
			System.out.println(i+": "+p);
		}
		
		//List<T> Arrays.asList(T...)
		//매개변수로 전달된 객체들을 ArrayList에 담아서 반환해주는 메서드
		
		List<Person> list =Arrays.asList
				(new Person("김철수",22), new Person("최연희",21), new Person("홍길동",23));
		
		/*List<Person> arrList2=new ArrayList<>();
		arrList2.add(new Person("김철수",22));
		arrList2.add(new Person("최연희",22));
		arrList2.add(new Person("김철수",22));
		arrList2.add(new Person("김철수",22));
		 */
		
		System.out.println("list.size(): "+list.size());
		for(Person p:list) {
			System.out.println(p.getName()+"#"+p.getAge());
		}
		Iterator<Person> it = list.iterator();
		
		//beforeFirst()
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName());
		}
		//afterLast()
		
	}

}
