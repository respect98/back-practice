package day02;
/*Reference Type(참조형)
 * [1] 클래스형
 * [2] 인터페이스형
 * [3] 배열
 * -참조형은 반드시 new 연산자로 객체를 생성해서 사용해야 한다.
 * 	다만 예외는 있다. String의 경우 자주 사용하기 때문에
 * 	기본자료형처럼 문자열값(literal)을 직접 할당하도록 하고 있다.
 * 	Integer, Float, Double, Character 얘네도 마찬가지
 * */
import java.util.Date;
public class Reference {
	public static void main(String[] args) {
		Date today = new Date(); //객체를 생성해서 그 객체를 today변수 이름으로 참조한다
		System.out.println(today);
		
		String str=new String("Hello");
		System.out.println(str);
		
		String str2="JAVA";
		
		Integer i =100; //클래스유형 Wrapper클래스
		Integer i2= new Integer(100);
		System.out.println(i);
		System.out.println(i2);
		
		String str3=new String("World~");
		//String의 경우 + 연산자를 이용하면 =>문자열 결합이 일어난다.
		
		System.out.println(str+str3);
		System.out.println(true+"");
		int m=20;
		int n=30;
		System.out.println(m+n+"<=합");
		System.out.println("합=>"+(m+n));
		
		
	}
}
