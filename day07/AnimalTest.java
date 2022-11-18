package day07;
import javax.swing.*;
public class AnimalTest {

	public static void main(String[] args) {
		String type = JOptionPane.showInputDialog("동물 종류 입력");
		String count=JOptionPane.showInputDialog("새끼 수 입력");
		int baby = Integer.parseInt(count);
		if(type==null || count==null) return;

		Animal an =null;
		if(type.equals("강아지")) {
			an=new Dog();
		}else if(type.equals("고양이")) {
			an=new Cat();
		}else if(type.equals("오리")) {
			an=new Duck();
		}else {
			System.out.println("그런 동물 안키워요~~");
			return; // 밑으로 흘러내리지 않게
		}
		an.crySound();
		an.getBaby(baby);
		
		
		
		
		// == : 기본자료형에서는 값을 비교
		//	  : 참조형에서는 주소값을 비교
		// Object의 equals()메서드 : 원래 주소값을 비교한다
		// boolean equals(Object obj)
		// boolean equals(Object anObject)
		// :String 클래스에서 equals()메서드 : 문자열의 내용 비교로 재정의 되었다.
		// :문자열 클래스에서
//		if(type=="강아지") {
//			Dog d=new Dog();
//			d.crySound();
//			d.getBaby(baby);..[x]
//		}
//		

		
		

	}

}
