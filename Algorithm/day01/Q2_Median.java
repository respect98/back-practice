package day01;

import java.util.*;
//3개값의 중앙값을 구할 때 대소비교시 13가지 경우가 나옴
public class Q2_Median {
	
	public static int median(int a, int b, int c) {
		int res=0;
		if((a>b && a<c) || (a>c && a<b)) res= a;
		if((b>a && b<c) || (b>c && b<a)) res= b;
		if((c>a && c<b) || (c>b && c<a)) res= c;
		
		return res;
	}
	public static int median2(int a, int b, int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			}else if(a>c) {
				return c;
			}else {
				return a;
			}
		}else {
			if(a>c) {
				return a;
			}else if(b>c) {
				return c;
			}else {
				return b;
			}
		}
	}//-----------------------------------------
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int res=median(a,b,c);
		
		System.out.printf("%d, %d, %d 중에 중앙값: %d%n", a,b,c, res);
		
	}

}
