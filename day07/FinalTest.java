package day07;
//final+class : 상속받지 못함
final class Base{
	int a;
}/////////////////

class Child // extends Base[x]
{
	void foo() {
		System.out.println("foo()");
	}
	//final + 메서드 : 오버라이드 못함
	final void bar() {
		System.out.println("bar()");
	}
	
}////////////////
class Demo extends Child{
	
	//final+변수 : 값할당 못함
	public static final int OK=100;
	@Override
	protected void foo() {
		System.out.println("foo()###");
	}
//		void bar() {
//		} [x]
	}





public class FinalTest {

	public static void main(String[] args) {
		//Ok출력하기
		System.out.println(Demo.OK);
//		Demo.OK=200; [x]

	}

}
