package day07;
import java.util.*;
public class Q20_ArrMaxSum {
	
	public int getArrayMaxSum(int n, int[][] arr) {
		int row_sum=0;
		int col_sum=0;
		int max=-999;
		for(int i=0;i<n;i++) {
			row_sum=0;//행들의 합
			col_sum=0;//열들의 합
			for(int j=0;j<n;j++) {
				col_sum+=arr[i][j];
				row_sum+=arr[j][i];
			}//for-------
			if(col_sum>max)
				max=col_sum;
			if(row_sum>max)
				max=row_sum;
		}//for-------------
		//대각선1, 대각선2
		int sum1=0, sum2=0;
		for(int i=0;i<n;i++) {
			sum1+=arr[i][i];
			sum2+=arr[i][n-1-i];
		}
		if(sum1>max)
			max=sum1;
		if(sum2>max)
			max=sum2;
		return max;
	}//-------------------------

	public static void main(String[] args) {
		Q20_ArrMaxSum app=new Q20_ArrMaxSum();
		Scanner sc=new Scanner(System.in);
		System.out.println("배열 크기 입력: ");
		int n=sc.nextInt();
		//이차원 배열 생성
		System.out.printf("%d행 %d열 배열에 저장할 값 입력: %n", n, n);
		//이중 반복문 돌면서 저장할 값 입력받기
		int [][] arr=new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				//System.out.printf("%d행 %d열: ",i,j);
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}//for---
		int max = app.getArrayMaxSum(n, arr);
		System.out.println("대각선을 포함한 각 라인의 합계 중 가장 큰 합계는 "+max+"입니다.");
		
		//getArrayMaxSum()호출
	}

}
