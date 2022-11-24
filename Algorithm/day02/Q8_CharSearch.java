package day02;
import java.util.*;
public class Q8_CharSearch {

	public int search(String str, char ch) {
		int cnt=0;
		str=str.toLowerCase();
		ch=Character.toLowerCase(ch);
		char c[]=str.toCharArray();
		for(char a:c) {
			if(a==ch)
				cnt++;
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String str = sc.nextLine();
		System.out.println("검색할 문자 하나를 입력하세요: ");
		String ch=sc.next();
		
		Q8_CharSearch app = new Q8_CharSearch();
		System.out.println(app.search(str, ch.charAt(0)));

	}

}
