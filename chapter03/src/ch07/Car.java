package ch07;

public abstract class Car {

	public  void startCar() {
		System.out.println("�õ��� �̴ϴ�.");
	}
	
	public abstract void drive();
	
	public abstract void stop();
	
	public abstract void wiper();
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	//��ũ(hook) �޼���
	//�ƹ� ������ �����س��� �ʰ� ȣ���� ������
	//�ʿ��Ҷ� ������ �ؼ� ���� �޼���
	public void washCar() {}
	
	
	//���ø��޼����� �ٽ� !!
	// ���� Ŭ�������� ������ �� �� ���� �ؾ��Ѵ�. --> final
	//������ �帧�� �������°���
	final public void run() {
		startCar();
		wiper();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
