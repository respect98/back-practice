package day07;

public class EqualsTest {

	public static void main(String[] args) {
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3=o2;
		
		System.out.println("o1.equals(o2): "+o1.equals(o2));
		System.out.println("o3.equals(o2): "+o3.equals(o2));
		
		String s1 = new String("Hi");
		String s2 = new String("Hi");
		
		String s3="Hi";
		String s4="Hi";
		
		System.out.println("s1==s2: "+(s1==s2)); //주소값 비교
		System.out.println("s1.equals(s2): "+s1.equals(s2)); //내용 비교=> override
		
		//s3,s4 ==, equals()
		System.out.println("s3==s4: "+(s3==s4));
		System.out.println("s3.equals(s4): "+s3.equals(s4));
		
		
	}

}
