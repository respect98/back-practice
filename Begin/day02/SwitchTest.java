package day02;
import javax.swing.JOptionPane;
public class SwitchTest {

	public static void main(String[] args) {
		//월을 입력하세요(1~12)
		//일수를 알려주는 프로그램
		//1: 31일 2: 28일 또는 29일
		/*
		 * switch(변수|수식){
		 *  case 값1: 실행문; break;
		 *  case 값2: 실행문; break;
		 *  ...
		 *  default: 실행문;
		 *  }
		 *  이때 변수 또는 수식은 int형 이하의 자료형이거나 String유형만 가능하다
		 */
		
//		int a=2;
//		switch(a) {
//		case 1: System.out.println("One"); break;
//		case 2: System.out.println("Two"); break;
//		}
		
		String month = JOptionPane.showInputDialog("월을 입력하세요(1~12)");
		switch(month) {
		case "1": System.out.println("31일"); break;
		case "2": System.out.println("29일"); break;
		case "3": System.out.println("31일"); break;
		case "4": System.out.println("30일"); break;
		case "5": System.out.println("31일"); break;
		case "6": System.out.println("30일"); break;
		case "7": System.out.println("31일"); break;
		case "8": System.out.println("31일"); break;
		case "9": System.out.println("30일"); break;
		case "10": System.out.println("31일"); break;
		case "11": System.out.println("30일"); break;
		case "12": System.out.println("31일"); break;
		default: 
			System.out.println("1~12월까지만 입력해야 합니다");
			return;
		}
	}
}