package day08;
interface Inter1{
	void a();
	int b();
}//////////////////////////////

interface Inter2{
	double PI=3.14;
}///////////////////////


//인터페이스가 인터페이스를 상속받을 때는 extends로 받으며 여러개 상속 가능
interface Inter3 extends Inter1, Inter2
{
	void c();
}/////////////////////////

abstract class AbsClass{
	abstract void d();
}////////////////////////

//MyDemo가 AbsClass, Inter3을 상속받은 뒤 에러가 없도록 조치하세요
class MyDemo extends AbsClass implements Inter3
{
	public void a() {}

	public int b() {return 0;}

	public void c() {
		System.out.println("c()###");
	}

	void d() {
		System.out.println("d()@@@@@");
	}
	
	
}



public class InterfaceTest2 {

	public static void main(String[] args) {
		//객체 생성해서 a(),b(),c(),d()호출하고 PI출력하기
		MyDemo md = new MyDemo();
		md.a();
		System.out.println(md.b());
		md.c();
		md.d();
		System.out.println(md.PI);
		
		Inter1 im=new MyDemo();
		Inter2 im2=new MyDemo();
		Inter3 im3=new MyDemo();
		AbsClass ac = new MyDemo();
		
		im.a();
		System.out.println(im.b());
//		im.c(); [x]
		
		System.out.println(Inter2.PI);
		System.out.println(MyDemo.PI);
//		MyDemo.PI=7;[x]
		
		im3.a();
		System.out.println(im3.b()+3);
		im3.c();
		
		((AbsClass)im3).d();
	}
}
