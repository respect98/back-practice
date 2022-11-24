package day12;
/*ObjectOutputStream
 * : 자바의 다양한 자료형과 객체를 저장할 수 있는 스트림
 * - 1byte기반 스트림
 * - 필터 스트림
 * */
import java.io.*;
import javax.swing.*;
import java.util.Date;
public class ObjectInOut {

	public static void main(String[] args)
	throws Exception
	{
		String fname="src/day12/obj2.txt";
		//데이터 목적지(파일)==>FileOutputStream==>ObjectOutputStream
		FileOutputStream fos = new FileOutputStream(fname);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		JFrame f = new JFrame("오브젝트 스트림");
		
		oos.writeObject(f);//객체를 파일에 쓰기한다
		oos.flush();
		
		Date d=new Date();
		oos.writeObject(d);
		oos.flush();
		
		Member m1 =new Member("홍길동","123","010-1111-2222");
		Member m2 =new Member("김길동","234","010-2111-2222");
		Member m3 =new Member("홍영희","345","010-3111-2222");
		
		oos.writeObject(m1);
		oos.flush();
		
		oos.writeObject(m2);
		oos.flush();
		
		oos.writeObject(m3);
		oos.flush();
		
		System.out.println(fname+"에 저장 완료!!!");
		
		oos.close();
		fos.close();
		
	}

}
