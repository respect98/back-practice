package day08;

public class ExceptionTest {

	public static void main(String[] args) {
		String fruits[] = { "Apple", "Grape", "Orange" };
		
		try {
			for (int i = 0; i <3; i++) {
				System.out.println(fruits[i]);
	
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 초과됐어요!! 확인해보세요");
		}

		System.out.println("반드시 실행되어야 할 코드~~~~~~~~");

	}

}
