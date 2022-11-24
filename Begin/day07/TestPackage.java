package day07;
//import pack.demo.My1;
//import pack.demo.My2;
import pack.demo.*;
import pack.demo.foo.*;//Demo.class
public class TestPackage {

	public static void main(String[] args) {
		My1 m1 =new My1();
		m1.sub1();
		
		My2 m2 =new My2();
		m2.sub2();
		
		//Demo객체 생성 후 demo1()호출하기
		pack.demo.foo.Demo dm = new pack.demo.foo.Demo();
		dm.demo1();
	}

}
