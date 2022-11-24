package chapter02;
import java.util.*;
public class Ex2_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두자리 정수를 하나 입력해주세요>");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);// 입력받은 문자열을 숫자로 전환
		
		System.out.println("입력내용: "+input);
		System.out.printf("num=%d%n", num);

	}

}
