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
	
	// static �޼��� Ȱ��
	// ����ƽ�� heap ������ �ƴϱ� ������
	// �����ϱ� ���� ����� �� ���� ( �ٸ����� )
	public static int getSerialNum() {
		//���� : static �޼��� �ȿ����� ��� ������ ����� �� ����.
//		department = "������";
		//���� : static�� new�� ����ϱ��� ���ÿ����� �ö�����
		// ��� ������ static�޼��� �ȿ����� �޸𸮿� �ö󰬴��� �˼� ���⶧��
		//���� : ��ü�� ��������� ���� �����ؼ� ����� �� �ִ� static�̱� �����Դϴ�.
		//��ü�� �����Ǳ� ���� ����� �� �ִ� �޼���
		return serialNum;
	}
	
	
	
	
}