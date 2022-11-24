package chapter03;

public class Ex3_08 {

	public static void main(String[] args) {
		int a = 1_000_000; //1백만
		int b = 2_000_000; //2백만
		
		long c = a*b; //2,000,000,000,000 ? no int * int의 연산 결과는 int임
		
		System.out.println(c);
		
		long d = (long)a*b;
		System.out.println(d);
	}

}
