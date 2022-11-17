package day05;
//자판기
public class VendingMachine {

	private int coffee, sugar, cream;
	
	//메소드 오버로딩(다중정의)
	/* [1] 메서드 이름은 같게 구성한다
	 * [2] 매개변수는 자료형이 다르거나, 갯수가 다르거나, 순서가 달라야 한다
	 * [3] 반환타입은 같아도 되고 달라도 된다(반환타입은 신경쓰지 않음)
	 * */
	
	public void makeTea(int coffee, int sugar, int cream) {
		this.coffee=coffee; this.sugar=sugar; this.cream=cream;
		System.out.println("밀크커피 나가요~ 농도: "+(this.coffee+this.sugar+this.cream));
		
	}
	
	public void makeTea(int c, int s){
		coffee=c; sugar=s;
		int sum=coffee+sugar;
		System.out.println("설탕커피 나가요~~ 농도: "+sum);
	}
	public String makeTea(int c) {
		coffee=c;
		return "블랙커피 나가요~~~ 농도:"+coffee;
	}
	
	//크림커피
	public void makeTea(int c, short cr) {
		coffee=c; cream=cr;
		int sum=coffee+cream;
		System.out.println("크림커피 나가요~~ 농도: "+sum);
	}
	
	public void makeTea(short c, int cr) {
		coffee=c; cream=cr;
		int sum=coffee+cream;
		System.out.println("크림커피 나가요~~ 농도: "+sum);
	}
	
	//유자차 메서드 오버로딩 하세요
	public void makeTea(Yuja a) {
		System.out.println("유자 농도: "+a.getYuja());
		System.out.println("설탕 농도: "+a.getSugar());
		System.out.println("유자차 나가요~~~~~ 농도: "+(a.getYuja()+a.getSugar()));
	}

	
	
	
	
	
	
	
}////////////////////////////////////////
