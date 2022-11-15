package day03;
import java.util.*;
public class Test {
	//사용자정의 메서드
	//[1] static 메서드 (클래스 메서드)		: "클래스명.메서드()" 식으로 접근
	//[2] non-static 메서드 (인스턴스 메서드)  : 객체를 먼저 생성한 다음 "객체명.메서드()"식으로 접근
	
	public static void showMenu() {
		System.out.println("-------------------------");
		System.out.println("1. 가정용(liter당 50원)");
		System.out.println("2. 상업용(liter당 45원)");
		System.out.println("3. 공업용(liter당 30원)");
		System.out.println("--------------------------");
		System.out.println(">>메뉴 번호를 입력하세요 =>");
		System.out.println("--------------------------");
	}//show Menu-------
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Test.showMenu();
		int num=sc.nextInt();
//		System.out.println(num);
		if(num<1 || num>3) {
			System.out.println("입력오류!! 메뉴에 없는 번호에요");
			return;
		}
		System.out.println(">>사용량을 입력하세요 =>");
		int use=sc.nextInt();

		
		int price =1;
		String str="";
		switch(num) {
		case 1: 
			price=50;
			str="가정용";
			break;
		case 2: 
			price=45;
			str="상업용";
			break;
		case 3: 
			price=30;
			str="공업용";
			break;		
		}
		
		int fare=use*price;
		double tax=fare*0.05;
		
		System.out.println("--------------------------");
		System.out.println("메뉴번호: "+num+"("+str+")");
		System.out.println("사 용 량: "+use+" liter");
		System.out.println("수도요금: "+fare+"원");
		System.out.println("세   금: "+(int)tax+"원");
		System.out.println("총수도요금: "+(fare+(int)tax)+"원");
		System.out.println("--------------------------");
		
		
		
		
		
	}// main--------
	
}// class---------