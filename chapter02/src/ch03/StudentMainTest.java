package ch03;

//클래스를 사용하는 입장
public class StudentMainTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.stuName = "이순신";
		studentLee.address = "인천";
		studentLee.showStuInfo();

		Student studentKim = new Student();
		studentKim.stuName = "김유신";
		studentKim.address = "경주";
		studentKim.showStuInfo();

		System.out.println("----------");

		String name1 = studentKim.getStuName();
		System.out.println("name1 : "+name1);
	
		String name2 = studentLee.getStuName();
		System.out.println("name2 : "+name2);
	}// end of main

}// end of class
