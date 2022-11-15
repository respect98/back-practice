package day03;

public class WhileTest {

	public static void main(String[] args) {
		/*변수선언문
		 * while(조건식){
		 * 		실행문;
		 * 		증감식;
		 * } 
		 */
		int i=1;
		while(i<5) {
			System.out.println("Hello: "+i);
			i++;
		}//while-----
		
		i=7;
		while(i>0) {
			System.out.println("Java: "+i);
			i-=3;
		}
		System.out.println("The End~~~~~");
		
//		for(,,){}
//		while(true) {
//			System.out.println("무한루프 돕니다~~~~~");
//		}
		
		
		
	}//main()----------------

}//class------------------------------
