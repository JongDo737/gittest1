package ch10;

public class GateWayMainTest {

	public static void main(String[] args) {

		GateWay gateWay1 = new GateWay(1);
		GateWay gateWay2 = new GateWay(1);
		GateWay gateWay3 = new GateWay(1);

		Zealot zealot1 = gateWay1.createZealot();
		Zealot zealot2 = gateWay1.createZealot();
		Zealot zealot3 = gateWay1.createZealot();
		Zealot zealot4 = gateWay1.createZealot();
		Zealot zealot5 = gateWay1.createZealot();
		Zealot zealot6 = gateWay1.createZealot();
		Zealot zealot7 = gateWay1.createZealot();
		Zealot zealot8 = gateWay1.createZealot();

		gateWay2.createZealot();
		gateWay2.createZealot();
		gateWay2.createZealot();

		gateWay3.createZealot();
		gateWay3.createZealot();
		gateWay3.createZealot();

		// static 변수는 인스턴스들이 공유할 수 있는 변수이다.
		// --> 객체를 생성하지 않고도 클래스 이름으로 접근이 가능하다.
		// ex) 태양( 객체가 생성되기 전에 메모리에 올라가 있다. )

		System.out.println("현재 생성된 질럿 수 : " + GateWay.zealotCount + "마리");

	}

}