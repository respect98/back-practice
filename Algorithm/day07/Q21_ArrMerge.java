package day07;
import java.util.*;
//static import 
import static java.lang.System.*;

public class Q21_ArrMerge {

	public static void main(String[] args) {
		Q21_ArrMerge app=new Q21_ArrMerge();
		Scanner sc=new Scanner(in);
		System.out.println("배열 1의 크기: ");
		int n=sc.nextInt();
		
		System.out.println("배열 2의 크기: ");
		int m=sc.nextInt();
		
		int[] a=new int[n];
		int[] b=new int[m];
		
		System.out.println("배열1에 저장할 값 입력: ");
		//a만큼 반복돌면서 입력받기
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		System.out.println("배열2에 저장할 값 입력: ");
		//b만큼 반복돌면서 입력받기
		for(int i=0;i<b.length;i++)
			b[i]=sc.nextInt();
		
//		int c[]=app.merge(a, b);
	   int c[]=app.merge2(a, b);
	   System.out.println(Arrays.toString(c));
	
	}//-----------------------
	public int[] merge(int[]a, int[] b) {		
		int []target=new int[a.length+b.length];
		arraycopy(a,0,target,0,a.length);
		//배열 a의 요소를 target으로 copy한다.
		arraycopy(b,0, target, a.length, b.length);
		out.println(Arrays.toString(target));
		System.out.println("--------------------------");
		Arrays.sort(target);
		out.println(Arrays.toString(target));
		return target;
	}//------------------------------------
	
	public int[] merge2(int[]a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		int pa=0;
		int pb=0;
		int c[]=new int[a.length+b.length];
		int pc=0;
		while(pa<a.length && pb<b.length) {
			c[pc++]=(a[pa]<b[pb])? a[pa++]: b[pb++];
		}
		if(pa<a.length) c[pc++]=a[pa++];
		if(pb<a.length) c[pc++]=a[pb++];
		return c;
	}

}/////////////////////////////////////////




