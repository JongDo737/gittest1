package ex01;

public class Zergling extends Unit{

	public Zergling(String name) {
		setName(name);
		this.power = 5;
		this.hp = 50;
		setAlive(true);
	}

}