package chapter03;

public class Ex3_18 {

	public static void main(String[] args) {
		double Pi = 3.141592;
		double shortPi = Math.round(Pi*1000)/1000.0; // => 3141.592 => 3142 /1000.0 => 3.142
		System.out.println(shortPi); //3.142
	}

}
