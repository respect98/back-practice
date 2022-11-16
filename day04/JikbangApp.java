package day04;

public class JikbangApp {

	public static void main(String[] args) {
		//클래스: 객체를 만들어내는 틀
		//객체 : 클래스를 통해 만들어진 구현물

		House h1=new House();
		
		House h2=new House();
		
		h1.ownerName="홍길동";
		h1.room=3;
		h1.addr="강남구 삼성동";
		
		h2.ownerName="조은경";
		h2.room=10;
		h2.addr="강남구 역삼동";
		
		
		h1.printInfo();
		h2.printInfo();
		
		
		//rent()호출해서 거래정보 출력하기
		
		String info=h1.rent("매매", 5000);
		System.out.println(info);
		
		System.out.println(h2.rent("월세",70));
	}

}
