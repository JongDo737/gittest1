package ex10;

public class Zerg extends StarCraftTribe{

	int zergling;
	int hydra;
	
	
	public Zerg(String playerName) {
		super(playerName);
	}
	@Override
	void attack() {
		System.out.println("��ó���� ���ݹް� �ֽ��ϴ�.");
		super.attack();
	}

}
