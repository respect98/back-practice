package day04;
/*클래스의 Member
 * 1. 생성자(Constructor) : 객체를 생성할 때 호출되는 일종의 메서드 new 연산자와 함께 사용
 * 		- 역할: 멤버볌수(인스턴스변수)들의 초기화
 * 		- 구성하는 방법
 * 			-생성자 이름은 클래스 이름과 동일해야 함.
 * 			-반환타입은 기술하지 않는다.
 * 			: public 생성자이름([매개변수]){
 * 
 * 			  }
 * 2. 변수(Variable)
 * 		- 인스턴스변수(non-static변수) : 객체를 먼저 생성하고 "객체명.변수"로 접근
 * 		- 클래스변수(static변수) : 메모리에 가장 먼저 올라가는 변수
 * 3. 메서드(Method)
 * 		- 인스턴스메서드(non-static메서드): "객체명.메서드명()"
 * 		- 클래스 메서드(static메서드)	 : "클래스명.메서드명()"
 * 
 * */
public class MyDemo {
	int x; //인스턴스변수 => 객체명.변수
	static int y;//클래스변수 =>클래스명.변수
	
	//static블럭 : 클래스 변수들의 초기화
	static {
		y=800;
	}
	public MyDemo() {//default constructor(기본생성자)
		x=100;
		System.out.println("MyDemo() 생성자...");
	}
	

}/////////////////////////////////
