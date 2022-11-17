package day05;

import java.util.*;

public class SchoolApp2 {

	private Scanner sc = new Scanner(System.in);

	private Student[] stuArr = new Student[3]; // 학생객체를 저장할 배열
	private int countS = 0; // 등록한 학생 수를 담을 변수
	private Teacher[] teaArr = new Teacher[3]; // 교사객체를 저장할 배열
	private int countT = 0; // 등록한 교사 수를 담을 변수
	private Staff[] staArr = new Staff[3];
	private int countF = 0;
	// 2,5,7,8
	// 학생 검색: 학번으로 검색하기
	// "학번 입력하세요": 1
	// 1번학생의 정보만 출력
	// 없으면 =>"등록되지 않은 번호입니다"
	// 학생 삭제: 학번으로 검색해서 있으면 배열에서 삭제 처리
	// 없으면-> "등록되지 않은 번호입니다"
	// C(Create), R(Read), U(Update), D(Delete)

	public void menu() {
		System.out.println("*****학사관리 프로그램 v1.1*****");
		System.out.println("** 1. 학생 등록		    ***");
		System.out.println("** 2. 교사 등록		    ***");
		System.out.println("** 3. 직원 등록		    ***");
		System.out.println("** 4. 학생 출력		    ***");
		System.out.println("** 5. 교사 출력		    ***");
		System.out.println("** 6. 직원 출력		    ***");
		System.out.println("** 7. 학생 검색            ***");
		System.out.println("** 8. 학생 삭제            ***");
		System.out.println("** 9. 종    료		    ***");
		System.out.println("***************************");
		System.out.println("메뉴번호를 입력하세요 => ");
		System.out.println("***************************");
	}

	/** 학생객체를 배열에 저장하는 메서드 */
	public void addStudent(Student st) {
		st.inputInfo();// 정보 입력받고
		st.printInfo();// 출력해주고
		System.out.println("위 정보를 저장하시겠습니까? [1.예  2.아니오]");
		int no = sc.nextInt();
		if (no == 1) {
			stuArr[countS++] = st;
//			count++;
			System.out.println(countS + "명 등록 완료!!");
		}
	}// ------------------------------------------------

	/** 등록된 모든 학생들의 정보를 출력하는 메서드 */
	public void printStudents() {
		for (int i = 0; i < countS; i++) {
			stuArr[i].printInfo();
		}
	}

	public void readStudent(Student s1) {
		System.out.println("검색하시려는 학번을 입력해주세요=> ");
		int no =sc.nextInt();
		for(int i=0; i<countS; i++) {
			if(no==stuArr[i].getNo()){
				stuArr[i].printInfo();
				break;
			}else
				{System.out.println("등록되지 않은 번호입니다");}
				break;
		}
	
	}
	
	public void deleteStudent() {
		
	}

	public void addTeacher(Teacher te) {
		te.inputInfo();
		te.printInfo();
		System.out.println("위 정보를 저장하시겠습니까? [1.예  2.아니오]");
		int no = sc.nextInt();
		if (no == 1) {
			teaArr[countT++] = te;
			System.out.println(countT + "명 등록 완료!!");
		}
	}

	public void printTeacher() {
		for (int i = 0; i < countT; i++) {
			teaArr[i].printInfo();
		}
	}

	public void addStaff(Staff sf) {
		sf.inputInfo();
		sf.printInfo();
		System.out.println("위 정보를 저장하시겠습니까? [1.예  2.아니오]");
		int no = sc.nextInt();
		if (no == 1) {
			staArr[countF++] = sf;
			System.out.println(countF + "명 등록 완료!!");
		}
	}

	public void printStaff() {
		for (int i = 0; i < countF; i++) {
			staArr[i].printInfo();
		}
	}

	public static void main(String[] args) {

		SchoolApp2 sa = new SchoolApp2();
		while (true) {

			sa.menu();
			int num = sa.sc.nextInt();
			if (num == 9) {
				System.out.println("잘 가세요~~~");
//				System.exit(0);
				return;
			} // ---------

			switch (num) {
			case 1:// 학생 등록
			{
				if (sa.countS >= sa.stuArr.length) {
					System.out.println("등록 마감 되었어요!! 등록인원: " + sa.countS);
//					return;
					continue;
				}
				Student s1 = new Student();
				sa.addStudent(s1);

//				if (sa.count < sa.stuArr.length) {
//					Student s1 = new Student();
//					sa.addStudent(s1);
//				} else {
//					System.out.println("등록 마감 되었어요!!");
//				}
			}
				break;
			case 2: {
				if (sa.countT >= sa.teaArr.length) {
					System.out.println("등록 마감 되었어요!! 등록인원: " + sa.countT);
					continue;
				}
				Teacher t1 = new Teacher();
				sa.addTeacher(t1);
			}
				break;
			case 3:
				if (sa.countF >= sa.staArr.length) {
					System.out.println("등록 마감 되었어요!! 등록인원: " + sa.countF);
					continue;
				}
				Staff sfa1 = new Staff();
				sa.addStaff(sfa1);
				break;
			case 4:// stuArr에 저장된 객체를 반복문 돌면서 그 정보 출력하기
					// s1.printInfo();
				sa.printStudents();
				break;
			case 5:
				sa.printTeacher();
				break;
			case 6:
				sa.printStaff();
				break;
			case 7:
				Student s1 = new Student();
				sa.readStudent(s1);
				break;
			case 8:
			default:
				System.out.println("입력오류!!! 메뉴에 없는 번호에요!");
			}// switch

		} // while----

	}// main()-----------

}// -------class end
