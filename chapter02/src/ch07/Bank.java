package ch07;

public class Bank {

	//���� ����
	private int balance;
	//	private�� �����س����� ��������� ������ ����.
	// �޼���

	// �Ա�
	public void deposit(int money) {
		balance += money;
	}

	// ���
	public int withdraw(int money) {
		balance-=money;
		return money;
	}
	public void showInfo() {
		System.out.println("���� �ܾ� : "+balance+"��");
	}
	
	//getter �޼��� �����
	// �Ϲ������� get() �޼��带 ���� �ܺο��� Ȯ���� �� �ֵ��� �����Ѵ�
	public int getBalance() {
		return balance;
	}
	
	// setter �޼��� �����
	//�Ϲ������� set() �޼��带 �����ؼ� �ܺο��� ��� ������ ������ �� �ֵ��� 
	//�����Ѵ�.
	public void setBalance(int balance) {
		if(balance <0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		else {
			this.balance = balance;			
		}
	}
	
}
// public class �� .java ���� �ȿ��� �� �ϳ��� ����� �� �ִ�.
class Student{
	
}
