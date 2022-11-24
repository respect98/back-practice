package day02;

public class Primitive3 {
	public static void main(String[] args) {
		print("1.문자형-----------");
		//문자형: char(2byte-16byte): 0~ 2^16-1 (0~655535)
		//		자바는 유니코드 체계를 사용함(모든 국가의 언어를 표현할 수 있음)
		char ch1='가';
		char ch2='A'; //ASCII 코드값:65
		print("ch1="+ch1);
		print("ch2="+ch2);
		char ch3='\uff57'; //유니코드
		print("ch3="+ch3);
		print("ch2+1="+(ch2+1));//아스키코드값을 반환
		/*char + int  ==> 큰 자료유형으로 자동형변환(promotion)이 일어난다.
		 * 
		 * int보다 작은 유형의 데이터가 연산에 사용될 경우
		 * 자동으로 int유형으로 형변환 된다.
		 * 
		 * byte-------+
		 * short------+---->int
		 * char-------+
		 * */
		
		byte b1=10;
		byte b2=20;
		int b3=b1+b2;
		print("b3="+b3);
		// 강제적 형변환(Casting): 큰 자료유형에서 작은 자료유형으로 변환하고자 할 때 사용
		// 형변환 연산자()를 이용한다.
		// 자료형 변수 =(자료형)값;
		byte b4=(byte)(b2-b1);//byte-byte => int(promotion)
		print("b4="+b4);
		
		byte b5=(byte)128;
		print("b5="+b5); //-128 데이터 손실 발생
		/*
		 *  128
		 *   64 ... 0
		 *   32 ... 0
		 *   16 ... 0
		 *    8 ... 0
		 *    4 ... 0
		 *    2 ... 0
		 *    1 ... 0
		 *    
		 * 
		 *       128:00000000 00000000 00000000 10000000 <=int형
		 * (byte)128:10000000
		 * */
		
		char c ='A';
		char d =(char)(c+1); //char + int => int
		print("d="+d);
		
		print("4. 논리형-------------------");
		boolean bool =true;
		boolean bool2 =false;
		boolean bool3 =2>5;
		//자바의 논리형은 0,1로 호환되지 않는다. 형변환도 불가능
		print("bool="+bool);
		print("bool2="+bool2);
		print("bool3="+bool3);
		
	}
	
	public static void print(String str) {
		System.out.println(str);
	}

}
