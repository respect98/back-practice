package day02;
import javax.swing.JOptionPane;
public class ForTest {

	public static void main(String[] args) {
		/*
		 * for(변수선언문; 조건식; 증감식){
		 * 실행문;
		 * }
		 */
		
		for(int i=1; i<=3; i++) {//i변수는 지역변수. i의 scope는 for블럭까지이다.
			System.out.println("Hello "+i);
		}
//		System.out.println(i); [x]
		for(int i=10; i>0; i-=3) {
			System.out.println("Java: "+i);
		}
		int j=10;//j의 scope는 main
		for(;j<100; j+=5) {
			System.out.println("Hi: "+j);
		}
		System.out.println("j: "+j);
		
//		for(;;) { //무한루프
//			System.out.println("무한루프 돕니다~~");
//		}
	
	}//main()---------------

}
