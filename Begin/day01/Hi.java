package day01;//1. 패키지 선언문이 온다. package 패키지명;
//패키지명은 소문자로 기술한다. 2단계 이상을 주는 것을 권함
import java.lang.System; //2. import문은 패키지 선언문 아래 온다.
// import 패키지경로.클래스명;
//import java.util.Date;
import java.util.Date;

//[1]단문주석
/* [2]복문주석
 * 여러라인을 주석처리 합니다
 */
/** [3] 문서화 주석 ==> javadoc를 이용해서  api문서를 만들때  문서화 주석에 기술된
 * 내용들이 api문서에 들어간다
 * @author 홍길동
 *
 */
public class Hi {
	
	public static void main(String[] args) {
		System.out.println("Hi Java");
		//System.out => 시스템의 표준출력장치
		Date d =new Date ();
		System.out.println(d);
		
		System.out.println("안녕 자바");
		System.out.println("반갑습니다.");
		System.out.println("저는 웹서비스 백엔드 개발자 과정의 \n조은경입니다.");
		/*escape 문자
		 \n : 개행문자(줄바꿈이 일어난다)
		 \t : 탭 키 만큼 띄어쓰기를 한다
		 \" : 쌍따옴표를 출력하고자 할 때 사용
		 \' : 홑따옴표를 출력하고자 할 때 사용
		 \\ : 역슬래시(\)를 출력하고자 할 때 사용
		 \r : 캐리지리턴. 커서를 맨 앞으로 이동시킨다
		 */
		 System.out.println("국어\t영어\t수학");
		 System.out.println("----------------------------------");
		 System.out.println("90\t85\t77");
		 
		 /*
		  * 김소월 님의 '진달래 꽃'
		  * "나보기가 역겨워 가실 때에는..."
		  * "말없이 고이 보내 드리오리다"*/
		 System.out.println("김소월 님의 \'진달래 꽃\'");
		 System.out.println("\"나보기가 역겨워 가실 때에는...\"");
		 System.out.println("\"말없이 고이 보내 드리오리다.\"");
		 System.out.println("역슬래시(\\)");
		 System.out.println("Hello World\rA");
		 System.out.println("============================");
		 //System.out.printf("출력서식", 출력할 내용들)
		 //출력 서식 %지시자
		 /* %d: 정수형식으로 출력
		  * %f: 소수점 형식으로 출력
		  * %s: 문자열 형식으로 출력
		  * %b: boolean형식으로 출력
		  * %n : 줄바꿈
		  * */
		 System.out.printf("제 이름은 %s이고 제 나이는 %d살 입니다%n", "조은경",25);
		 System.out.printf("제 평균 성적은 %f입니다\n",95.33333);
		 System.out.printf("제 평균 성적은 %.2f입니다\n",95.33555);
		 //소수점 이하 2째자리 까지 출력 (반올림)
		 System.out.printf("%4d%n",1); //4자리를 차지하고 1을 출력
		 System.out.printf("%4d%n",10);
		 System.out.printf("%4d%n",100);
		 //-를 사용하면 왼쪽 정렬이 된다
		 System.out.printf("%-4d%n",1);
		 System.out.printf("%-4d%n",10); 
		 System.out.printf("%-4d%n",100); 
		 //0을 이용하면 오른쪽 정렬을 하면서 남은 공간의 왼쪽 자리는 0으로 채운다
		 System.out.printf("%04d%n",100);
		 //4자리를 차지하고 100을 출력하고 앞에 남은 공간을 0으로 채운다.
	
	}
	
	
	

}
