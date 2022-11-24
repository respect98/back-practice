package chapter04;
import java.util.*;
public class Ex4_04 {

	public static void main(String[] args) {
		int score = 0; //정수를 저장하기 위한 변수
		char grade = ' '; //학점을 저장하기 위한 변수. 공백으로 초기화 한다.
		
		System.out.println("정수를 입력하세요.>");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt(); //화면을 통해 입력받은 숫자를 score에 저장
		
		if(score>=90) {
			grade='A'; //score가 90점보다 같거나 크면 A학점
		}else if(score>=80) {
			grade='B';//score가 80점보다 같거나 크면 B학점
		}else if(score>=70) {
			grade='C';
		}else{
			grade='D';
		}
		
		System.out.println("당신의 학점은"+grade+"입니다.");

	}

}
