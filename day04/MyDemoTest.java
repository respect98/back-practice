package day04;

public class MyDemoTest {

	public static void main(String[] args) {
		MyDemo md1=new MyDemo(); //MyDemo객체가 생성되어 메모리에 올라감

		MyDemo md2=new MyDemo();
		MyDemo md3=md2;
		System.out.println(md1);
		
		System.out.println(md2);
		
		System.out.println(md1==md2);//주소값을 비교
		System.out.println(md2==md3);
		
		//MyDemo의 x값 출력하기
		System.out.println("md1.x="+md1.x);
		System.out.println("md2.x="+md2.x);
		
		md2.x=500;
		System.out.println("md1.x="+md1.x);
		System.out.println("md2.x="+md2.x);
		System.out.println("md3.x="+md3.x);
		
		//MyDemo의 y값을 출력하세요
		System.out.println("MyDemo.y="+MyDemo.y);
		
		
		//[1] YourDemo의 str,pi,add 변수값을 출력하기
		System.out.println(YourDemo.add);
		YourDemo yd= new YourDemo();
		System.out.println(yd.str);
		System.out.println(yd.pi);
		System.out.println(yd.add);//20
		
		YourDemo.add=200;//static변수들은 객체들마다 공유한다
		System.out.println(yd.add);
	}
	

}
