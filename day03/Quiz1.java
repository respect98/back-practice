package day03;
import javax.swing.*;
public class Quiz1 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("숫자를 입력하세요");
		int num= Integer.parseInt(str);
		int sum=0;
		while(num>0) {
			int n =num%10;
			sum+=n;
			num /= 10;
			System.out.print(n+" ");
		}
		System.out.println("\n입력된 숫자의 합은: "+sum);
		
		
		
	}//main---------------------------------

}
