package day10;
//도메인 객체(VO=Value Object, DTO-Data Transfer Object)
public class Person {

	private String name;
	private int age;
	
	public Person() {
		this("아무개",1);
		
	}
	public Person(String n, int a) {
		name=n; age=a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*이름과 나이가 같으면 해시셋에 중복 저장되지 않도록 하기 위해
	 * hashCode()와 equals() 오버라이드 하자
	 * */
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person user = (Person)obj;
			boolean bool = ((this.name.equals(user.name))&&(this.age==user.age));
			return bool;
		}else {
			return false;
		}
	}
	
}///////////////////////////////////
