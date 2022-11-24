package chapter02;

public class Ex2_11 {

	public static void main(String[] args) {
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n",f); //9.123457
		System.out.printf("%X%n", i);//16진수로 출력

	}

}
