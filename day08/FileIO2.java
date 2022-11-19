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
public class FileIO2 {

	public static String reading(String fileName) throws IOException  
	{
		System.out.println("---" + fileName + "--------------");
		String contents = "";
		FileReader fr = null;
		char[] data = new char[1000];

		fr = new FileReader(fileName);
		// 파일과 노드 연결

		fr.read(data, 0, 1000);
		// 파일을 읽어서 그 내용을 data배열에 담는다.

		fr.close();
		// 파일 리소스 반환

		contents = new String(data);

		return contents;
	}

	public static void main(String[] args) throws IOException {

		String fname = JOptionPane.showInputDialog("읽을 파일명을 입력하세요");
		if (fname == null)
			return;
		String str = reading(fname);
		System.out.println(str);

	}

}
