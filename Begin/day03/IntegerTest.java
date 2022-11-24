package day03;
/*
 * java.lang 패키지 Wrapper 클래스
 * -----------------------------
 * 기본자료형			클래스형
 * byte				Byte
 * short			Short
 * char				Character
 * int				Integer
 * long				Long
 * float			Float
 * double			Double
 * boolean			Boolean
 * ----------------------------
 * */
public class IntegerTest {

	public static void main(String[] args) {
		//java.lang.Integer클래스
//		final static int	MAX_VALUE: 정수형의 최대값
//		final static int	MIN_VALUE: 최소값
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//125의 이진수 값을 반환하는 메서드를 찾아 출력하세요
		//static String	toBinaryString(int i)
		//125의 8진수 값을 반환하는 메서드를 찾아 출력하세요
		//static String	toOctalString(int i)
		//125의 16진수 값을 반환하는 메서드를 찾아 출력하세요
		//static String	toHexString(int i)
		int i=125;
		String s1 = Integer.toBinaryString(i);
		System.out.println(s1);
		String s2 = Integer.toOctalString(i);
		System.out.println(s2);
		String s3 = Integer.toHexString(i);
		System.out.println(s3);
		//static int parseInt(String str)
		
		Integer in = new Integer(120); //deprecated
		//static Integer	valueOf(int i)
		Integer in2 = Integer.valueOf(120);
	}

}
