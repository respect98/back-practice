package chapter04;
import java.util.*;
public class Ex4_25 {

	public static void main(String[] args) {
		int num=0, sum=0;
		System.out.print("숫자를 입력하세요.(예:12345)>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			//num을 10으로 나눈 나머지를 sum에 더함
			sum += num%10; //sum = sum+num%10 // 12345 = 5
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num/=10; //1234
		}
		System.out.println("각 자리수의 합:"+sum);
	}

}
