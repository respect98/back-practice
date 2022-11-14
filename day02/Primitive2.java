package day02;

public class Primitive2 {
	public static void main(String[] args) {
		System.out.println("2.실수형-----------------");
		//float < double[*]
		//4byte 8byte
		//float : 단정밀도. 소수점 이하 7자리
		//double: 배정밀도. 소수점 이하 15~16자리 [default]
		float ft1 = 10.12345f;
		/*float형일 경우 부동소수점일 경우 반드시 접미사 f를 붙여준다.
		 * 그렇지 않으면 double값으로 인식한다 */
		float ft2 = 800; //promotion(자동형변환): 작은유형에서 큰유형으로 자동으로 형변환이 일어남
		System.out.println("ft1="+ft1);
		System.out.println("ft2="+ft2);
		float ft3 =.897f; //0.897
		System.out.println("ft3="+ft3);
		
		//byte< short< int< long< float< double
		
		double db1=123.456; //접미사 필요없음
		double db2=78.41d; //붙여도 상관없음
		System.out.println("db1="+db1);
		System.out.println("db2="+db2);
		//과학적 지수 표기방법 : E
		double db3=3e-2; //3*10^-2
		double db4=3e+2; //3*10^2
		System.out.println("db3="+db3);//0.03
		System.out.println("db4="+db4);//300.0
		
		float ft4=900e+7f;
		System.out.println("ft4="+ft4);
	}
}
