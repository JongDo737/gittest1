package ex10;

public class Protoss extends StarCraftTribe{
	
	int zealot;
	int dragoon;

	public Protoss(String playerName) {
		super(playerName);
	}
	@Override
	void attack() {
		System.out.println("�ؼ����� ���ݹް� �ֽ��ϴ�.");
		super.attack();
	}
	void dragoonSound() {
		System.out.println("������.. Ŀ��¡");
	}
}
