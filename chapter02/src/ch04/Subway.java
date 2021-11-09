package ch04;

public class Subway {

	//호선번호, 승객수, 수익금
	int lineNumber;
	int passengerCount;
	int money;
	
	//생성자 - 호선번호를 받는 생성자
	public Subway(int lineNum) {
		this.lineNumber = lineNum;
	}
	//메서드 take, showInfo
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
