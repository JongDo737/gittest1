package ch07;

public class MainTest1 {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		// ��� ������ ���� Ȯ��
		// �⺻�����ڷ� ���������� �ʱ�ȭ��
		// int balance ---> 0
		// double ---> 0.0
		//String ---> null

		bank.deposit(10_000);
		bank.showInfo();
		
		int money = bank.withdraw(6000);
		System.out.println("���� ���� : "+money+"��");
		bank.showInfo();
		
		//������ �Ǽ��� ��� ������ �ٷ� �����ؼ� �ܾ��� ������.
//		bank.balance = 100_000; 
		bank.showInfo();
		
		//
		// getter, setter --> ���� ���� �����ϱ� ������ 
		//������ ���忡�� �߰� ����� ������ ��.
		//read only
		int returnMoney = bank.getBalance();
		System.out.println(returnMoney);
		
		//setter ����غ���
		bank.setBalance(-10000);
		bank.showInfo();
		
		//���� ���� ������
		//4
		// public - ������ ������ ����ϰ� �Ѵ�.
		// default - ���� ��Ű�� ������ ������ ����Ѵ�.
		// protected - ��Ӱ��迡�� ������ ��� �Ѵ�.
		// private - ���� Ŭ���������� ������ ����Ѵ�. 
		// ----> �ٸ� Ŭ���������� getter setter�� �����ؾ��Ѵ�.
	}

}
