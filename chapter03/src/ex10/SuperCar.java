package ex10;

public class SuperCar extends Car{

	public SuperCar(String color, String maker) {
		super(color, maker);
	}

	@Override
	public void driveSound() {
		System.out.println("부아아아아앙");
	}

}
