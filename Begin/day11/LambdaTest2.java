package day11;
/*함수형 인터페이스를 선언하세요
 * -문자열 2개를 매개변수로 받으면 두 문자열을 연결하여 반환하는 메서드로 만들려고 한다
 * 인터페이스명: StringConcat
 * 추상메서드명: makeString(s1,s2) 4.3041
 * -람다식 이용해서 구현해보기
 * */

@FunctionalInterface
interface StringConcat{
	String makeString(String s1,String s2);
}

public class LambdaTest2 {

	public static void main(String[] args) {
		int local=100; //지역변수
		StringConcat sc=(s1,s2)->{
			//local=200; [x]
			//지역변수는 람다식 내부에서 변경하면 에러남. final변수 이므로
			System.out.println("local: "+local);
			return s1+" "+s2;
		};
		System.out.println(sc.makeString("Hello", "Lambda"));
		
		StringConcat sc2=(x,y)->{
			return x.toUpperCase()+" "+y.toUpperCase();
		};
		System.out.println(sc2.makeString("hi", "java"));
		
		StringConcat sc3=(a,b)-> a.toLowerCase()+" "+b.toLowerCase();
		System.out.println(sc3.makeString("GOOD", "Bye"));
		
	}

}
