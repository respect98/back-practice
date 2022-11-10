package chapter06;

public class ReferenceParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x=10;
		System.out.println("main() : x = "+d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = "+d.x);
	}

	static void change(Data d) {//참조형 매개변수 //Data d의 주소를 복사
		d.x=1000; //그 주소의 x를 1000으로 바꿈
		System.out.println("change() : x = "+d.x);
	}
}
