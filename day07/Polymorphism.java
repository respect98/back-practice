package day07;

public class Polymorphism {

	public static void main(String[] args) {
		Aquaman a1 = new Aquaman("고등어", 80, 66);
		System.out.println(a1.showInfo());

		Superman s1 = new Superman("아무개슈퍼맨", 177, 200);
		System.out.println(s1.showInfo());
		s1.showInfo("###슈퍼맨 정보###");;
		
		Human h1 = new Human("김철수", 165);
		System.out.println(h1.showInfo());
		/*부모 자식 상속관계를 맺으면
		 * 부모타입 변수 = new 자식객체() 가능하다.
		 * 이럴 경우 그 참조변수로 참조할 수 있는 범위는 제한이 있다
		 * [1] 부모로부터 상속받은 변수, 메서드 [o]
		 * [2] 자식이 가지는 고유한 변수, 메서드 [x]
		 * [3] 그러나 자식이 오버라이드한 메서드가 있을 경우,
		 * 		그 오버라이드한 메서드를 우선 호출한다. [o]
		 * */
		Human hs = new Superman("신우철", 500);
		System.out.println("hs.name: "+hs.name);
		System.out.println("hs.height: "+hs.height);
		//System.out.println("hs.power: "+hs.power); [x]
		System.out.println(hs.showInfo());
		//hs.showInfo("@@@@@@@@@@@@@"); [x]
		//hs변수로 power출력해보기
		//hs.showInfo도 해보기
		System.out.println(((Superman)hs).power);
		((Superman)hs).showInfo("@@@@@@@@@@@@@");
		Superman ss=(Superman)hs;
		System.out.println(ss.power+"/"+ss.name);
		ss.showInfo("###########");
		
		Human ha=new Aquaman("갈치", 100, 45.67);
		System.out.println(ha.name+"/"+ha.height);
		System.out.println(((Aquaman)ha).speed);
		System.out.println(ha.showInfo());
		
		

		//[문제1] a1,s1,h1,hs,ha를 저장할 수 있는 배열을 생성하고 저장하세요
		//		반복문을 이용해서 각 객체의 정보를 출력하되
		//		슈퍼맨 객체의 경우는 타이틀을 붙여서 출력하도록 하세요
		Human[] arr = {h1, s1, a1, hs, ha};
		for(Human p:arr) {
			if(p instanceof Superman) {
				((Superman)p).showInfo("---슈퍼맨 정보----");
			}else {
			System.out.println("---------------------");
			System.out.println(p.showInfo());
			}
			
			}
			
			
			
			
		
		
		
		
		
		
	}

}
