package day04;

public class JobKoreaApp {
	
	public static void main(String[] args) {
		Person p =new Person();
		String info=p.memberInfo();
		System.out.println(info);
		
		p.name="이상화";
		p.age=22;
		p.skill="Java 중급";
		p.profile="개발경력 3년";
		
		info=p.memberInfo();
//		if(p.state)//구직중이라면 출력
//		System.out.println(info);
		p.openProfile();
		
		System.out.println(p.state);
		
		p.changeState();
		System.out.println(p.state);
		
//		if(p.state)//구직중이라면 출력
//			System.out.println(info);
		p.openProfile();
		
		
		//[1]객체를 2개 더 생성하세요 이름, 나이, 스킬, 프로필 정보를 할당하고
		//공개여부 설정한 뒤 프로필을 출력하세요
		Person p2=new Person();
		p2.name="강남";
		p2.age=23;
		p2.skill="Css 초급";
		p2.profile="개발경력 3개월";
		p2.openProfile();
		
		Person p3=new Person();
		p3.name="홍길동";
		p3.age=20;
		p3.skill="Java 고급";
		p3.profile="개발경력 10년";
		p3.openProfile();
		
		//[2]구직자 객체 3개를 저장할 배열을 선언하고 해당 배열에 저장하세요
		//반복문 이용해서 모든 구직자 정보를 출력하세요
		
		Person arr[]=new Person[3];
		arr[0]=p;
		arr[1]=p2;
		arr[2]=p3;

		for(int i=0; i<arr.length; i++) {
			//sysem.out.println(arr[i]);
			if(!arr[i].state)
			arr[i].changeState();
			
			arr[i].openProfile();
		}//--------------------
		
		for(Person pr:arr)
			pr.openProfile();
		
		
		Company c =new Company();
		String CInfo = c.CompanyInfo();
		System.out.println(CInfo);
		
		c.CoName="멀티캠퍼스";
		c.addr="서울시 어쩌구 저쩌동";
		c.year=1998;
		c.need="3년이상 경력의 JAVA개발자";
		
		System.out.println(c.CompanyInfo());
		c.Thanks();
		
		
	}
	
	
	
	
}