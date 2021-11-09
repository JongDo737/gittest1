package practice06;

class BankAccount{
	
	private int money = 100_000;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	//�Ա� ���
	public synchronized void saveMoney(int money) {
		int currentMoney = getMoney();
		System.out.println("�Ա��� �մϴ�.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("�Ա� �� �ܾ� : "+getMoney());
	}
	//��� ���
	public synchronized void withdrawMoney(int money) {
		int currentMoney = getMoney();
		System.out.println("����� �մϴ�.");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(currentMoney - money);
		System.out.println("��� �� �ܾ� : "+getMoney());
		
	}
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
		account.withdrawMoney(5_000);
	}
}

public class SharedResource {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		Father father = new Father(account);
		Mother mother= new Mother(account);
		
		father.run();
		mother.run();

	}

}
