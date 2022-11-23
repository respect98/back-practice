package day12;
import java.io.*;
//파일을 읽되 라인단위로 읽어서 앞에 줄번호를 붙여 콘솔에 출력하자
//데이터소스: 파일(FileInputStream)==>InputStreamReader=>BufferedReader
//		  : 파일(FileReader) ==> BufferedReader
//데이터목적지: 콘솔(System.out) ==> PrintWriter
public class BufferedReaderPrintWriterTest {

	public static void main(String[] args) 
	throws Exception
	{
		String fname="src/day12/BufferedReaderWriterTest.java";
		BufferedReader br
		=new BufferedReader(new FileReader(fname));
		PrintWriter pw
		=new PrintWriter(System.out, true);
		//true를 주면 new line을 만났을 때 자동으로 flush해준다(auto flush)
		String line="";
		int cnt=0;
		while((line=br.readLine())!=null) {
//			pw.write(++cnt+": "+line+"\n");
//			pw.flush();
			pw.println(++cnt+": "+line);
			//println()을 하면 true줄 경우 자동 플러시 된다.
		}
		pw.close();
		br.close();
	}

}
