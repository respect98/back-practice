package day09;

public class InnerClassTest {

	public static void main(String[] args) {
		// [1] Outer클래스의 변수 a,b 값을 출력하세요
		System.out.println("Outer.b=" + Outer.b);
		Outer o = new Outer();
		System.out.println("o.a=" + o.a);

		// [2] Outer.Inner클래스의 변수 c값 출력, sub()호출
		Outer o1 = new Outer();
		Outer.Inner oi = o1.new Inner();
		System.out.println("oi.c=" + oi.c);
		oi.sub();

		Outer.Inner oi2 = new Outer().new Inner();
		oi2.sub();
		
		// [3] Outer.SInner클래스의 d, e, foo(), bar()호출
		System.out.println("Outer.SInner.e=" + Outer.SInner.e);
		Outer.SInner.bar();

		Outer.SInner os = new Outer.SInner();
		System.out.println("os.d=" + os.d);
		os.foo();
		
		o1.test();
	}

}
