package ch09;

public class EmployeeMainTest {

	public static void main(String[] args) {
		
		int temp =Employee.getSerialNum(); // <--- static �޼���
		System.out.println(temp);
//		Employee test1;
//		test.getEmployeeId(); // <---- �Ϲ� �޼���
		
		
		Employee employee1 = new Employee();
		System.out.println(employee1.serialNum);
		System.out.println(employee1.getEmployeeId());
		
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		Employee employee5 = new Employee();
		
		System.out.println(employee5.getEmployeeId());
		System.out.println(employee3.serialNum);
		System.out.println(employee1.serialNum);
	
		//static ����, ��� ����, ���� ����, ----> �޸� ��ġȮ��
		//1
		// employee1 ~ 5 : �ν��Ͻ� ������ �����ؼ� getSerialNum()
		//����
		System.out.println(employee1.getSerialNum());
		System.out.println(employee2.getSerialNum());
		System.out.println(employee3.getSerialNum());
		System.out.println(employee4.getSerialNum());
		System.out.println(employee5.getSerialNum());
		
		//2
		// Ŭ���� �̸����� �����ؼ� getSerialNum() �޼��带 ���
		Employee.getSerialNum();
	
	}//end of main

}//end of class