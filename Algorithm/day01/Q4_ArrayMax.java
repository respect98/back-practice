package day01;

import java.util.*;

public class Q4_ArrayMax {
	public static int[] max_min(int []arr) {
		int[] m = new int[2]; // 최대 키 최소 키
		int max=arr[0];
		int min=arr[0];
		for(int h:arr) {
			if(h>max) {
				max=h;
			}
			if(h<min) {
				min=h;
			}
			m[0]=max;
			m[1]=min;
		}
		return m;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수를 입력하세요 [키의 최대, 최소 구합니다]: ");
		int num=sc.nextInt();
		int height[] = new int[num];
		//반복문 돌면서 height에 랜덤한 키를 저장하기 100~190사이
		Random ran=new Random();
		for(int i=0; i<height.length; i++) {
		int h =ran.nextInt(91)+100;
		System.out.println(h);
		height[i]=h;
		}
		
		int m[] = max_min(height);
		System.out.printf("제일 큰 키: "+m[0]);
		System.out.printf("제일 작은 키: "+m[1]);
	}

}
