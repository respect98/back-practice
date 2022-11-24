package day02;

public class DataType {
	//멤버변수(인스턴스변수, 클래스변수)
	byte b; //0 // 인스턴스변수들은 "객체명.변수"식으로 접근해야 한다
	short s; //0
	char c; //'\u0000'
	int i; //0
	long l; //0L
	float f; //0.0f
	double d; //0.0
	boolean bool; //false
	String str; // 참조형 null
	public static void main(String[] args) {
		int k=5; //지역변수(local variable, automatic변수)
		System.out.println(k);
	
//		System.out.println(b); [x]
		DataType obj=new DataType();
		System.out.println(obj.b);
		System.out.println(obj.s);
		System.out.println(obj.c);
		System.out.println(obj.i);
		System.out.println(obj.l);
		System.out.println(obj.f);
		System.out.println(obj.d);
		System.out.println(obj.bool);
		System.out.println(obj.str);
	
	}
}
