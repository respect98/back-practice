package chapter03;

public class Ex3_14 {

	public static void main(String[] args) {

		char c ='a';
		for(int i=0; i<26 ; i++) { //블럭{}안의 문장을 26번 반복한다.
			System.out.print(c++); //'a'부터 26개의 문자를 출력한다(~'z')
		}
		
		System.out.println();//줄바꿈을 한다
		
		c= 'A';
		for(int i=0; i<26; i++) {
			System.out.print(c++); //A부터 문자 출력 ~Z
		}
		
		System.out.println();//줄바꿈을 한다
		
		c='0';
		for(int i=0; i<10; i++) {
			System.out.print(c++); //0~9
		}
		
		System.out.println();//줄바꿈
		
	}

}
