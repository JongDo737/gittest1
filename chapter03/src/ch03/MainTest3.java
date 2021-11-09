package ch03;

public class MainTest3 {

	public static void main(String[] args) {
		//자동차를 생성해서 show info 호출하기
		Car car1 = new Car("포르쉐박스터",14000);
		car1.showInfo();
		
		// 엔진의 정보를 출력하기
		car1.engine.showInfo();

	}
}
