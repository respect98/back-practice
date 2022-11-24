package day08;
/*
 * try블럭 하나에 catch블럭을 여러 개 사용할 수 있다.
 * 이 때 주의사항. 자식 예외를 먼저 catch하고
 * 부모 예외를 나중에 catch해야 한다
 * */
public class ExceptionTest4 {

	public static void main(String[] args) {
		try {	
		String num=args[0];//명령줄 인수
		String num2=args[1];
		//java day08.ExceptionTest4 안녕 하이 
		System.out.println("num: "+num);
		System.out.println("num2: "+num2);
		
		int n1=Integer.parseInt(num);
		int n2=Integer.parseInt(num2);
		System.out.println(n1/n2);
		String str="null";
		System.out.println(str.toUpperCase());
		
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("명령줄 인수를 2개 줘야 해요");
			System.out.println("java day08.ExceptionTest4 10 20");
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
			System.exit(0);//종료시에는 finally블럭은 수행되지 않는다.
		}catch(ArithmeticException e) {
			System.out.println("0을 입력해선 안돼요");
			return;
		}catch(Exception e) {
			System.out.println("기타 예상치 못한 예외 발생: "+e);
		}finally {
			System.out.println("반드시 실행되어야 할 코드*************");
			//finally절은 반드시 한번은 수행하는 블럭이다.
			//return문이 있더라도 반드시 수행하는 제어권을 넘긴다
		}
		System.out.println("The End~~~~~~~~~~~~~~~~~~~~~~~");
		
		
	}

}
