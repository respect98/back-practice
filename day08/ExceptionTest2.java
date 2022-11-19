package day08;
//for루프 바깥에서 예외처리해보기
public class ExceptionTest2 {

	public static void main(String[] args) {
		try {
		for(int i=1; i<=5; i++) {
			int a=50/(i-3);
			System.out.println("a: "+a);
		}
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어요");
		}
		System.out.println("The End~~~~~~~~~~");

	}

}
