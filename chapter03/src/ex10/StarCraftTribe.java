package ex10;

public class StarCraftTribe {

	int workman; // ���κ� scv ���
	int mineral;
	int gas;
	int population;
	int unitCount;
	int attackPower;
	int playerHP;
	String playerName;

	public StarCraftTribe(String playerName) {
		workman = 4;
		mineral = 50;
		gas = 0;
		population = 10;
		unitCount = 4;
		playerHP = 10;
		this.playerName = playerName;
	}

	// �ڿ� ĳ��
	void dig() {
		System.out.println(playerName + " : " + "�ڿ��� ĸ�ϴ�.");
		System.out.println("---------------------------------");
		mineral += workman * 50; // �̳׶�ĳ�⸦ �ϸ� ���κ�� 10���� �ش�.
		gas += workman * 30; // �̳׶�ĳ�⸦ �ϸ� ���κ�� 8������ �ش�.
	}

	void attack() { // ������ ��ġ ��ȯ
		System.out.println(playerName + " : " + "���濡�� �����մϴ�.");
		System.out.println("---------------------------------");
	}

	// ���ݹ���
	void beAttacked(int damage) {
		playerHP -= damage;
	}
	void gameInfo() {
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("�г��� : " + playerName);
		System.out.println("���� �ڿ� \n�̳׶� :" + mineral + " ���� : " + gas);
		System.out.println("�α��� : " + unitCount + " / " + population);
		System.out.println("���� ���� : \n�ϲ� : " + workman);
		System.out.println("������ : "+attackPower);
		System.out.println("���� ü�� : " + playerHP);
		System.out.println("---------------------------------");
		System.out.println();
	}
}
