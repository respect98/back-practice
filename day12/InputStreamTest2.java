package day12;
import java.io.*;
//System.out : PrintStream
//	- 1byte기반 스트림
//	- 노드 스트림(콘솔하고 노드 연결)
// 	- print(), println(), printf()
//	- write(int n)
//	- write(byte[] data, int off, int len)
public class InputStreamTest2 {

	public static void main(String[] args) throws IOException {
		int n=0, count=0;
		System.out.println("입력하세요=>");
		while((n=System.in.read())!=-1) {//Ctrl+C를 누르기 전까지 계속 입력받아
//			System.out.println((char)n);
			System.out.write(n);
			count++;
		}
		System.out.println("***************************");
		System.out.println(count+"바이트 읽음");
		System.out.println("***************************");
		System.in.close();
		System.out.close();
	}

}
