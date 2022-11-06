package chapter03;

public class Ex3_22 {
	public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.printf("10.0 == 10.0f %b%n", 10.0==10.0f); //true
		System.out.printf("0.1 == 0.1f %b%n", 0.1==0.1f); //false
		System.out.printf("f = %19.17f%n",f); 
		System.out.printf("d = %19.17f%n",d);
		System.out.printf("d2 = %19.17f%n",d2);
		System.out.printf("d==f %b%n",d==f); //false
		System.out.printf("d==d2 %b%n",d==d2);//false
		System.out.printf("d2==f %b%n",d2==f);//true
		System.out.printf("(float)d==f %b%n", (float)d==f);//true
		
		/*10.0 == 10.0f는 true인데 0.1==0.1f는 false인 이유는 정수형과 달리 실수형은 근사값으로 저장되므로 오차가 발생할 수 있기 때문
		 * 10.0은 오차없이 저장할 수 있는 값이라 double로 형변환해도 10.0이지만 0.1은 저장할 때 2진수로 변환하는 과정에서 오차가 발생함
		 *d==f
		 *d==(double)f
		 *0.10000000000000001 == (double) 0.1000000149011612
		 *0.10000000000000001 == 0.1000000149011612
		 *==> false
		 * */
		
	}

}
