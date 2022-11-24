package day02;

import java.util.*;

public class Q9_UpperLower {

	public String change(String str) {
		String res = "";
		char ch[] = str.toCharArray();
		for (char c : ch) {
			if (Character.isUpperCase(c)) {
				res += Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)) {
				res += Character.toUpperCase(c);
			}
		}
		return res;

	}// ----------------

	public String change2(String str) {
		String res = "";
		char ch[] = str.toCharArray();
		for (char c : ch) {
			if ('a' <= c && c <= 'z') {
				res += (char) (c - 32);
			} else if ('A' <= c && c <= 'Z') {
				res += (char) (c + 32);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 문자열을 입력하세요.");
		String str = sc.next();

		Q9_UpperLower app = new Q9_UpperLower();
		System.out.println(app.change2(str));
	}

}
