package day04;
//속성 3~4, 기능: 2개 이상
//JobKoreaApp에서 객체 생성해서 메서드 호출하기
//배열에 회사객체 저장후 반복문 돌려 출력하기
public class Company {
	String CoName;
	String addr;
	String need;
	int year;
	boolean pass; //default = false; 불합격상태
	
	public String CompanyInfo() {
		String str="----"+CoName+"회사의 정보입니다----\n";
		str+="회사주소: "+addr+"\n";
		str+="회사설립연도: "+year+"년\n";
		str+="현재 저희 회사는"+need+"가 필요합니다\n";
		
		return str;
	}
	
	public void Resultpass() {
		pass=!pass;
	}
	
	public void Thanks() {
		if(pass) {
			System.out.println("귀하는"+CoName+"에 합격하셨습니다");
		}else {
			System.out.println("죄송합니다 귀하는 "+CoName+"에 불합격하셨습니다. 지원해주셔서 감사합니다");
		}
	}
}
