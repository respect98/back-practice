package day02;
import java.util.Scanner;
public class Iftest2 {

	public static void main(String[] args) {
		// 2자리 정수를 입력받으세요
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리 정수를 입력하세요 =>");
		//11, 22, 33, 44, 55,...
		//=> "OK" 10의 자리와 1의 자리가 같아요
		// 그렇지 않다면 NO 10의 자리와 1의 자리가 달라요
		int num = sc.nextInt();
		if(num<10 || num>=100) {
			System.out.println("입력오류: 2자리 정수를 입력해야 합니다");
			return;
			//main()메서드를 호출할 쪽으로 돌아간다. ==> JVM이 호출 => 프로세스 종료
		}
		if(num%11==0) {
			System.out.println("Ok 10의 자리와 1의 자리가 같아요");
		}else {
			System.out.println("NO 10의 자리와 1의 자리가 달라요");
		}
		
		int n1=num/10;
		int n2=num%10;
		if(n1==n2)
			System.out.println("Ok 10의 자리와 1의 자리가 같아요");
		else
			System.out.println("No 10의 자리와 1의 자리가 달라요");
		
		//if~else문으로 구현한 것을 삼항연산자로 바꿔 구현해보세요
		String st = (num%11==0)? "OK 10의 자리와 1의 자리가 같아요": "NO 10의 자리와 1의 자리가 달라요";
		System.out.println(st);
		
		System.out.println((num%11==0)? "OK 10의 자리와 1의 자리가 같아요": "NO 10의 자리와 1의 자리가 달라요");
	}

}
