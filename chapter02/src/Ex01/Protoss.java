package Ex01;

public class Protoss {
	// �������
	String userName;
	int probe = 4;
	int unitCount = 4;
	int population = 10;
	int mineral = 50;
	int gas;
	int zealot;	
	int dragoon;
	int attackPower; // ���������� ������ + , ���濡�� ������ �Ҷ� �����¼�ġ���ҷ��� �����.
	int nexusHP = 10;
	String chat;
	String build = "�ؼ���";

	// ������
	public Protoss(String userName) {
		this.userName = userName;
	}
	// �޼���

	// �����
	void buildings(String build) {
		this.build += " " + build;
		System.out.println(userName + " : " + build + "��(��) �����ϴ�.");
		System.out.println("---------------------------------");
		if (build.equals("���Ϸ�")) {
			population += 8;
		}
	}

	// �ڿ� ĳ��
	void dig() {
		System.out.println(userName + " : " + "�ڿ��� ĸ�ϴ�.");
		System.out.println("---------------------------------");
		mineral += probe * 50; // �̳׶�ĳ�⸦ �ϸ� ���κ�� 10���� �ش�.
		gas += probe * 30; // �̳׶�ĳ�⸦ �ϸ� ���κ�� 8������ �ش�.
	}

	// ����
	void produce(String product) {
		System.out.println(userName + " : " + product + "��(��) �����մϴ�.");
		System.out.println("---------------------------------");
		if (product.equals("���κ�")) {
			if (mineral >= 50) { // �̳׶��� �����ϸ� ����Ұ�
				mineral -= 50; // �̳׶� ����
				probe++; // ���κ� 1����
				unitCount += 1; // �α��� 1����
			} else {
				System.out.println(userName + " : " + "Not Enough Minerals");
				System.out.println("---------------------------------");
			}
		} else if (product.equals("����")) {
			if (mineral >= 100) {
				mineral -= 100;
				zealot++;
				unitCount += 1;
				attackPower += 2;
			} else {
				System.out.println(userName + " : " + "Not Enough Minerals");
				System.out.println("---------------------------------");
			}

		} else if (product.equals("���")) {
			if (mineral >= 125 && gas >= 50) {
				mineral -= 125;
				gas -= 50;
				dragoon++;
				unitCount += 2;
				attackPower += 2;
			}

			else {
				System.out.println(userName + " : " + "Not Enough Minerals");
				System.out.println("---------------------------------");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println("---------------------------------");
		}
	}

	// ����
	void attack() { // ������ ��ġ ��ȯ
		System.out.println(userName + " : " + "���濡�� �����մϴ�.");
		System.out.println("---------------------------------");
	}

	// ���ݹ���
	void beAttacked(int damage) {
		nexusHP -= damage;

	}

	// ����
	void gameInfo() {
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("�г��� : " + userName);
		System.out.println("���� �ڿ� \n�̳׶� : " + mineral + " ���� : " + gas);
		System.out.println("�α��� : " + unitCount + " / " + population);
		System.out.println("���� ���� : \n���κ� : " + probe + "\n���� : " + zealot + "\n��� : " + dragoon);
		System.out.println("�ǹ��� : " + build);
		System.out.println("������ : "+attackPower);
		System.out.println("�ؼ��� ü�� : " + nexusHP);
		System.out.println("---------------------------------");
		System.out.println();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// ä��
	void doChat(String chat) {
		System.out.println(userName + "���� ä���� �Է��ϼ̽��ϴ�.\n\n" + userName + " : " + chat);
		System.out.println("---------------------------------");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
