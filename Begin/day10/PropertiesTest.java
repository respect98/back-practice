package day10;
/*Map계열
 * xxx.properties 유형의 파일을 읽어서 해당 파일에 저장된 내용을 자바로
 * 옮기고자 할 때 사용한다.
 * */

import java.util.*;
import java.io.*;
public class PropertiesTest {

	public static void main(String[] args) throws FileNotFoundException, Exception{
//		String loc="C:\\MyJava\\Workspace\\Begin\\src\\day10\\database.properties";
		String loc="src/day10/database.properties";
		Properties prop = new Properties();
		InputStream is = new FileInputStream(loc);
		prop.load(is);
		is.close();
		//properties파일 내용을 읽어서 Properties객체로 옮겨 놓는다.
		String type=prop.getProperty("DbType");
		System.out.println(type);
		
		String url=prop.getProperty("DbUrl");
		System.out.println(url);
		
		System.out.println(prop.get("DbUser")+"/"+prop.getProperty("DbPwd"));
		
		System.out.println(prop.getProperty("mgs","즐거운 하루 되세요~~~~"));

	}

}
