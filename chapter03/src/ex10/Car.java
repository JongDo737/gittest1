package ex10;

public abstract class Car {

	static final int wheel = 4;
	String color;
	String maker;

	public Car(String color, String maker) {
		this.color = color;
		this.maker = maker;
	}

	public void turnOn() {
		System.out.println("시동을 켭니다");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	public void drive() {
		System.out.println("운행중입니다.");
	}
	public void parking() {
		System.out.println("주차를 합니다.");
	}

	public abstract void driveSound();
	
	final public void run() {
		turnOn();
		drive();
		driveSound();
		parking();
		turnOff();
	}
}
