package chapter03;

public class Ex3_13 {

	public static void main(String[] args) {
		char c1 = 'a';
		
//		char c2 = c1+1; //라인 5: 컨파일 에러발생!! => char c2 = (char)(c2+1);해야 컴파일 오류 사라짐
		char c2 = 'a'+1; //라인 6: 컴파일 에러 없음 => 형변환 안했는데 에러가 없는 이유는 리터럴간의 연산이기 때문
		//리터럴과 상수는 실행과정동안 변하는 값이 아니기 때문에 컴파일시 컴파일러가 대체해줌. 변수가 들어가면 컴파일러가 미리 계산할 수 없기
		//때문에 라인 5처럼 에러가 발생하여 형변환이 필요한것이다
		
		System.out.println(c2);

	}

}
