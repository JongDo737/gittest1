package ch05;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;

	public Subway(int lineNum) {
		this.lineNumber = lineNum;
	}
	
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
