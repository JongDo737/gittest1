package ch03;

//Ŭ������ �����ϴ� ����
public class Student {
	
	//�������
	public int stuID;
	public String stuName;
	public String address;
	
	//�޼��� (��������� �̿��ؼ� ��ü�� ����� ������.
	public void showStuInfo() {
		System.out.println(stuName+" , "+address);
	}
	public String getStuName() {
		return stuName;
	}
	
}
