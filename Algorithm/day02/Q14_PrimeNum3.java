package day02;

public class Q14_PrimeNum3 {

	public static void main(String[] args) {
		int cnt=0;
		int ptr=0;
		int[] prime=new int[500];
		prime[ptr++]=2;
		prime[ptr++]=3;
		for(int n=5; n<=1000; n+=2) {
			boolean flag= false;
			for(int i=1; prime[i]<=Math.sqrt(n); i++) {
				cnt++;
				if(n%prime[i]==0) {
					flag=true;
					break;
				}
			}//for========
			if(!flag) {
				prime[ptr++]=n;
				cnt++;
			}
		}//for=========
		
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("수행 횟수: "+cnt);
	}

}
