package ch07;

public class MainTest1 {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		// 멤버 변수의 성질 확인
		// 기본생성자로 생성했을때 초기화됌
		// int balance ---> 0
		// double ---> 0.0
		//String ---> null

		bank.deposit(10_000);
		bank.showInfo();
		
		int money = bank.withdraw(6000);
		System.out.println("현재 현금 : "+money+"원");
		bank.showInfo();
		
		//신입이 실수로 멤버 변수에 바로 접근해서 잔액을 수정함.
//		bank.balance = 100_000; 
		bank.showInfo();
		
		//
		// getter, setter --> 현재 값만 리턴하기 떄문에 
		//개발자 입장에서 추가 사용의 여지를 줌.
		//read only
		int returnMoney = bank.getBalance();
		System.out.println(returnMoney);
		
		//setter 사용해보기
		bank.setBalance(-10000);
		bank.showInfo();
		
		//접근 제어 지시자
		//4
		// public - 누구나 접근을 허용하게 한다.
		// default - 같은 패키지 내에서 접근을 허용한다.
		// protected - 상속관계에서 접근을 허용 한다.
		// private - 같은 클래스에서만 접근을 허용한다. 
		// ----> 다른 클래스에서는 getter setter로 접근해야한다.
	}

}
