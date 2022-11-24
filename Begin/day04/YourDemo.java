package day04;

public class YourDemo {
	String str ="Your Demo's Variable";
	float pi;//생성자를 구성하고 초기값을 부여하기
	static  int add;//초기화하기
	
	static {
		//static블럭은 main()메서드 보다도 먼저 메모리에 올라감
		add=20;
		System.out.println("YourDemo의 static블럭...");
	}
	//인스턴스 메서드
	public YourDemo() {
		pi=3.14f;
		
	}
	//클래스 메서드
	public void foo() {
		System.out.println("----foo()-------------");
		System.out.println("pi: "+pi);
	}
	public static void bar() {
		System.out.println("----bar()-------------");
		System.out.println("pi: "+new YourDemo().pi);
	}
	
	
	public static void main(String[] args) {
		System.out.println("main()메서드--------------");
		//pi값 출력하세요
		//add값 출력하세요
		System.out.println(YourDemo.add);
		System.out.println(add);
//		System.out.println(pi);//[x]
		
		YourDemo y=new YourDemo();
		System.out.println(y.pi);
		
		//bar()메서드 호출하기
		YourDemo.bar();
		
		
		//foo()메서드 호출하기
		y.foo();
	}
	
	
}
