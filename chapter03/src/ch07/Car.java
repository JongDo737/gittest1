package ch07;

public abstract class Car {

	public  void startCar() {
		System.out.println("시동을 겁니다.");
	}
	
	public abstract void drive();
	
	public abstract void stop();
	
	public abstract void wiper();
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//후크(hook) 메서드
	//아무 동작을 정의해놓지 않고 호출은 되지만
	//필요할때 재정의 해서 쓰는 메서드
	public void washCar() {}
	
	
	//템플릿메서드의 핵심 !!
	// 하위 클래스에서 재정의 할 수 없게 해야한다. --> final
	//실행의 흐름을 만들어놓는거임
	final public void run() {
		startCar();
		wiper();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
