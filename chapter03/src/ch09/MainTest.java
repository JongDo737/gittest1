package ch09;

public class MainTest {

	public static void main(String[] args) {
		
		Television television = new Television();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();
		
		television.turnOn();
		television.turnOff();
		System.out.println("-----------");
		refrigerator.turnOn();
		refrigerator.turnOff();
		
		// 다형성 - 배 (신체 선박 과일 )
		
		RemoteController[] remote = new RemoteController[3] ;
		remote[0] = television;
		remote[1] = refrigerator;
		remote[2] = toyRobot;
		
		//확장ㄹ for문 turnOn() 호출
		for(RemoteController r : remote) { //일괄 점등
			r.turnOn();
		}
		System.out.println("-----------");
		for (RemoteController r : remote) {
			r.turnOff();
		}
		
		//instanceof 연산자 사용해보기
		for (int i = 0; i < remote.length; i++) {
			if(remote[i] instanceof ToyRobot) {
				System.out.println("장난감 객체입니다.");
				//도전 과제
				//화면에 name 멤버 변수를 출력해주세요.
				//업케스팅 된상태니까 다운캐스팅 시켜주면 된다.
				System.out.println(((ToyRobot)remote[i]).name);
			}
			else if(remote[i] instanceof Television) {
				System.out.println("TV 객체입니다.");
			}
			else if(remote[i] instanceof Refrigerator) {
				System.out.println("냉장고 객체입니다.");
			}
		}
		
		//인터페이스 장점
		//표준화 가능하다.
		//서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
		//클래스간에 결합도를 낮춰서 유연한 코드르르 설계할 수 있다.
		
		//정리
		//객체지형 패러다임 핵심
		//객체와 객체간의 상호 협력해서 코드를 설계해 나간다. ( 버스, 질럿 등)
		//객체와 객체간의 관계를 정의하여 코드를 설계해 나간다.
		// ( 상속, 포함관계, 추상클래스, 인터페이스) 
		//다형성 (클래스를 다양한 형태로) !!
		
		
		
		
		
		
		
		
		
		
		
	}

}
