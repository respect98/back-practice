package day03;
import java.util.*;
/*이진검색
 * - 리스트, 배열을 이용
 * - 정렬되어 있는 자료구조로 해야 함
 * - O(log n)
 * - 100개의 데이터가 있다면 O(log 100) ==>최악의 경우 7번만에 검색을 마칠 수 있음
 * */

public class Q19_BinarySearch {
	public static int binarySearch(int[] arr, int length, int key) 
	{	Arrays.sort(arr);//오름차순 정렬
	System.out.println(Arrays.toString(arr));
	int left=0;
	int right=length-1;
	int center=(left+right)/2;
	int cnt=0;
	while(left<=right) {
		cnt++;
		center=(left+right)/2;
		if(key==arr[center]) {
			System.out.println(cnt+"번 만에 찾음");
			return center;
		}else if(key>arr[center]) {
			left=center+1;
		}else if(key<arr[center]) {
			right=center-1;
		}
		
	}//while----------
		return -1;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 크기 입력: ");
		int n=sc.nextInt();
		int [] arr= new int[n];
		System.out.println("배열에 저장할 정수값 입력: ");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("검색할 값 입력: ");
		int key=sc.nextInt();
		int idx=binarySearch(arr, n, key);
		System.out.println((idx<0)? "배열에"+key+"값은 없어요": "배열에 인덱스"+idx+"번에"+key+"값이 있습니다.");
				
		
				

	}

}
