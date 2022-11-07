package chapter04;
import java.util.*;
public class Ex4_07 {

	public static void main(String[] args) {
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
		
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		int com = (int)(Math.random()*3)+1; //1,2,3중 하나가 com에 저장됨
		
		System.out.println("당신은"+user+"입니다");
		System.out.println("컴퓨터는"+com+"입니다");
		
		switch(user-com) { //지는 경우 1-2 = -1/ 2-3 = -1/ 3-1 =2
		case 2: case -1:
			System.out.println("당신이 졌습니다");
			break;
		case 1: case -2: //이기는 경우 1-3 = -2, 2-1 =1, 3-2 =1
			System.out.println("당신이 이겼습니다");
			break;
		case 0:
			System.out.println("비겼습니다.");
		}
	}

}
