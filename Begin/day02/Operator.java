package day02;

public class Operator {
	public static void main(String[] args) {
		print("1. 부호 연산자(+,-)");
		byte a=5;
		byte b=-7;
		print("+a: "+(+a));
		print("-b: "+(-b));
		
		print("2. 증감연산자(++,--)");
		int c=8;
		long d=5;
		c++; //c=c+1
		d--; //d=d-1
		print("c: "+c);
		print("d: "+d);
		
		++c;
		--d;
		print("c: "+c);
		print("d: "+d);
		
		float e=5.6f;
		double f=8.4;
		System.out.println(++e); //6.6
		System.out.println("e: "+e); //6.6
		
		System.out.println(--f); //7.4
		System.out.println("f: "+f); //7.4
		
		print("*3. 비트별 not연산자(~)******************");
		int m=42;
		print("m: "+m);//42
		print("~m: "+(~m));//-43
		//비트로 바꿔서 연산해야함.
		//0은 1로, 1은 0으로 바꾼다
		/*	42
		 * 	21 ... 0
		 *  10 ... 1
		 * 	 5 ... 0
		 * 	 2 ... 1
		 * 	 1 ... 0
		 * 
		 *  42 => 00000000 00000000 00000000 00101010 
		 * ~42 => 11111111 11111111 11111111 11010101
		 * 1010101 => -1*2^6 + 1*2^4 + 1*2^2 + 1*2^0 = -64 + 16 + 4 + 1 = -43  
		 * */
		
		// 		    5 : 00000000 00000000 00000000 00000101
		// 음수를 비트로 표현하는 방법 : java는 2의 보수를 취한다
		// 2의 보수란? 1의 보수를 구한 값에 +1을 한다
		// 5의 1의 보수 : 11111111 11111111 11111111 11111010
		//         +1 :	11111111 11111111 11111111 11111011 ===> -5
		// 1011 = -1*2^3 + 1*2^1 + 1*2^0 = -8 + 2 + 1 = -5
		
		print("4. 논리부정 연산자: ! ******************");
		//논리식에서만 사용됨. true=>false, false=> true
		boolean b1 =false;
		print("b1: "+b1);
		print("!b1: "+(!b1));
		
		/* = : 대입연산자
		 * ==: 비교연산자
		 * ===: 자바에는 없다 [x]
		 * 비교연산자(==)
		 * [1] 기본자료형 : 값이 같은지를 비교함
		 * [2] 참조형 : 주소값이 같은지를 비교한다
		 * 
		 * != : 값이 서로 다른가? 다르면 true
		 * */
		int x = 5;
		float y = 5.0f;
		String s1 = "Hello";
		String s2 = new String("Hello");
		
		print("x==y: "+(x==y)); // 값을 비교
		print("s1==s2: "+(s1==s2)); //주소값 비교
		
		print("x!=y: "+(x!=y));
		print("s1!=s2: "+(s1!=s2)); //주소값을 비교함
	}
	
	public static void print(String str) {
		System.out.println(str);
	}
}
