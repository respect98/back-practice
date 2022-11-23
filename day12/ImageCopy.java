package day12;
import java.io.*;
/*bg.jpg를 읽어서 copy.jpg로 내보내자
 * 데이터 소스: bg.jpg(파일) ===>FileInputStream
 * 데이터 목적지 : copy.jpg(파일) ===>FilOutputStream
 * 바이트 수 출력하기
 * */
public class ImageCopy {

	public static void main(String[] args) 
	throws Exception
	{
		String fname = "images/bg.jpg"; // 읽을 파일
		String target = "copy.jpg";//목적 파일
	
		FileInputStream fis=new FileInputStream(fname);
		byte data[] = new byte[1000];
		FileOutputStream fos = new FileOutputStream(target);
		int n=0, count=0, total=0;
		while((n=fis.read(data))!=-1) {
			fos.write(data, 0, n);
			fos.flush();
			total+=n;
		}
		System.out.println(target+"에"+total+"바이트만큼 썼어요");
		fos.close();
		
	}

}
