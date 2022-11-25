package day03;
import java.util.Arrays;
import java.util.Scanner;
public class Q20_ArraysBinarySearch {

	static Scanner sc = new Scanner(System.in);
	
	public static void floatBinarySearch() {
		float[] arr = {1.3f, 2.45f, 10, 5.3f, 30e-1f, 7.1f, 'A'};
		Arrays.sort(arr);//정렬을 해준 상태에서 사용하자
		System.out.println("검색할 실수 값을 입력하세요: ");
		float key=sc.nextFloat();
		int idx=Arrays.binarySearch(arr, key);
		//정렬된 배열에서 검색한 index번호를 반환한다.
		if(idx<0) {
			System.out.println(key+"값은 없습니다");
		}else {
			System.out.printf("검색하려는 %.2f값은 %d에 있습니다 arr[%d]=%.2f%n",key,idx, idx, arr[idx]);
		}
		
	}//--------------------------------------
	/*String클래스가 Comparable인터페이스(compareTo()메서드를 구현하고 있음)를 상속받아 구현하고 있기 때문에 정렬이된다.
	 * => 정렬이 되면 이진검색이 가능하다.
	 * */
	public static void StringBinarySearch() {
		String[] str={
			"abstract",   "assert",       "boolean",   "break",      "byte",
	        "case",       "catch",        "char",      "class",      "const",
	        "continue",   "default",      "do",        "double",     "else",
	        "enum",       "extends",      "final",     "finally",    "float",
	        "for",        "goto",         "if",        "implements", "import",
	        "instanceof", "int",          "interface", "long",       "native",
	        "new",        "package",      "private",   "protected",  "public",
	        "return",     "short",        "static",    "strictfp",   "super",
	        "switch",     "synchronized", "this",      "throw",      "throws",
	        "transient",  "try",          "void",      "volatile",   "while"
			};
		System.out.println("검색할 키워드를 입력하세요");
		String keyword=sc.next();
		Arrays.sort(str);
		int idx=Arrays.binarySearch(str, keyword);
		System.out.println("idx: "+idx);
		if(idx<0) {
			System.out.println(keyword+"는 없습니다");
		}else {
			System.out.println("해당 키워드는 str["+idx+"]에 있습니다");
		}
	}//----------------------

	public static void memberBinarySearch() {
		//MEMBER객체 4개 생성해서 배열에 저장
		Member u1=new Member("홍길동", 22,177);
		Member u2=new Member("김길동", 32,157);
		Member u3=new Member("이순신", 27,178);
		Member u4=new Member("최영길", 20,187);
		Member u5=new Member("강길남", 22,167);
		//나이를 기준으로 오름차순 정렬
		Member[] users= {u1,u2,u3,u4,u5};
		System.out.println(Arrays.toString(users));
		System.out.println("------나이 오름차순 정렬---------------");
		Arrays.sort(users);
		System.out.println(Arrays.toString(users));
		//검색할 나이 입력받아서 해당 나이를 가진 회원이 있는 여부를 출력하세요
		System.out.println("검색할 회원의 나이는?");
		int findAge=sc.nextInt();
		int idx=Arrays.binarySearch(users, new Member("",findAge,0));
		if(idx<0) {
			System.out.println(findAge+"세의 회원은 없습니다");
		}else {
			System.out.println(findAge+"세의 회원을 찾았습니다");
			System.out.println(users[idx]);
		}
	}//--------------------------
	
	public static void empBinarySearch() {
		//Emp객체를 4개 이상 생성해서 배열에 저장하세요
		Emp e1=new Emp("Scott", 158);
		Emp e2=new Emp("James",178);
		Emp e3=new Emp("Tom",172);
		Emp e4=new Emp("King",168);
		Emp emps[]= {e1,e2,e3,e4};
		System.out.println(Arrays.toString(emps));
		
		Arrays.sort(emps, Emp.HEIGHT_ORDER);
		System.out.println("--키 오름차순 정렬 후-----------------");
		System.out.println(Arrays.toString(emps));
		//정렬한 뒤 
		System.out.print("키가 몇cm인 사람을 찾고 있나요?");
		int findHeight=sc.nextInt();
		//Arrays binarySearch()이용해서 검색 후 검색한 사람의 모든 정보 출력하세요
		int idx=Arrays.binarySearch(emps,new Emp("",findHeight), Emp.HEIGHT_ORDER);
		if(idx<0) {
			System.out.println(findHeight+"cm 키를 가진 사원은 없습니다.");
		}else {
			System.out.println(findHeight+"cm 키를 가진 사원은 아래와 같습니다.");
			System.out.println(emps[idx]);
		}
		
		
	}
	
	
	public static void main(String[] args) {
//		floatBinarySearch();
//		StringBinarySearch();
//		memberBinarySearch();
		empBinarySearch();
		
		
	}

}
