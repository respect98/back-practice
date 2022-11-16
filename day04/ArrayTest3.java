package day04;

public class ArrayTest3 {

	public static void main(String[] args) {
		// [문제1] String 유형을 저장하는 이차원 배열을 선언하고 생성, 초기화하세요
		// 반복문 이용해서 출력하되 모두 소문자로 바꿔 출력하세요
		String a[][] = { { "가", "나" }, { "가나다", "안녕" }, { "안녕하세요", "자바", "css" } };
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {
				System.out.print(a[i][k] + " ");
			}
			System.out.println();
		}

		for (String[] str : a) {
			for (String s : str)
				System.out.println(s);
		}

		/*
		 * 문제 2] 2차원 배열에 다음의 값을 저장하되, for루프를 이용해 저장하자. 그런 뒤, 저장된 값들을 출력해봅시다. 1 0 0 0 0 0
		 * 1 0 0 0 0 0 1 0 0 0 0 0 1 0 0 0 0 0 1
		 */
		int b[][] = new int[5][5];
		for (int x = 0; x < b.length; x++) {
			for (int y = 0; y < b[x].length; y++) {
				if (x == y) {
					b[x][y] = 1;
				}
				System.out.print(b[x][y] + " ");
			}
			System.out.println();

		}
		
		System.out.println("----------------------");
		
		int[][]arr=new int[5][5];
		int cnt=0;
		int x=0, y=0;//배열의 행의 인덱스와 열의 인덱스로 사용할 변수
		for(int j=0; j<2; j++) {
			for(int i=0; i<4-2*j; i++) {
				arr[y+j][x+j]=++cnt;
				x++;
			}
			if(x+y+2*j==4) {
				for(int i=0; i<4-2*j; i++) {
					arr[y+j][x+j]=++cnt;
					y++;
				}
			}
			if(x==y) {
				for(int i=0; i<4-2*j; i++) {
					arr[y+j][x+j]=++cnt;
					x--;
				}
			}
			if(x+y+2*j==4) {
				for(int i=0; i<4-2*j; i++) {
					arr[y+j][x+j]=++cnt;
					y--;
				}
			}
		}//for J----------------------
		arr[2][2]=++cnt;
		
		
		System.out.println("----------------------");
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				System.out.print(arr[i][k]+"\t");
			}//--for
			System.out.println();
			
			
		}//--for
		
		/* 아래 선언된 변수들의 자료형을 맞춰봅시다.
		 * 
		 * (1) int i, j[]    i: 정수형, j: 정수형의 1차원배열
		 * 
		 * (2) int[] i, j[],k; i:정수형의 1차원배열 j: 정수형의 2차원배열 k:정수형의 1차원배열
		 * 
		 * (3) int i, []j[], k[]; i: 정수형 j:정수형의 2차원배열 k:정수형의 1차원배열
		 * 
		 * (4) int [][]i, j[]; i:정수형의 2차원배열, j: 정수형의 3차원배열
		 * 
		 * */
		
		
		
		

	}

}
