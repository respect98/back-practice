package chapter03;

public class Ex3_26 {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n", a,b); //a=5, b=0
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0); //true || true = true
		System.out.printf("a=%d, b=%d%n",a,b); //a=5, b=0
		System.out.printf("a==0 && ++b!=0 =%b%n", a==0 && ++b!=0); //false && true = false
		System.out.printf("a=%d, b=%d%n",a,b); //a=5, b=0
	}

}
