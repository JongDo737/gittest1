package ch01;

public class StudentMainTest2 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		//1. �����ؼ� name,height,weight,grade
		//���� �༭ ȭ�鿡 ������ּ���
		student1.name = "������";
		student1.height = 180;
		student1.weight = 72;
		student1.grade = 1;  
		System.out.println("ù��° �л�\n�̸� : "+student1.name+"\nŰ : "+student1.height+"\n������ : "+student1.weight+"\n�г� : "+student1.grade);
		
		System.out.println("---------");

		Student student2 = new Student();
		//1. �����ؼ� name,height,weight,grade
				//���� �༭ ȭ�鿡 ������ּ���
		student2.name = "��";
		student2.height = 170;
		student2.weight = 50;
		student2.grade = 4;  
		System.out.println("�ι�° �л�\n�̸� : "+student2.name+"\nŰ : "+student2.height+"\n������ : "+student2.weight+"\n�г� : "+student2.grade);
		
		
		
		
	}

}
