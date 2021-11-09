package ch05;

public class MainTest1 {
	public static void main(String[] args) {

		Banana banana = new Banana();
		Peach peach = new Peach();

		banana.showInfo();
		peach.showInfo();
		
		//자바에서 다형성이란?
		//부모타입 인스턴스 변수에 자식 객체를 생성할 수 있다.
		Fruit fruit = new Banana();		//업캐스팅
		//fruit 엔 바나나의 주소값이 담김
		//다형성을 이용하면 업캐스팅 된 상태를 만들수있다.
		
		//부모 자식 관계에서만 사용 가능하다.
		
		//그 역은 성립하지 않는다.
		//즉, 자식 인스턴스 변수에(참조변수) 부모 인스턴스를 생성 시킬 수 없다.
//		Banana banana2 = new Fruit();
		
		
		
	}
}
