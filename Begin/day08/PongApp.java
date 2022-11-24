package day08;

public class PongApp {

	//boolean startsWith(String str)
	//boolean endsWith(String str)
	public static void login(String name) 
	throws NotSupportedNameException
	{
		//퐁씨 성이면 "환영합니다. 퐁길동님"
		if(name.startsWith("퐁")) {
			System.out.println("환영합니다~~"+name+"님!!");
		}
		//콩씨 성이면 "콩씨는 절대로 안돼!!"사용자 정의 예외를 발생시키기
		else if(name.startsWith("콩")) {
			throw new NotSupportedNameException("콩씨는 절대로 안돼!!!!");
		}else {
		//기타 성이면 "기타 성씨분들은 이용에 제한이 있어요" 사용자 정의 예외를 발생시키기
			throw new NotSupportedNameException("기타 성씨분들은 이용에 제한이 있어요");
	}
}
	
	public static void main(String[] args) {
		try {
		PongApp.login(args[0]);
		}catch(NotSupportedNameException e) {
			String msg=e.getMessage();
			System.out.println(msg);
		}catch(Exception e) {
			System.out.println("명령줄 인수 1개 주세요");
		}
	}

}
