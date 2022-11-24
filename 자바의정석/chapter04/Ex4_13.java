package chapter04;

public class Ex4_13 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			sum+=i; //sum = sum+i;
			/*i=1, sum =0+1 =1;
			 * i=2, sum = 1+2 = 3;
			 * i=3, sum = 3+3 = 6;
			 * i=4, sum = 10+4 = 14;
			 * ===> sum = 1+2+3+4...
			 * */
			System.out.printf("1부터 %2d까지의 합: %2d%n",i,sum);
		}
	}

}
