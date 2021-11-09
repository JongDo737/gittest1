package ex10;

public class Avante extends Car{

	public Avante(String color, String maker) {
		super(color, maker);
	}

	@Override
	public void driveSound() {
		System.out.println("¿ì¿ì¿õ");
	}
}
