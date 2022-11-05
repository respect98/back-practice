package chapter02;

public class Ex2_13 {

	public static void main(String[] args) {
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n",i,b); // [int -> byte] i=10 -> b=10
		
		i=300;
		b=(byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n",i,b); // i=300, b = 44
		
		b=10;
		i =(int)b;
		System.out.printf("[btye -> int] b=%d -> i=%d%n",b,i); // b=10, i=10
		
		b=-2;
		i =(int)b;
		System.out.printf("[btye -> int] b=%d -> i=%d%n",b,i); // b=-2, i=-2
		
		System.out.println("i="+Integer.toBinaryString(i)); //i=1111 1111 1111 1111 1111 1111 1111 1110
	}

}
