package day03;

import javax.swing.*;

public class Quiz2 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("문자열을 입력하세요");
		boolean isNumber = true;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!(ch>='0' && ch<='9')) {
				isNumber=false;
				break;
			}
		}
		
		if(isNumber)
			System.out.println(str+"는 숫자입니다");
		else
			System.out.println(str+"는 숫자가 아닙니다");
	
	
	}
}
