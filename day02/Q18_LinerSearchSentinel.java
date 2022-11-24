package day02;

import java.util.*;

public class Q18_LinerSearchSentinel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 크기 입력: ");
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		System.out.println("저장할 값을 입력하세요: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("검색할 값 입력: ");
		int key = sc.nextInt();

		int idx = searchSentinel(arr, n + 1, key);
		// 검색한 값이 없다면 -1을 반환하고, 있으면 해당 인덱스 번호를 반환한다.
		System.out.println((idx!=n)? key + "값은 배열 인덱스" + idx + "에 있어요": "배열에 없어요");
	}// ---------------------------

	public static int searchSentinel(int[] arr, int n, int key) {
		arr[n-1]=key;//보초값을 마지막에 저장
		int i=-1;
		for(i=0; i<n; i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return i;
		
	}
}
