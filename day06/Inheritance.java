package day06;

//부모클래스: Super class, Base class
//상속받을 때는 extends를 이용한다
//자바는 단일 상속이다. extends로 상속받는 클래스는 1개만 가능하다
class Human // extends Object
{
	String name;
	int height;

	public String showInfo() {
		return "이 름: " + name + "\n키: " + height + "\n";
	}

}//////////////////////////////// human

//자식클래스: Sub Class, Derived Class
//Superman is a Human : "is a"관계를 살펴보자
//상속관계가 있을 때 메서드 오버라이딩이 가능함
//부모가 가진 메서드를 그냥 쓰는 것이 아니라
//다시 정의해서 구현하는 것

/**오버라이딩의 조건
 * [1] 메서드 이름은 부모와 동일하게
 * [2] 매개변수도 부모와 동일하게
 * [3] 반환타입도 동일하게
 * [4] 접근지정자는 부모와 동일하거나 더 넓은 범위를 지정해야 한다.
 * */

class Superman extends Human 
{
	int power;
	public Superman(String n, int h, int p) {
		name=n; height=h; power=p;
	}
	//오버라이딩(Overriding) : 메서드 재정의
	@Override
	public String showInfo(){
//		return "이 름: "+name+"\n키: "+height+"\n초능력: "+power+"\n";
		return super.showInfo()+"초능력: "+power+"\n";
	}
	
	//Overload
	public void showInfo(String title) {
		System.out.println(title);
		//이름, 키, 초능력
		System.out.println(this.showInfo());//이름,키,초능력
	}
	
	//초능력을 충전하는 showInfo를 오버로드하기
	
	public void showInfo(String title, int pw) {
		this.showInfo(title);
		this.power+=pw;
		System.out.println(">>초능력 충전<<<");
		System.out.println("초능력: "+power);
	}

	
}//////////////////////////// super

class Aquaman extends Human {
	double speed;
	public Aquaman(String n, int h, int p) {
		name=n; height=h; speed=p;
	}
	
	public String showInfo() {
//		return "이 름: "+name+"\n키: "+height+"\n스피드: "+speed+"\n";
		return super.showInfo()+"스피드: "+speed+"\n";
	}


	
	
}/////////////////////// aqua

public class Inheritance {

	public static void main(String[] args) {
		//Human객체 생성 후 메서드로 정보 출력하기
		Human h1 = new Human();
		h1.name="아무개";
		h1.height=166;
		System.out.println(h1.showInfo());
		
		//Superman 생성 후 메서드 호출
		Superman s1 = new Superman("슈퍼맨", 177, 100);
		System.out.println(s1.showInfo());
		
		//Aquaman 생성 후 메서드 호출
		Aquaman a1 = new Aquaman("아쿠아맨", 180, 130);
		System.out.println(a1.showInfo());
		
		Superman s2 = new Superman("울트라슈퍼맨", 166, 800);
		System.out.println(s2.showInfo());
		s2.showInfo("##슈퍼맨 정보#######");
		s2.showInfo("*****슈퍼맨 정보*****",100);
		
		//h1, s1, a1, s2 를 배열에 저장해서 
		//반복문 이용해 정보를 한꺼번에 출력하세요
		System.out.println("-------------------");
		Human arr[]= {h1, s1, a1, s2};
		for(Human hu:arr) {
			System.out.println(hu.showInfo());
			System.out.println("-------------------");
		}
		
//		Object arr2 []= {s1,a1,s2};
//		
//		for(Object o:arr2) {
//			System.out.println(((Human) o).showInfo());
//		}
//		
		
		
		
		
		
		
		
	}// main

}// class
