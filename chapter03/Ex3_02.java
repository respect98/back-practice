package chapter03;

public class Ex3_02 {

	public static void main(String[] args) {
		int i =5, j=0;
		
		j = i++; 
		System.out.println("j = i++; 실행 후, i="+i+", j="+j); // i=6, j=5 
		
		i=5; //결과를 비교하기 위해 i의 값을 5로 초기화
		j=0; //마찬가지
		
		j=++i;
		System.out.println("j = ++i; 실행 후, i="+i+", j="+j); // i=6, j=6
	}

}
