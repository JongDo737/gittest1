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
		System.out.println("지하철 호선번호 : "+lineNumber);
		System.out.println("승객수 : "+passengerCount);
		System.out.println("현재 수익금 : "+money+"원");
		System.out.println("==============");
	}
}
