package day08;

import java.io.*;
import javax.swing.*;

//파일을 읽어서 콘솔에 출력하는 프로그램
//	[1]try~catch
//	[2]throws
/*	Exception
 * 		|
 * 	IOException
 * 		+-------------FileNotFoundException
 * */
public class FileIO {

	public static String reading(String fileName) {
		System.out.println("---" + fileName + "--------------");
		String contents = "";
		FileReader fr = null;
		char[] data = new char[4000];
		try {
		fr = new FileReader(fileName);
		// 파일과 노드 연결

		fr.read(data, 0, data.length);
		// 파일을 읽어서 그 내용을 data배열에 담는다.

		fr.close();
		// 파일 리소스 반환
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어요");
//			e.printStackTrace();
			//스택기록을 출력해서 보여준다.=>어느 지점에서 예외가 발생했는지 알 수 있다.
		}catch(IOException w) {
			System.out.println("파일을 읽을 수 없어요");
		}

		contents = new String(data);

		return contents;
	}

	public static void main(String[] args) {

		String fname = JOptionPane.showInputDialog("읽을 파일명을 입력하세요");
		if (fname == null)
			return;
		String str = reading(fname);
		System.out.println(str);

	}

}
