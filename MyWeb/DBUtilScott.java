package common.util;
import java.sql.*;
public class DBUtilScott {
	
	static String url="jdbc:oracle:thin:@localhost:1521:XE";
	static String user="scott", pwd="tiger"; 
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이버 로딩
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	//throws :
//	 현재 메서드를 호출한 메서드로 예외를 떠넘길 수 있습니다, 호출한곳에서 try-catch로 예외처리
	public static Connection getCon() throws SQLException{
		Connection con=DriverManager.getConnection(url, user, pwd); //드라이버 접속
		return con;
	}

}////////////////////////////////////////////

/*1.JDBC드라이버 로드
 *Java에서 DB에 접속하려면 사용하는 DB벤더가 제공하는 class를 불러와야 함
 *-> Class.forName("jdbc.oracle.driver.OracleDriver") 
 *클래스를 로드할 때 클래스가 존재 하지 않을 때 처리할 예외 처리도 해줘야 함
 *-> ClassNotFoundException e -> 에러의 발생근원지를 찾아서 단계별로 에러를 출력합니다.
 *
 *2.데이터 베이스 연결
 *Connection conn = DriverManger.getConnection(url,id,password);
 *여기서 url은 접속할 DB가 있는 서버의 정보
 *String url = "jdbc:orcle:thin:@localhost:1521:XE";
 *
 *3.Statement생성
 *DB에 접속했으니 query문을 보내야하고 이를 담을 수 있는 statement를 생성하자
 *query는 데이터베이스에게 특정한 데이터를 보여달라는 클라이언트(사용자)의 요청을 말함
 *쿼리문을 작성한다라는 말은 데이터베이스에서 원하는 정보를 가져오는 코드를 작성한다 정도로 이해하기
 *-> Statement stmt = conn.createStatement();
 *Connection.createStatement메소드로 Statement인스턴스 반환받아 사용
 *
 *4.쿼리문전송 & 결과문 수신
 *-> ResultSet result = stmt.excuteQuery("select * from emp");
 *-> SELECT한 내용 RS에 넣기
 *select문처럼 반환값이 검색한 내용을 담고 있는 쿼리는 excuteQuery로,
 *update, insert, delete같이 반환값이 몇개 성공, 실패 int형으로 반환되는 쿼리는 excuteUpdate를 사용
 *Result값의 접근은
 *-> while(result.next()){
 *		System.out.println(result.getString(1));
 *	 }
 *으로 가능
 *
 *5.연결 해제
 *-> if(state!=null) state.close();
 *-> if(conn!=null) conn.close(); 
 *예외처리도 필요
 **/

//=============================================================================================

/*PreparedStatement를 사용하는 순서
 * 1.Connection.prepareStatement() 메소드를 사용하여 PreparedStatement 생성
 * 2.PreparedStatement의 set 메소드를 사용하여 필요한 값 지정
 * 3.PreparedStatement의 executeQuery()또는 excuteUpdate() 메소드를 사용하여 쿼리 실행
 * 4.finally블록을 사용한 PreparedStatement를 닫는다.(close()메서드 실행)
 * 
 * ex)
 * -> PreparedStatement를 생성할 때에는 실행할 쿼리를 미리 입력하는데 다음과 같이 값 부분을 물음표('?')로 대치한 쿼리를 사용
 * -> PreparedStatement ps = null;
 * ...
 * -> ps = conn.prepareStatement("insert into MEMBER (MEMBERID, NAME, EMAIL) values(?,?,?)");
 * 위와 같이 PreparedStatement객체를 생성한 후, PreparedStatement가 제공하는 set계열의 메서드를 사용하여
 * 물음표를 대체할 값을 지정해 주어야 함
 * -> ps.setString(1,"aa"); //첫번째 물음표의 값 지정
 * -> ps.setString(2,"bb"); //두번째 물음표의 값 지정
 * 
 * ResultSet의 get계열의 메서드와 마찬가지로 PreparedStatement는 각각의 SQL타입을 처리할 수 있는 set계열의 메서드를 제공함
 * -> SetString(int index, String x) : 지정한 인덱스의 파라미터 값을 x로 지정함
 * 
 * -> SetCharacterStream(int index, Reader reader, int length) : 지정한 인덱스의 파라미터 값을 LONG VARCHAR타입의
 * 값으로 지정할때 사용, Reader는 값을 읽어올 스트림이며, length는 지정한 문자의 길이를 나타냄
 * 
 * -> SetInt(int index, int y) : 지정한 인덱스의 파라미터 값을 int 값 x로 지정함
 * 
 * -> SetLong(int index, long x) : 지정한 인덱스의 파라미터 값을 double값 x로 지정함
 * 
 * -> SetDouble(int index, double x) : 지정한 인덱스의 파라미터 값을 double값 x로 지정함
 * 
 * -> SetFloat(int index, float x) : 지정한 인덱스의 파라미터 값을 float값 x로 지정함
 * 
 * -> SetTimestemp(int index, Timesetamp x) : 지정한 인덱스 값을 SQL TIMESTAMP파일을 나타내는 
 * java.sql.Timestamp타입으로 지정함
 * 
 * -> SetDate(int index, Date x) : 지정한 인덱스의 값을 SQL DATE 타입을 나타내는 java.sql.Date타입으로 지정
 * 
 * -> SetTime(int index, Time x) : 지정한 인덱스의 값을 SQL TIME 타입을 나타내는 java.sql.Time타입으로 지정
 * 
 * <Statement쿼리를 사용해도 되는데 굳이 PreparedStatement 쿼리를 사용하는 이유>
 * -반복해서 실행되는 동일 쿼리의 속도를 증가시키기 위해
 * -값 변환을 자동으로 하기 위해
 * -간결한 코드를 위해
 * 
 * 
 * */

