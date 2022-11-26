package day04;

public class Recursive {

	public static void recursive(int num) {
		if(num<=0) {//기본단계 - 종료조건
			return;
		}
//		System.out.println(num); 4 3 2 1
		recursive(num-1);//재귀호출 - 재귀단계
		System.out.println(num); // 1 2 3 4
	}
	
	
	public static void main(String[] args) {
		recursive(4);
	}

}
