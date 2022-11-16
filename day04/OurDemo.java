package day04;

public class OurDemo {
	
	/*[1] 반환타입x 매개변수x
	 *[2] 반환타입x 매개변수o
	 *[3] 반환타입o 매개변수x
	 *[4] 반환타입o 매개변수o
	 * */
	
	
	public static void showStar() {
		System.out.println("★");
	}
	public void showChar(char ch) {
		System.out.println(ch);
	}
	public long giveMe() {
		System.out.println("----giveMe()-------");
		return 10000000L;//반환타입이 지정된 메서드는 메서드 블럭 끝에서 return문을 이용해 값을 반환해야 한다.
	}
	public static long giveUs(int money) {
		System.out.println("------giveUs()-------");
		return 2*money;
	}

	public static void main(String[] args) {
		//showStar()호출
		OurDemo.showStar(); //또는 그냥 showStar();
		//showChar()호출하기
		OurDemo od=new OurDemo();//생성자를 구성하지 않으면 컴파일러가 디폴트 생성자를 제공한다
		od.showChar('@');
		
		long m=od.giveMe();
		System.out.println(m);
		
		long m2=giveUs(10000000);//또는 OurDemo.giveus();
		System.out.println(m2);
	}

}
