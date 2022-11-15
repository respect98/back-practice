package day03;
import java.util.Scanner;
public class MyGame {
	public static void startGame() {
		Scanner sc =new Scanner(System.in);
		//컴퓨터가 랜덤한 정수값을 1<= r <=100 사이의 임의의 정수를 발생시킨다
		//이 값을 맞추는 게임
		//단 게임시도횟수가 7번을 초과하면 "실패했습니다" 후 게임 종료
		System.out.println("1~100사이의 정수를 입력하세요");
		int 시도=0;
		int 랜덤 =(int)(Math.random()*100+1);

		while(시도<=7) {
			if(시도==7) {System.out.println("시도 횟수 초과입니다. Game Over"); return;}
		
		int 답 = sc.nextInt();
		if(랜덤==답) {
			System.out.println("정답입니다! 시도횟수:"+(시도+1));
			return;
		}
		else if(답>랜덤) {
			System.out.println(답+"보다 작은 값입니다.");
			시도++;
		}else if(답<랜덤) {
			System.out.println(답+"보다 큰 값입니다.");
			시도++;
		}
	}
}//----startGame
	
	
	public static void main(String[] args) {
		MyGame.startGame();

		
	}//------main

}
