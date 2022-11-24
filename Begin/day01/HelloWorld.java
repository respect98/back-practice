package day01;
//이클립스는 Ctrl+S (저장) 하면 자동으로 컴파일 된다.
//javac HelloWorld.java === HelloWorld.class
//java HelloWorld ===> 인터프리터가 HelloWorld클래스를 찾아 로드 시킨 뒤,
//					   해당 클래스의 main()메서드를 먼저 찾아서 한줄 한줄 해석하고
//                     아웃풋을 낸다
// Ctrl+F11 단축기 => 실행
public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Hello World~~~");
		System.out.println("안녕 자바~~");
		System.out.println("Byee~~");
		System.out.println('A');//문자 1개 'A'=> char타입
		System.out.println("문자열은 쌍따옴표로 감쌉니다");
	}
	
}
