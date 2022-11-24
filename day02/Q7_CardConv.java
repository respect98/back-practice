package day02;
import java.util.*;
public class Q7_CardConv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[32]; //int=> 32bit
		System.out.println("음수가 아닌 정수(양수) 입력: ");
		int n = sc.nextInt();
		System.out.println("몇진수로 변환할까요? (2~36): ");
		int radix=sc.nextInt();
		printRadix(n,radix,arr);
	}
	
	public static void printRadix(int num, int r, char[] arr) {
		System.out.printf("%d를 %d진수로 변환: ", num, r);
		int i = conversion(num,r,arr);
		//arr에 저장된 값을 역으로 출력
		for(int k=i-1; k>=0; k--) {
			System.out.print(arr[k]);
		}
	}
	
	public static int conversion(int num, int radix, char[] arr) {
		//기수 변환(2진수로 변환) radix=2(2진수)
		//num=45
		String str="0123456789ABCDEFGHOJKLMNOPQRSTUVWXYZ";
		int cnt=0;
		do {
			int mod=num%radix;
			arr[cnt++]=str.charAt(mod);
			num=num/radix;
			//num/=radix;
		}while(num!=0);
		
		return cnt;
		
	}
	
}
