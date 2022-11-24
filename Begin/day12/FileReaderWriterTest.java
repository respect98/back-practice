package day12;
/*파일 카피
 * FileReader / FileWriter
 * - 2byte 기반(char) 스트림
 * - 노드 스트림(파일과 노드 연결함)
 * */
import java.io.*;
import javax.swing.*;
public class FileReaderWriterTest {

	public static void main(String[] args) 
	throws Exception
	{
		String file = JOptionPane.showInputDialog("읽을 파일명을 입력하세요");
		//src/day12/ObjectInOut.java
		if(file==null) return;
		
		FileReader fr = new FileReader(file);
		FileWriter fw = new FileWriter("src/day12/copy4.txt", true);
		
		File f = new File(file);//파일 객체
		long fsize=f.length();//파일 크리를 반환
		System.out.println("읽을 파일 크기: "+fsize+"bytes");
		
		int n=0;
		char [] data = new char[1000];
		while((n=fr.read(data))!=-1) {
			fw.write(data, 0, n);
			fw.flush();
		}
		System.out.println("copy완료");
		fw.close();
		fr.close();
	}

}
