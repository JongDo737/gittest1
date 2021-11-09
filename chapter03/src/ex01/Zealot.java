package ex01;

public class Zealot extends Unit{
	public Zealot(String name) {
		setName(name);
		this.power = 10;
		this.hp = 100;
		setAlive(true);
	}

}