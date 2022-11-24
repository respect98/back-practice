package chapter03;

public class Ex3_12 {

	public static void main(String[] args) {
		char c1 = 'a'; //c1에는 문자 'a'의 코드값인 97이 저장된다.
		char c2 = c1; //c1에 저장되어 있는 값이 c2에 저장된다.
		char c3 = ' '; //c3을 공백으로 초기화 한다.
		
		int i = c1+1; // 'a'+1 => 97+1 => 98
		
		c3 =(char)(c1+1); //'b'
		c2++; //'b' ++은 형변환 없이 1을 증가시킬수 있기 때문에 'b'가 됨
		c2++; //'c' 만약 ++아니고 c2+1이나 c2+2면 에러가 발생할 것 왜냐하면 얘네의 연산결과는 int이며 그 결과를 다시 c2에 저장하려면 형변환(char)이 필요
		
		System.out.println("i="+i); //98
		System.out.println("c2="+c2); //c
		System.out.println("c3="+c3); //b
	}

}
