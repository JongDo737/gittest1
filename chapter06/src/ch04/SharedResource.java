package ch04;

class BankAccount {
	private int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		if (this.money <= 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		} else {
			this.money = money;
		}
	}

	// �Աݱ��
	public  void saveMoney(int money) {
		
		synchronized (this) {	//����ȭ ��
			int currentMoney = getMoney();
			System.out.println("currentMoney : " +currentMoney);
			System.out.println("�Աݾ� : "+money);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			setMoney(currentMoney + money);
		}
		
		
		System.out.println("�Ա� �� ���� �ܾ� : " + getMoney());
	}

	// ��� ���
	public synchronized void withdrawMoney(int money) {
		int currentMoney = getMoney();
		System.out.println("currentMoney : " +currentMoney);
		System.out.println("��ݾ� : "+money);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (currentMoney < money) {
			System.out.println("�ܾ��� �����մϴ�.");
		} else {
			setMoney(currentMoney -= money);
			System.out.println("��� �� ���� �ܾ� : " + getMoney());
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
		//�Ա��ϱ�
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
		//����ϱ�
		account.withdrawMoney(5_000);
	}
}
public class SharedResource {

	public static void main(String[] args) {

		// ���� 10���� ���� �Ǿ��ִ� ���·� ��ü ����
		BankAccount account = new BankAccount();
		System.out.println(account.getMoney());
		//���°� �����ڿ� ��
		Father father = new Father(account);
		Mother mother = new Mother(account);
		
		// �ƹ����� �Ա��ϴ� ����
		father.start();
		// ������ ����ϴ� ����
		mother.start();
		
		//���� ó���ݾ� : 10+1 -0.5 = 10.5����
		// ����� 120000 ???? <--- �ǵ�ġ ���� ����� ���� �� �ִ�.
		//�ƺ��� �Ա��Ϸ��� �ϴµ� 3�ʰ� �ɸ��µ� �߰��� ������ ����� �ؼ� �Ա��� 
		//ó�� ���� ���� ���·� ����� �Ϸ��ϴ� �Աݵ� 10���������ϴ°Ű� 
		//��ݵ� 10������ ���·� ����� �ع���
		
		//����ȭ
		// �Ӱ迵���� �߻� �ɶ��� ( �۾��� ���� �ڿ��� �����ϴ� ����)
		//�����ڿ�(������) ����ϰ� �ֱ� ������ ��ȣ ó���� ���־���Ѵ�.
		//�ٸ� �۾��ڰ� ������� ���ϵ��� lock�� �ɾ��ش�.
		//������ ���Ѽ� �۾��� �ϰ� �Ѵ�.
		//synchronized
		
	}

}
