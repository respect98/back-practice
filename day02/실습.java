package day02;
import javax.swing.JOptionPane;
public class 실습 {

	public static void main(String[] args) {
		System.out.println("-----------Menu-----------");
		System.out.println("1. 가정용 (liter당 50원)");
		System.out.println("2. 상업용 (liter당 45원)");
		System.out.println("3. 공업용 (liter당 30원)");
		System.out.println("--------------------------");
		String menu =JOptionPane.showInputDialog("메뉴를 선택하세요=>");
		String use = JOptionPane.showInputDialog("사용량을 입력하세요=>");
		
		int liter;
		switch(menu) {
		case "1" : liter = 50;
		break;
		case "2": liter= 45;
		break;
		case "3": liter= 30;
		break;
		default: System.out.println("1~3의 숫자만을 입력해주세요");
		return;
}		
		int oiluse = Integer.parseInt(use);
		int fee = (liter*oiluse);
		int tax = (int)(fee*0.05);
		int total = fee + tax;
		System.out.println("메뉴번호: "+menu);
		System.out.println("사용량: "+use+" liter");
		System.out.println("수도요금: "+fee+"원");
		System.out.println("세 금: "+tax+"원");
		System.out.println("총수도요금: "+total+"원");
	}
}
