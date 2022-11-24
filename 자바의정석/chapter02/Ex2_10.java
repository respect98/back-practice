package chapter02;

public class Ex2_10 {

	public static void main(String[] args) {
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;
		
		System.out.printf("      123456789012345678901234%n");
		System.out.printf("f: %f%n",f);//소숫점 이하 6째자리 까지 출력. f: 9.123457;
		System.out.printf("f: %24.20f%n",f);
		System.out.printf("f2: %24.20f%n",f2);
		System.out.printf("d: %24.20f%n",d);
	}

}
