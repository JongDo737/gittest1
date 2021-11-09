package ch11;

public class Company {
	// 싱글톤 패턴 (메모리 세상에서 단 하나만 존재해야하는 객체)
	// 1. 생성자 private로 만든다.
	private Company() {

	}

	// 2. static 변수를 활용해서 내부에서 객체를 생성한다.
	private static Company instance = new Company();

	// 3. 외부에서 유일한 인스턴스를 참조할 수 있는 public 메서드를 제공해야한다.
	public static Company getInstance() {
		// 방어적 코드
		if( instance == null) {
			instance = new Company();
		}

		return instance;
	}
}