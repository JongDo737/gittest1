package ch09;

public class EmployeeMainTest {

	public static void main(String[] args) {
		
		int temp =Employee.getSerialNum(); // <--- static 메서드
		System.out.println(temp);
//		Employee test1;
//		test.getEmployeeId(); // <---- 일반 메서드
		
		
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
	
		//static 변수, 멤버 변수, 지역 변수, ----> 메모리 위치확인
		//1
		// employee1 ~ 5 : 인스턴스 변수로 접근해서 getSerialNum()
		//실행
		System.out.println(employee1.getSerialNum());
		System.out.println(employee2.getSerialNum());
		System.out.println(employee3.getSerialNum());
		System.out.println(employee4.getSerialNum());
		System.out.println(employee5.getSerialNum());
		
		//2
		// 클래스 이름으로 접근해서 getSerialNum() 메서드를 사용
		Employee.getSerialNum();
	
	}//end of main

}//end of class