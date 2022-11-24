package day03;
/*배열
 *- 하나의 변수에 인덱스번호를 붙여 여러개의 데이터를 저장할 수 있도록 하는 자료구조
 *- 고정크기
 *- 동종의 데이터만 저장 가능하다
 * 
 * */
public class ArrayTest {

	public static void main(String[] args) {
	// [1] 배열 선언
//		int a[]; 둘 다 가능
		int []a;
//		int a[3]; XXX 안됨
	
	// [2] 메모리 할당
		a= new int[3];//배열의 크기 : 3
		
	// [3] 초기화
		a[0]=10;
		a[1]=20;
		a[2]=30;
//		a[3]=40;---xxx
		System.out.printf("a[%d]=%d%n", 0, a[0]);
		System.out.printf("a[%d]=%d%n", 1, a[1]);
		System.out.printf("a[%d]=%d%n", 2, a[2]);
		
		System.out.println("배열의 a 크기: "+a.length);
		
	// [1][2]: 선언과 동시에 메모리할당
		double b[]=new double[4];
		System.out.println("b[0]="+b[0]);
		System.out.println("b[3]="+b[3]);
		//배열의 경우 초기화하지 않으면 디폴트값이 저장되어 있다.
		//[3] 초기화
		b[0]='A';
		b[1]=30e-5;
		b[2]=20;
		b[3]=.123f;
		//for루프 이용해서 b에 저장된 값을 모두 출력하세요
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}

		//[1][2][3]: 선언과 동시에 메모리 할당 및 초기화
		char [] ch = {'J','A','V','a'};
		for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		//확장 for루프
		//for(변수선언문 : 자료구조){}
		for(char c:ch) {
			System.out.print(c);
		}
		
		//b에 저장된 값을 확장 for루프 이용해 출력하기
		for(double e: b) {
			System.out.println(e);
		}
		
	}

}
