package chapter04;

public class Ex4_23 {

	public static void main(String[] args) {
		int i = 5;
		while(i--!=0) {
			System.out.println(i+" - I can do it.");
			//5!=0 -> i=4 -> 4 - I can do it
			//4!=0 -> i=3 -> 3 - I can do it
			//3!=0 -> i=2 -> 2 - I can do it
			//2!=0 -> i=1 -> 1 - I can do it
			//1!=0 -> i=0 -> 0 - I can do it
		}                     
	}

}
