package day10;

import java.util.*;

//순차적으로 데이터 저장: ArrayList를 사용하는 것이 좋고
//중간에 삽입하거나 삭제해야 할때는 LinkedList를 사용하는 것이 좋다
public class LinkedListTest {

	public static void main(String[] args) {
		// FIFO구조: First in First Out
		List<String> list1 = new LinkedList<>();

		Queue<String> list2 = new LinkedList<>();

		list1.add("Hi");
		list1.add("Allo");
		list1.add("Bye");

		list2.offer("JSP");
		list2.offer("Servlet");
		list2.offer("Spring");

		System.out.println(list1.get(0));

		Iterator<String> it = list1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Iterator<String> it2 = list2.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		list1.add(1, "Hello");
		System.out.println("********************");
		it = list1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		LinkedList<String>lst=((LinkedList)list2);
		lst.addFirst("Java");//맨 앞에 요소를 추가
		lst.addLast("Weka");//맨 마지막에 요소 추가
		
		it2=list2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		String str=lst.poll();//첫번째 요서를 삭제하고 삭제한 요소를 반환
		System.out.println(str.toLowerCase());
		
		lst.remove(2);
		System.out.println("----------------------");
		it2=list2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		//lst.removeFirst(), lst.removeLast()
		//pollFirst(), pollLast()
		
		List<String> arr= Arrays.asList("Bon jour","Good Morning");
		//ArrayList를 반환
		list1.addAll(arr);
		it = list1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
