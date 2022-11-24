package day03;

import java.util.*;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("******MyGame v1.1*******");
			System.out.println("1.가위  2.바위  3.보  9.종료");
			System.out.println("************************");
			System.out.println("입력하세요=>");
			System.out.println("************************");

			int you = sc.nextInt();
			int com = (int) (Math.random() * 3 + 1);

			String rps[] = new String[5];
			rps[0] = "[가위]";
			rps[1] = "[바위]";
			rps[2] = "[보]";
			rps[3] = "Bye Bye~";
			rps[4] = "1,2,3,9중에 골라주세요";
			
			int y = you - 1;
			int c = com - 1;
			if(you==1 || you==2 || you==3) {
			if (y == c + 1) {
				System.out.println("당 신: " + you + " " + rps[y]);
				System.out.println("컴퓨터: " + com + " " + rps[c]);
				System.out.println("당신이 이겼네요*^^*");
			} else if (y == c) {
				System.out.println("당 신: " + you + " " + rps[y]);
				System.out.println("컴퓨터: " + com + " " + rps[c]);
				System.out.println("비겼어요!!");
			} else if (y + 1 == c) {
				System.out.println("당 신: " + you + " " + rps[y]);
				System.out.println("컴퓨터: " + com + " " + rps[c]);
				System.out.println("당신이 졌네요*ㅠㅠ*");
			}
			}//---if
			else if(you==9) {
				System.out.println(rps[3]);
				break;
			}else {
				System.out.println(rps[4]);
			}
		} // ----while
	}// -------main
}// ------class
