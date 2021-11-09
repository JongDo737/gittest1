package ex10;

public class Protoss extends StarCraftTribe{
	
	int zealot;
	int dragoon;

	public Protoss(String playerName) {
		super(playerName);
	}
	@Override
	void attack() {
		System.out.println("넥서스가 공격받고 있습니다.");
		super.attack();
	}
	void dragoonSound() {
		System.out.println("리조락.. 커멘징");
	}
}
