package ch04;

class BankAccount {
	private int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		if (this.money <= 0) {
			System.out.println("잘못된 입력입니다.");
		} else {
			this.money = money;
		}
	}

	// 입금기능
	public  void saveMoney(int money) {
		
		synchronized (this) {	//동기화 블럭
			int currentMoney = getMoney();
			System.out.println("currentMoney : " +currentMoney);
			System.out.println("입금액 : "+money);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			setMoney(currentMoney + money);
		}
		
		
		System.out.println("입금 후 계좌 잔액 : " + getMoney());
	}

	// 출금 기능
	public synchronized void withdrawMoney(int money) {
		int currentMoney = getMoney();
		System.out.println("currentMoney : " +currentMoney);
		System.out.println("출금액 : "+money);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (currentMoney < money) {
			System.out.println("잔액이 부족합니다.");
		} else {
			setMoney(currentMoney -= money);
			System.out.println("출금 후 계좌 잔액 : " + getMoney());
		}
	}
}// end of bankAccount class

class Father extends Thread {
	BankAccount account;

	public Father(BankAccount account) {
		this.account = account;
	}
	@Override
	public void run() {
		//입금하기
		account.saveMoney(10_000);
	
	}
	
}
class Mother extends Thread{
	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account = account;
	}
	@Override
	public void run() {
		//출금하기
		account.withdrawMoney(5_000);
	}
}
public class SharedResource {

	public static void main(String[] args) {

		// 현재 10만원 저금 되어있는 상태로 객체 생성
		BankAccount account = new BankAccount();
		System.out.println(account.getMoney());
		//계좌가 공유자원 됌
		Father father = new Father(account);
		Mother mother = new Mother(account);
		
		// 아버지가 입금하는 동작
		father.start();
		// 엄마가 출금하는 동작
		mother.start();
		
		//정상 처리금액 : 10+1 -0.5 = 10.5만원
		// 결과값 120000 ???? <--- 의도치 않은 결과를 만날 수 있다.
		//아빠가 입금하려고 하는데 3초가 걸리는데 중간에 엄마가 출금을 해서 입금이 
		//처리 되지 않은 상태로 출금을 하려하니 입금도 10만원에서하는거고 
		//출금도 10만원인 상태로 출금을 해버림
		
		//동기화
		// 임계영역이 발생 될때는 ( 작업자 간에 자원을 공유하는 상태)
		//현재자원(데이터) 사용하고 있기 때문에 보호 처리를 해주어야한다.
		//다른 작업자가 사용하지 못하도록 lock을 걸어준다.
		//순서를 자켜서 작업을 하게 한다.
		//synchronized
		
	}

}
