package Ex01;

public class Terran {
	// �������
	String userName;
	int scv = 4;
	int unitCount = 4;
	int population = 10;
	int mineral = 50;
	int gas;
	int marine;
	int tank;
	int attackPower; // ���������� ������ + , ���濡�� ������ �Ҷ� �����¼�ġ���ҷ��� �����.
	int commendCenterHP = 10;
	String chat;
	String build = "Ŀ��弾��";

	// ������
	public Terran(String userName) {
		this.userName = userName;
	}
	// �޼���

	// �����
	void buildings(String build) {
		this.build += " " + build;
		System.out.println(build + "��(��) �����ϴ�.");
		System.out.println("---------------------------------");
		if (build.equals("���ö���")) {
			population += 8;
		}
	}

	// �ڿ� ĳ��
	void dig() {
		System.out.println(userName + " : " + "�ڿ��� ĸ�ϴ�.");
		System.out.println("---------------------------------");
		mineral += scv * 50; // �̳׶�ĳ�⸦ �ϸ� scv�� 10���� �ش�.
		gas += scv * 30; // �̳׶�ĳ�⸦ �ϸ� scv�� 8������ �ش�.
	}

	// ����
	void produce(String product) {
		System.out.println(product + "��(��) �����մϴ�.");
		System.out.println("---------------------------------");
		if (product.equals("scv")) {
			if (mineral >= 50) { // �̳׶��� �����ϸ� ����Ұ�
				mineral -= 50; // �̳׶� ����
				scv++; // scv 1����
				unitCount += 1; // �α��� 1����
			} else {
				System.out.println("Not Enough Minerals");
				System.out.println("---------------------------------");
			}
		} else if (product.equals("����")) {
			if (mineral >= 50) {
				mineral -= 50;
				marine++;
				unitCount += 1;
				attackPower += 1;
			} else {
				System.out.println("Not Enough Minerals");
				System.out.println("---------------------------------");
			}

		} else if (product.equals("��ũ")) {
			if (mineral >= 150 && gas >= 100) {
				mineral -= 150;
				gas -= 100;
				tank++;
				unitCount += 2;
				attackPower += 3;
			}

			else {
				System.out.println("Not Enough Minerals");
				System.out.println("---------------------------------");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println("---------------------------------");
		}
	}

	// ����
	void attack() { // ������ ��ġ ��ȯ
		System.out.println("���濡�� �����մϴ�.");
		System.out.println("---------------------------------");
	}

	// ���� �ޱ�
	void beAttacked(int damage) {
		commendCenterHP -= damage;
	}

	// ����
	void gameInfo() {
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("�г��� : " + userName);
		System.out.println("���� �ڿ� \n�̳׶� : " + mineral + " ���� : " + gas);
		System.out.println("�α��� : " + unitCount + " / " + population);
		System.out.println("���� ���� : \nSCV : " + scv + "\n���� : " + marine + "\n��ũ : " + tank);
		System.out.println("�ǹ��� : " + build);
		System.out.println("������ : "+attackPower);
		System.out.println("Ŀ��弾�� ü�� : " + commendCenterHP);
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
