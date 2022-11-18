package day07;

class Human{
	String name;//null
	int height;//0
//	public Human() { };// 기본 생성자
	public Human(String name, int height) {//인자생성자
		this.name =name;
		this.height = height; 
	}
	
	public String showInfo() {
		return "이 름: "+name+"\n키 : "+height+"\n";
	}
	
}/////////human/////////////
class Superman extends Human
{
	int power;
	public Superman() {
		//super(); .. 부모의 기본생성자 호출
		super("슈퍼맨",100);
	}
	public Superman(String n, int power) {
		this(n, 170, power);
		//super()와 this()는 함께 사용할 수 없다.
		//super()도 생성자에서만 호출 가능하며, 생성자의 첫번째 라인에 위치해야 함
	}
	public Superman(String n, int h, int p) {
		super(n,h);
		power=p;
	}
	@Override
	public String showInfo() {
		return super.showInfo()+"초능력: "+power+"\n";
	}
	
	public void showInfo(String title) {
		System.out.println(title);
		System.out.println(this.showInfo());
	}
	
}///////Superman//////////
//매개변수 3개 받는 생성자 구성하기
//showInfo()재정의하기
//객체 2개 생성해서 정보 출력하기
class Aquaman extends Human{
	double speed;
	public Aquaman(String n, int h, double s) {
		super(n,h);
		this.speed=s;
	}
	@Override
	public String showInfo() {
		return super.showInfo()+"스피드: "+speed+"\n";
	}
	
	
}//////Aquaman//////////


public class Inheritance {

	public static void main(String[] args) {
		Human h1 = new Human("홍길동",182);
		System.out.println(h1.showInfo());
		
		Superman s1 = new Superman();
		System.out.println(s1.showInfo());
		
		Superman s2 = new Superman("울트라슈퍼맨", 900);
		System.out.println(s2.showInfo());
		
		Superman s3 = new Superman("꼬마 슈퍼맨", 120, 300);
		System.out.println(s3.showInfo());
		
		s2.showInfo("***슈퍼맨 정보***");
		
	}

}
