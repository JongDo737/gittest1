package ex10;

public class Terran extends StarCraftTribe{

	int marine;
	int tank;
	
	public Terran(String playerName) {
		super(playerName);
	}
	@Override
	void attack() {
		System.out.println("커멘더 센터가 공격받고 있습니다.");
		super.attack();
	}
}
