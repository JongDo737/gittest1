package ch03;

//Ŭ������ ����ϴ� ����
public class StudentMainTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.stuName = "�̼���";
		studentLee.address = "��õ";
		studentLee.showStuInfo();

		Student studentKim = new Student();
		studentKim.stuName = "������";
		studentKim.address = "����";
		studentKim.showStuInfo();

		System.out.println("----------");

		String name1 = studentKim.getStuName();
		System.out.println("name1 : "+name1);
	
		String name2 = studentLee.getStuName();
		System.out.println("name2 : "+name2);
	}// end of main

}// end of class
