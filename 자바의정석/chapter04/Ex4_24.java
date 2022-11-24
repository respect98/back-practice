package chapter04;

public class Ex4_24 {

	public static void main(String[] args) {
		int i =11;
		
		System.out.println("카운트 다운을 시작합니다.");
		
		while(i--!=0) {
			System.out.println(i); //10,9,8,7,6,5,4,3,2,1
			
			for(long j=0; j<1_000_000_000L; j++) {
				;
			}
			
		}
		System.out.println("GAME OVER");

	}

}
