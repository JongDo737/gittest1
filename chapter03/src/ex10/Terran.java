package ex10;

public class Terran extends StarCraftTribe{

	int marine;
	int tank;
	
	public Terran(String playerName) {
		super(playerName);
	}
	@Override
	void attack() {
		System.out.println("Ŀ��� ���Ͱ� ���ݹް� �ֽ��ϴ�.");
		super.attack();
	}
}
