package ch03;

//클래스를 설계하는 입장
public class Student {
	
	//멤버변수
	public int stuID;
	public String stuName;
	public String address;
	
	//메서드 (멤버변수를 이용해서 객체의 기능을 만들어낸다.
	public void showStuInfo() {
		System.out.println(stuName+" , "+address);
	}
	public String getStuName() {
		return stuName;
	}
	
}
