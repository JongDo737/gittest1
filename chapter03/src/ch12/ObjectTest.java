package ch12;

// ���� ����ϴ� �⺻ Ŭ������ ���� ��Ű��
import java.lang.*;

class Student{
	
	//toString();
	public String toString() {
		return "�л�Ŭ����";
	}
}

public class ObjectTest{ //extends Object ��� Ŭ������ �ֻ��� Ŭ����
									// �ڵ����� ��ӹ���
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1);
		String str1 = new String("�ȳ��ϼ���");
		System.out.println(str1);
		
	}//end of main

}
