package day03;
import javax.swing.*;
public class MyGame2 {

	public static void main(String[] args) {
	 String str = JOptionPane.showInputDialog("알파벳,0~9사이의 숫자, 그외 문자 중 하나를 입력하세요");
	 System.out.println(str);
	 if(str==null) return;
	 //String charAt(int i): 문자열의 인덱스 i번째의 문자를 추출한다
	 //char charAt(int index): 객체명.charAt(4)
	 //
	 //"Hello"
//	 String s="Hello";
//	 char ch=s.charAt(4);
//	 System.out.println("ch:" +ch);
	 
	 //[1]입력받은 문자열의 첫 문자를 가지고 판단하되
	 //숫자면 "숫자이군요!", 알파벳대소문자 => "알파벳입니다", 그 외 문자는 "기타문자입니다"
	 char ch=str.charAt(0);
	 String res=" ";
	 if(0x30<=ch && ch<=0x39) { //'0' <= ch && ch<='9'
		 res=ch+"숫자이군요!";
	 }else if(0x41<=ch && ch<=0x5A) {//'A' <=ch && ch<='Z'
		 res=ch+"알파벳입니다";
	 }else if(0x61<=ch && ch<=0x7A) {//'a' <=ch && ch<='z'
		 res=ch+"알파벳입니다";
	 }else {
		 res=ch+"기타문자입니다";
		 }
	 System.out.println(res);
	 //[2]java.lang.character 클래스의 메서드를 활용해서 위 문제를 동일하게 해결해보세요
	 //숫자여부를 판단하는 메서드 static boolean isDigit(char ch)
	 //알파벳여부를 판별하는 메서드 static boolean isAlpha(int codePoint)
	 //소문자 여부를 판단하는 메서드 static boolean	isLowerCase(char ch)
	 //대문자 여부를 판단하는 메서드 static boolean	isUpperCase(char ch)
	 if(Character.isDigit(ch)) {
		 System.out.println("숫자에요!");
	 }else if(Character.isUpperCase(ch)) {
		 System.out.println("알파벳 대문자에요!");
	 }else if(Character.isLowerCase(ch)){
		System.out.println("알파벳 소문자에요!");
	 }else
		 System.out.println("기타문자에요");
	 
	 
	 
	 
	 
		
	}

}
