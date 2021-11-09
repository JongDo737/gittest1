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
		System.out.println("�õ��� �մϴ�");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	public void drive() {
		System.out.println("�������Դϴ�.");
	}
	public void parking() {
		System.out.println("������ �մϴ�.");
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
