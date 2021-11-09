package ex10;

public class Zerg extends StarCraftTribe{

	int zergling;
	int hydra;
	
	
	public Zerg(String playerName) {
		super(playerName);
	}
	@Override
	void attack() {
		System.out.println("해처리가 공격받고 있습니다.");
		super.attack();
	}

}
