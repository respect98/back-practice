package day08;

import java.util.*;

public class Q26_Bracket {

	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if (x == '(')
				stack.push(x);
			else {
				if (stack.isEmpty())
					return "No";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}
	

	public static void main(String[] args) {
		System.out.println("괄호를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Q26_Bracket app = new Q26_Bracket();
		System.out.println(app.solution(str));
	}

}
