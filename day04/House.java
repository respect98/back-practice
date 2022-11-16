package day04;
//객체= 속성(variable)+행동양식(method)
public class House {
	//1.속성: 멤버변수(has a 관계가 성립해야 함)
	int room;
	String ownerName;
	String addr;
	
	//2.기능: 메서드
	public void printInfo() {
		System.out.println("-------House 정보---------");
		System.out.println("소유주: "+ownerName);
		System.out.println("방 수: "+room);
		System.out.println("주 소: "+addr);
	}
	
	//집의 거래유형(전세,월세,매매), 가격
	public String rent(String type, int price) {
		String str="----"+ownerName+"의 집----\n";
		str+="거래유형: "+type+"\n";
		str+="가   격: "+price+"만원\n";
		return str;
	}
	
}
