package chapter03;

public class Ex3_17 {

	public static void main(String[] args) {
		double Pi = 3.141592;
		double shortPi = (int)(Pi*1000+0.5)/1000.0; //3141.592+0.5 => 3142.092 => 3142/1000.0 => 3.142
		System.out.println(shortPi); //3.142
	}

}
