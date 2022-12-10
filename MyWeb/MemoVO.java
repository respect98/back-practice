package memo.model;
import java.sql.Date;
//VO(Value Object), DTO(Data Transfer Object)
//VO(Value Object) 값 오브젝트로써 값을 위해 쓰입니다. read-Only 특징(사용하는 도중에 변경 불가능하며 
//오직 읽기만 가능)을 가집니다. DTO와 유사하지만 DTO는 setter를 가지고 있어 값이 변할 수 있습니다.
//DTO(Data Transfer Object) 는 계층 간 데이터 교환을 하기 위해 사용하는 객체로,
//DTO는 로직을 가지지 않는 순수한 데이터 객체(getter & setter 만 가진 클래스)입니다.
//domain객체 
//db table의 record ===> 클래스로 옮겨 구성
public class MemoVO {
	private int idx;
	private String name;
	private String msg;
	private java.sql.Date wdate;

	public MemoVO() {

	}

	public MemoVO(int idx, String name, String msg, Date wdate) {
		this.idx = idx;
		this.name = name;
		this.msg = msg;
		this.wdate = wdate;
	
	}	
	//setter, getter--------
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public java.sql.Date getWdate() {
		return wdate;
	}
	public void setWdate(java.sql.Date wdate) {
		this.wdate = wdate;
	}
}////////////////////////////////
