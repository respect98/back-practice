package day03;

public class ForTest {
	public static void main(String[] args) {
		int sum=0;
		int gop=1;
		//[1]for루프 이용해서 1~10까지의 합과 곱을 구해 출력하세요
		//1+2+3+...10=55
		//1*2*3*...*10=
		for(int i=1; i<11; i++) {
			sum+=i;
			gop*=i; //gop=gop*i
			if(i<10)
			System.out.print(i+"+");
			else
			System.out.print(i+"=");
		}
		System.out.println(sum);
		System.out.println(gop);

		//[2] 1~20까지 정수 중 2 또는 3의 배수가 아닌 수를
		//출력하고, 이 수들의 총합을 구하세요.
		sum=0;
		for(int i=1; i<=20; i++) {
			if((i%2!=0) && (i%3!=0)) {
				sum+=i;
				if(i<19)
				System.out.print(i+"+");
				else
				System.out.print(i+"=");
			} 
		}System.out.println(sum);
		
				
		//[3] 1~100까지 정수를 다음과 같은 식으로
		//계산한 수식과 결과값을 출력하세요
		//1 + (-2) + 3+(-4)+5 +(-6) ....+(-100) = 결과값
		int d=0;
		sum=0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) 
				d=-i;
			else
				d=i;
		System.out.print(d+" ");
		sum+=d;
		}
		System.out.println("의 합"+sum);
		//[4] 알파벳 대문자 A,B....Z를 for루프 이용해 출력하기
		for(char i=65; i<=90; i++) {
			System.out.print(i+",");
		}
		System.out.println( );
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i);
		}
		
		
	 //[5]. 1+(1+2)+(1+2+3)+...(1+2+3+...+10)
		sum=0;
		int total=0;
		for(int i=1; i<11; i++) {
			sum+=i;
			total+=sum;
		}
		System.out.println("\nsum "+sum);
		System.out.println("total: "+total);
	}
}
