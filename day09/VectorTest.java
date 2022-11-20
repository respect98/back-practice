package day09;

import java.util.*;

//Java Collection : Vector, Hashtable, ArrayList, HashMap, HashSet..
/*자바 컬렉션 프레임웤
* - 프레임웤(사용방법을 미리 정해놓은 라이브러리를 의미)
* - 자바 컬렉션: 객체를 수집해서 저장하는 역할
* 
* 배열
* - 고정 크기
* - 동종의 데이터 저장 가능
* 
* Vector
* - 동적으로 저장 크기를 늘릴 수 있다
* - 다른 종류의 데이터도 저장 가능(다만, 기본자료형은 안되고, Object유형의 객체들만 저장 가능함)
* 
* - List계열 컬렉션
* - 입력 순서를 기억한다.
* - 데이터 중복을 허용한다.
* 유사 클래스 : ArrayList (과제. 벡터와 ArrayList차이점 알아오기)
* 
* */

public class VectorTest {

	public static void main(String[] args) {
		// jdk 1.4버전일 때
		Vector v = new Vector(5, 3);
		// 초기용량: 5, 증가치: 3
		// 데이터가 꽉 찼을 때 저장 영역을 3만큼 늘린다
		// boolean add(Object e), boolean addElement(E,e)
		v.add("Hello");
		v.add(Integer.valueOf(10));

		System.out.println("벡터v의 현재 크기1: " + v.size());
		System.out.println("벡터v의 현재 용량1: " + v.capacity());

		for (int i = 1; i < 5; i++) {
			v.add(i);// Integer객체로 autoboxing되어 저장된다
		}
		System.out.println("벡터v의 현재 크기1: " + v.size());
		System.out.println("벡터v의 현재 용량1: " + v.capacity());
		// E get(int index), E elementAt(int index)

		Object obj = v.get(0);
		System.out.println(obj);
		System.out.println(((String) obj).toLowerCase());

		Integer a = (Integer) v.get(1);
		System.out.println(a);

		// jdk 5.0이후 버전일 때 => Generic
		Vector<String> v2 = new Vector<>();
		// String만 저장 가능
		v2.add("Orange");
		v2.add("Melon");
		v2.add("Apple");
		v2.add(String.valueOf(3.14));

		String str = v2.get(0);
		System.out.println(str.toLowerCase());
		// for루프 이용해서 v2dp 저장된 값 출력하기
		for (int i = 0; i < v2.size(); i++) {
//			str=v2.get(i);
			str = v2.elementAt(i);
			System.out.println(str);
		}

		for (String s : v2) {
			System.out.println(s.toUpperCase());
		}
		// [문제1] Float유형을 저장할 벡터 v3를 생성하고
		// Float객체 3개 저장하세요.
		// 확장 for루프를 이용해 v3에 저장된 값들의 합계를 구하세요
		Vector<Float> v3 = new Vector<>();
		v3.add(3.14f);//auto boxing
		v3.add(4.0f);
		v3.add(9.4f);
		float sum=0;
		for(Float f : v3) {
			System.out.println(f);
			sum+=f;//auto unboxing
		}
		System.out.println(sum);
	}

}
