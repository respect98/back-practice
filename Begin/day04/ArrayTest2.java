package day04;

public class ArrayTest2 {

	public static void main(String[] args) {
		//2차원배열
		//int a [][]; //(1) 선언 
//		int [][]a;
		int []a[];
		
		//(2) 메모리 할당
		a=new int[3][2]; //3행2열
		System.out.println(a[0][0]);
		//(3) 초기화
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
	
	//for루프 이용해서 출력하기 - 중첩for루프 이용
	//행의 크기 : a.length 
	//열의 크기 : a[i].length
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		//한꺼번에 하는 방법
		short []b[] = {{10,11},{-5,-7,8},{20}};//3행
		//[1]for루프 이용해서 출력하세요
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}System.out.println();
		}
		System.out.println("-------------------------");
		//[2]확장 for루프 이용해서 출력하세요
		for(short[] s:b) {
			for(short v:s) {
				System.out.print(v+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		//행의 크기만 먼저 잡아놓고, 나중에 열의 크기를 할당하는 방법
		char[][] ch=new char[3][];
		System.out.println("ch.length: "+ch.length);
		
		ch[0]=new char[2]; //첫번째 행은 2열로
		ch[1]=new char[4]; //두번째 행은 4열로
		ch[2]=new char[3]; //세번째 행은 3열로
		System.out.println("ch[0].length: "+ch[0].length);
		System.out.println("ch[1].length: "+ch[1].length);
		System.out.println("ch[2].length: "+ch[2].length);
		
		ch[0][0]='H';
		ch[0][1]='i';
		
		ch[1][0]='J';
		ch[1][1]='a';
		ch[1][2]='v';
		ch[1][3]='a';
		
		//확장 for루프 이용해서 출력하세요
		for(char []c:ch) {
			for(char d:c) {
				System.out.print(d+" ");
			}
			System.out.println();
		}
		
	
	}//-------main

}//---------class
