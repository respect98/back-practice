package day07;
import java.util.*;
public class Q19_GradeKor {
	
	public int[] getKorGrade(int n, int [] kor) {
		int[] grade=new int[n];
		for(int i=0;i<n;i++) {
			grade[i]=1;
			for(int j=0;j<n;j++) {
				if(kor[i]<kor[j]) {
					grade[i]++;
				}
			}
		}//for------
		return grade;
	}//------------------------

	public static void main(String[] args) {
		Q19_GradeKor app=new Q19_GradeKor();
		// 학생수 입력받기
		// 학생수 만큼 국어 성적 입력받기
		
		//getKorGrade()호출하면 ==>각 국어 성적에 대한 등수를 배열에 담아 반환
		Scanner sc=new Scanner(System.in);
		System.out.println("학생 수 입력 : ");
		int n=sc.nextInt();
		int kor[]=new int[n];
		System.out.println("국어 성적 "+n+"개 입력");
		for(int i=0;i<n;i++) {
			kor[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(app.getKorGrade(n, kor)));
	}

}
