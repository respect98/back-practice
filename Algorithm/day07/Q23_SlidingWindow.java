package day07;

import static java.lang.System.in;

import java.util.Scanner;

public class Q23_SlidingWindow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(in);
		System.out.println("며칠의 매출기록을 입력하실래요?");
		int n=sc.nextInt();
		System.out.println("연속 며칠의 매출을 구할까요?");
		int k=sc.nextInt();
		System.out.printf("%d일간의 매출기록을 입력하세요%n", n);
		int[] a=new int[n];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		int max=getMaxOut(n, k, a);
		System.out.printf("연속 %d일간의 최대 매출액: %d%n", k, max);
	}

	private static int getMaxOut(int n, int k, int[] a) {
		int max = 0, sum = 0;
		for(int i=0;i<k;i++) {
			max += a[i];
		}
		sum = max;
		for(int i=k;i<n;i++) {
			sum += a[i];
			sum -= a[i-k];
			max = Math.max(max, sum);
		}
		return max;
	}

}
