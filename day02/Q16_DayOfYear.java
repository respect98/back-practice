package day02;
import java.util.*;
public class Q16_DayOfYear {
	int[][] mdays= {
			{31,28,31,30,31,30,31,31,30,31,30,31}, //평년 월별 일수	
			{31,29,31,30,31,30,31,31,30,31,30,31} //윤년 월별 일수
	};
	
	public static void main(String[] args) {
		Q16_DayOfYear app = new Q16_DayOfYear();
		app.input_date();
		
	}//==========================

	public void input_date() {
		int no=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("년도: ");
			int year=sc.nextInt();
			
			System.out.print("월: ");
			int month=sc.nextInt();
			
			System.out.print("일: ");
			int day=sc.nextInt();
			
			int totalDay=dayOfyear(year,month,day);
			System.out.printf("%d년 %d일째 입니다%n",year, totalDay);
			
			System.out.println("한번 더 하시겠습니까? [1.예 2.아니오]");
			no=sc.nextInt();
			
		}while(no==1);
		
		System.out.println("Bye Bye~~~~~~~");
		
	}//==================================
	//윤년이면 1을 반환, 평년이면 0을 반환
	public static final int LEAP_YEAR=1;
	public static final int NORMAL_YEAR=0;
	
	
	public int isLeapYear(int yy) {
		int yoon=0;
		if((yy%4==0)&&(yy%100!=0)||(yy%400==0)) {
			return LEAP_YEAR;
		}
		return NORMAL_YEAR;
	}
	
	
	
	//윤년: 년도를 4로 나누어 떨어지면서 100으로는 나누어 떨어지면 안됨
	//		다만 400으로는 나누어 떨어지면 윤년
	// mdays의 이차원 배열의 행의 인덱스가 0이면 평년, 1이면 윤년
	public int dayOfyear(int yy, int mm, int dd) {
		int total=0;
		int yoon=isLeapYear(yy);
		for(int i=0; i<mm-1; i++) {
			total+=mdays[yoon][i];
		}
		total+=dd;
		return total;
	}
	
	
	
}
