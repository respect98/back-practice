package day01;

public class Q1_Max {
	public static int max2(int a, int b) {
		int max = 0;
		if(a>b) max=a;
		if(a<b) max=b;
//		int max=(a>b)? a:b;
//		int max=Math.max(a,b);
//		int max=-999;
		if(a>max) {
			max=a;
		}
		if(b>max) {
			max=b;
		}
		return max;
	}
	
	public static int max3(int a, int b, int c) {
		int max=a;
		if(b>max) max=b;
		if(c>max) max=c;
		return max;
	}
	
	public static int max4(int a, int b, int c, int d) {
//		int max =a;
//		if(b>max) max=b;
//		if(c>max) max=c;
//		if(d>max) max=d;
//		return max;
		
//		int x= max2(a,b);
//		int y= max2(c,d);
//		int max = max2(x,y);
//		return max;
		
		int max = max2(max2(max2(a,b),c),d);
		return max;
	}
	
	public static void main(String[] args) {
		int a=50;
		int b=32;
		int c=45;
		int d=79;

		int mx=max2(a,b);
		System.out.printf("%d와 %d중 최대값: %d%n",a,b,mx);
		
		mx=max3(a,b,c);
		System.out.printf("%d와 %d와 %d중 최대값: %d%n",a,b,c,mx);
		
		mx=max4(a,b,c,d);
		System.out.printf("%d와 %d와 %d와 %d중 최대값: %d%n",a,b,c,d,mx);
	}

}
