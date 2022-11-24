package day01;

/*중첩 반복문 이용해서 곱셈 테이블을 출력하세요*/
public class Q3_GopTable {
	public static void printTable() {
		System.out.print("   |");
		for(int i=1; i<10; i++) {
			System.out.printf("%4d",i);
		}
		System.out.println();
		System.out.println("---+--------------------------------------");
		for(int i=1;i<10;i++) {
			System.out.printf("%2d |",i);
			for(int j=1;j<10;j++) {
				System.out.printf("%4d",(i*j));
			}
			System.out.println();
		}
	}//--------------
	
	public static void printTable2() {
		for(int x=1; x<=9; x++) {
			System.out.println();
			if(x==1) {
				System.out.print("  |    1   2   3   4   5   6   7   8   9  \n");
				System.out.println("--+--------------------------------------");
			}
			for(int y=1; y<=9; y++) {
				if(y==1) {
					System.out.print(x+" | ");
				}
				System.out.printf("%4d", x*y);
			}
		}
	}
	
	public static void main(String[] arg) {
		printTable();
		printTable2();
	}
}

