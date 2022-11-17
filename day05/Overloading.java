package day05;

class Superman {
	String name;
	int height;
	int power;

	// 생성자 오버로딩
	public Superman() {// 디폴트생성자
		this("아무개슈퍼맨", 160, 100);
		/*
		 * this()는 생성자 안에서만 호출 가능하며 첫번째 줄에서 호출해야 한다 super()와는 함께 사용할 수 없다
		 */
	}

	public Superman(String name) {
		this(name, 165, 200);
		/*
		 * this.name = name; height=165; power=200;
		 */
	}

	public Superman(String n, int h) {
		this(n, h, 300);
		/*
		 * /name=n; height=h; power=300;
		 */
	}

	// target
	public Superman(String n, int h, int pw) {
		name = n;
		height = h;
		power = pw;
	}

	public String showInfo() {
		String str = "---슈퍼맨 정보---\n";
		str += "이름: " + name + "\n키: " + height + "\n초능력: " + power;
		return str;
	}

}/////////////////// super

class Aquaman {
	String name;
	int height;
	double speed;

	// 생성자를 오버로딩 하세요 2개 이상 만들기
	// main()에서 Aquaman객체 생성해서 정보 출력해보기
	public Aquaman() {
		this("아쿠아맨", 172); // this가 밑으로 갈 수 없음
		speed = 55.23;
	}

	public Aquaman(String n, int h, double s) {
		this.name = n;
		this.height = h;
		this.speed = s;
	}

	// target
	public Aquaman(String n, int h) {
		this(n, h, 78.96);
//		name=n; 
//		height=h;
//		speed=78.96;
	}

	public String showInfo() {
		String str = "---아쿠아맨 정보---\n";
		str += "이름: " + name + "\n키: " + height + "\n스피드: " + speed;
		return str;
	}

}////////////////////////////////// aqua

public class Overloading {

	public static void main(String[] args) {
		// 슈퍼맨객체 생성 후 showInfo()호출해서 정보 출력
		Superman s1 = new Superman();
//		s1.name="김슈퍼";//sm.setName("김슈퍼");
//		s1.height=177;//sm.setHeight(177);
//		s1.power=500;

		String info = s1.showInfo();
		System.out.println(info);

		Superman s2 = new Superman("최슈퍼");
		System.out.println(s2.showInfo());

		Superman s3 = new Superman("장슈퍼", 159, 160);
		System.out.println(s3.showInfo());

		Aquaman a1 = new Aquaman();
		System.out.println(a1.showInfo());

		Aquaman a2 = new Aquaman("최지수", 168, 100);
		System.out.println(a2.showInfo());
		System.out.println("***********************");

		// 슈퍼맨을 저장할 배열을 생성하고 저장한 뒤 반복문 돌려 정보 출력하기
		Superman sArr[] = new Superman[3];
		sArr[0] = s1;
		sArr[1] = s2;
		sArr[2] = s3;
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].showInfo());
		}

		Object[] arr = { s1, s2, s3, a1, a2 };
		/*
		 * Instanceof 연산자 참조변수 Instanceof 클래스명 : 참조변수가 클래스의 객체이면 true, 아니면 false를 반환
		 */

		System.out.println("##############################");
		for (Object obj : arr) {
			if (obj instanceof Superman) {
				Superman st = (Superman) obj;
				System.out.println(st.showInfo());
			} else if (obj instanceof Aquaman) {
				Aquaman at = (Aquaman) obj;
				System.out.println(at.showInfo());
			}
		}

	}///////////////////// main

}//////////////////////////// over