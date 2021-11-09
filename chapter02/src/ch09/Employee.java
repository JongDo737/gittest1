package ch09;

public class Employee {

	public static int serialNum = 1000;
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
		
	}
	
	//get()

	public int getEmployeeId() {
		return employeeId;
	}
	
	// static 메서드 활용
	// 스테틱은 heap 영역이 아니기 때문에
	// 선언하기 전에 사용할 수 있음 ( 다른영역 )
	public static int getSerialNum() {
		//주의 : static 메서드 안에서는 멤버 변수를 사용할 수 없다.
//		department = "개발팀";
		//이유 : static은 new를 사용하기전 스택영역에 올라가지만
		// 멤버 변수는 static메서드 안에서는 메모리에 올라갔는지 알수 없기때문
		//정리 : 객체가 만들어지기 전에 접근해서 사용할 수 있는 static이기 때문입니다.
		//객체가 생성되기 전에 실행될 수 있는 메서드
		return serialNum;
	}
	
	
	
	
}