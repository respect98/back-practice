package day12;
import java.io.*;
import java.net.*;

public class RemoteIO {

	public static void main(String[] args) throws IOException 
	
	{
		String str="https://www.naver.com";
		URL url=new URL(str);
		URLConnection con=url.openConnection();
		//해당 url로 접속함
		InputStream is=con.getInputStream();
		//BufferedReader로 필터링해서
		//PrintWriter로 콘솔에 출력해보기
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintWriter pw = new PrintWriter(System.out, true);
		
		String line="";
		int count=0;
		while((line=br.readLine())!=null) {
			pw.println(++count+" : "+line);
		}
		pw.close();
		br.close();
	}

}
