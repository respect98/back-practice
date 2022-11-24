package day01;
//클래스명과 파일명은 같아야한다. 대소문자까지도 같아야한다.
//클래스명: VarTest 파일명: VarTest.java

public class VarTest {
	int global; // 인스턴스변수(instance variable)=> 기본값(0)이 할당된다.
	
	//main 작성하기(main 메서드)
	public static void main(String[] args) {
		//변수(variable, field, property)
		//변수선언
		//자료형 변수명;
		int num1=10;//선언 및 초기화
		int num2; //선언(지역변수)
		//지역변수는 반드시 초기화하고 사용해야 한다.
		int num3=0; 
		num2=20;//초기화
		System.out.printf("num1=%d, num2=%d%n", num1, num2);
		
		//덧셈식 출력하기  +,-,*,/,%
		//곱셈식 출력하기
		System.out.printf("%d+%d=%d%n",num1,num2,(num1+num2));
		System.out.printf("%d*%d=%d%n",num1,num2,(num1*num2));
		System.out.println("num3: "+num3);
		
		/*명명규칙
		 * 1) 명사형, 소문자, 카멜표기법
		 * 2) 숫자로 시작하면 안된다. 영문자로 시작
		 * 3) 특수문자 사용 불가(예외 _ , $)
		 * 4) 예약어 사용불가
		 */
		int wordCount=5;
		int word_count=7;
//		int 1num=1; [x]
		int _a=10;
		int $$$=100;
//		int ###=200; [x]
		int 한글=9;
//		int class=7; [x]
		int _class=7;
	}
}
