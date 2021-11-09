package ch09;

public interface RemoteController {
	
	//구현된 것이 아무것도 없는 밑 그림만 있는 기본 설계도
	//멤버 변수 ㅡ 일반 메서드를 가질 수 없고, 오직 추상 메서드와 상수만을
	//멤버로 가질 수 있다.
	//추상클래스보다 추상화가 더 높다
	// 인터페이스는 표준, 규칙, 약속입니다.
	
	//사용방법 
	//class 대신  interface라는 키워드를 사용한다.
	//class와 같이 public 이나 default를 사용할 수있다.
	
	//제약 사항
	//모든 멤버 변수는 public static final이어야한다.
	public static final int SERIAL_NUMBER = 1000;
	//모든 메서드는 추상 클래스 이어야하고, public abstract 키워드를 생략 할수도 있다
	public abstract void turnOn();
	void turnOff(); //public abstract 생략
	
	
	
}
