package ch04;

public class Subway {

	//ȣ����ȣ, �°���, ���ͱ�
	int lineNumber;
	int passengerCount;
	int money;
	
	//������ - ȣ����ȣ�� �޴� ������
	public Subway(int lineNum) {
		this.lineNumber = lineNum;
	}
	//�޼��� take, showInfo
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("����ö ȣ����ȣ : "+lineNumber);
		System.out.println("�°��� : "+passengerCount);
		System.out.println("���� ���ͱ� : "+money+"��");
		System.out.println("==============");
	}
}
