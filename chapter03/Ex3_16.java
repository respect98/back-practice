package chapter03;

public class Ex3_16 {

	public static void main(String[] args) {
		float Pi = 3.141592f;
		float shortPi = (int)(Pi*1000)/1000f; //3141.592 => 형변환 3141 => 3141/1000.0 => 3.141 
		System.out.println(shortPi); //3.141

	}

}
