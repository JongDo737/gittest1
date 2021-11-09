package ch05;

class BankAccount {
	private int money= 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// �Աݱ��
	public synchronized void saveMoney(int money) {
		int currentMoney = getMoney();
		System.out.println(money + "���� �Ա��մϴ�.");
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(". . .");
		}
		setMoney(currentMoney + money);
		System.out.println("���� �ܾ� : "+getMoney());
	}//end of saveMoney

	// ��ݱ��
	public synchronized void withdrawMoney(int money) {
		int currentMoney = getMoney();
		if (currentMoney - money < 0) {
			System.out.println("�ܾ��� �����մϴ�.");
		}
		else {
			System.out.println(money + "���� ����մϴ�.");
			for (int i = 0; i < 2; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(". . .");
			}
			setMoney(currentMoney - money);
			System.out.println("���� �ܾ� : "+getMoney());
		}
	}//end of withdrawMoney

}
class Father extends Thread{
	BankAccount account;
	
	public Father(BankAccount account) {
		this.account = account;
		
	}
	@Override
	public void run() {
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
		account.withdrawMoney(5000);
		
	}
}

public class SharedResource {
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		Father father = new Father(account);
		Mother mother = new Mother(account);
		father.start();
		mother.start();
		
		
		
	}
}
