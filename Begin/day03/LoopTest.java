package day03;
import javax.swing.*;//javax.swing패키지의 모든 클래스를 가져다 사용할 수 있음
public class LoopTest {

	public static void main(String[] args) {
		//구구단
		String dan = JOptionPane.showInputDialog("구구단 몇단을 할까요?");
		//[1] 입력받은 단의 구구단 출력하기 => while 또는 do while
		
		int i = Integer.parseInt(dan);
		int a =1;
		while(a<10) {
			System.out.println(i+"x"+a+"="+i*a);
			a++;
		}
		System.out.println("---------------------");
		
		//[2] 구구단 전체를 아래와 같은 형태로 출력하세요 => 중첩 while or do while
		/*
		 * 2x1=2   3x1=3      .....9x1=9
		 * 2x2=4   3x2=6
		 * ...
		 * 2x9=18
		 * */
		
		int y=1;
		while(y<10) {
			int x=2;
			while(x<10) {
				System.out.printf("%dx%d=%d\t",x,y,x*y);
				x++;
			}
			y++;
			System.out.println();//줄바꿈
		}
		
	}

}
