package day02;
//java11버전 이후 : java.base모듈만 사용 가능함(java.lang, java.util, java.io, java.net)
import javax.swing.JOptionPane; //=> java.desktop모듈이 필요함
public class IfTest3 {

	public static void main(String[] args) {
		//Ctrl+D: 현재 커서 라인을 삭제함
	String kor=JOptionPane.showInputDialog("국어 점수를 입력하세요");
	String eng=JOptionPane.showInputDialog("영어 점수를 입력하세요");
	if(kor==null || eng==null) {
		System.out.println("값을 입력해야 해요");
		return;
	}
	if(Integer.parseInt(kor)>100 || Integer.parseInt(eng)>100) {
		System.out.println("100점 밑으로 입력해야 해요");
		 return;
	}

	System.out.println(kor+"/"+eng);
	//합계점수를 출력하세요
//	System.out.println(kor+eng); //[x]
	
	//java.lang.Integer 클래스의 메서드
	//public static int parseInt(String s): 문자열s를 정수로 변환해서 반환해준다.
	//static메서드(클래스 메서드): "클래스명.메서드명()" 접근해야함
	int total= Integer.parseInt(kor)+Integer.parseInt(eng);
	System.out.println("합계점수: "+total);
	
	//평균점수 구해서 
	double average = total/2.0;
	char 학점=' ';
	//if문 이용해서 학점을 출력하세요
	//90점대 A 80점 B 70 C 60 D 그외 F
	if(average>=90) {
//		System.out.println("A");
		학점='A';
	}else if(average>=80) {
//		System.out.println("B");
		학점='B';
	}else if(average>=70) {
//		System.out.println("C");
		학점='C';
	}else if(average>=60) {
//		System.out.println("D");
		학점='D';
	}else { 
//		System.out.println("F");
		학점='F';
	}
	System.out.println("국어\t영어");
	System.out.println("--------------------------");
	System.out.println(kor+"\t"+eng);
	System.out.println("----------------------------");
	System.out.println("총합계: "+total+"점");
	System.out.println("평  균: "+average+"점");
	System.out.println("학점: "+학점+"점");
	}

}
 