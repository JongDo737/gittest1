package ch08;

public class Marine extends Unit{
	public Marine(String name) {
		setName(name);
		this.power = 5;
		this.hp = 100;
		setAlive(true);
	}
}