package day05;

public class SchoolApp {

	public static void main(String[] args) {
		//단위 테스트
		Student st = new Student();
		Teacher te = new Teacher();

		st.setNo(1);
		st.setName("홍길동");
		st.setClassName("자바반");
		st.printInfo();

		String cnames=st.getClassName();
		System.out.println(cnames);

		
		te.setNo(100);
		te.setName("김교사");
		te.setSubject("C언어");
		te.printInfo();
		
		//문제1]학생 객체를 2개 더 생성하고...
		//각각 이름,학번,전공 값을 넣어준뒤...
		//배열에 저장하자.
		//for루프 돌리면서 저장된 학생 객체들의
		//정보를 출력해보자.
		Student st2=new Student();
		st2.setNo(2);
		st2.setName("이창수");
		st2.setClassName("빅데이터반");
		st2.printInfo();
		
		Student st3=new Student();
		st3.setNo(3);
		st3.setName("박혜수");
		st3.setClassName("백엔드개발자반");
		st3.printInfo();
		
		Student [] stu= {st, st2, st3};
		for(int i=0; i<stu.length; i++) {
			stu[i].printInfo();
		}
		System.out.println("*********************");
		//확장 for루프로 출력하기
		for(Student s:stu) {
			s.printInfo();
		}
		
		
	}

}
