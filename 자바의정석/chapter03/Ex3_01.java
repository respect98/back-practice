package chapter03;
public class Ex3_01 {
	public static void main(String[] args) {
		int i =5;
		i++;	//i=i+1과 같은 의미이다 ++i;로 바꿔 써도 결과는 똑같다.
		System.out.println(i); //6
		
		i=5; //결과를 비교하기 위해 i를 5로 다시 초기화
		++i;
		System.out.println(i);//6

	}

}
