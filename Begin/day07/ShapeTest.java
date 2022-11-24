package day07;

public class ShapeTest {

	public static void main(String[] args) {
		System.out.println("각 도형의 면적을 구합니다~~");
		System.out.printf("가로: %d, 세로: %d인 도형면적 --------%n", 8, 10);
		// 사각형 객체 생성 후 area()호출하기
		Rectangle ra = new Rectangle();
		ra.area(8, 10);

		// 삼각형
		Triangle ta = new Triangle();
		ta.area(8, 10);
		// 원: 반지름이 8
		// 추상클래스는 타입선언은 할 수 있으나 인스턴스화 할 수는 없다.
		// Circle cc = new Circle(); [x]
		Circle cc = new SubCircle(); // [o]
		((SubCircle) cc).area(8);

		SubCircle sc = new SubCircle();
		sc.area(8);

		Shape sr = new Rectangle();
		sc.area(5, 6);

		// rt, tr, cc, sc, sr배열에 저장 후 반복문 돌려 면적 출력하기
		// (12, 25)
		Shape[] arr = { ra, ta, cc, sc, sr };
		for (Shape s : arr) {
			System.out.println("------------------------");
			if (s instanceof SubCircle) {
				((SubCircle) s).area(12);
			} else {
				s.area(12, 25);
			}
		}

	}

}
