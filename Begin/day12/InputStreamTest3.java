package day12;
import java.io.*;
public class InputStreamTest3 {

	public static void main(String[] args)
	throws IOException{
		//달걀판 만들기
		byte[] data=new byte[6];
		int n=0, count=0, total=0;
		System.out.println("입력하세요=>");
		while((n=System.in.read(data))!=-1);{
		//입력받은 데이터는 data배열에 담긴다
		//n=> 달갈판에 담은 달걀개수를 반환
//		System.out.write(n); [x]
//		System.out.write(data);==>쓰레기 값이 나올 수 있다.
		System.out.write(data,0,n);//[0]
		count++; //반복문 횟수
		total+=n; //입력받은 바이트 수
		}
		System.out.println("*****************");
		System.out.println(total+"bytes");
		System.out.println("*****************");
		System.in.close();
		System.out.close();
	}

}
