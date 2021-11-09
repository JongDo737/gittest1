package ch10;

public class MainTest1 {

	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		
		Marine marine1 = new Marine("마린1");
		Marine marine2 = new Marine("마린2");
		
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");

//		zealot1.showInfo();
//		marine1.showInfo();
//		zergling1.showInfo();

		//문제 저글링 , 질럿 ㅡ마린 체력이 0 또는 이하라면 사망했습니다.
		
		for(int i=0;i<11;i++) {
			zealot1.attack(marine2);			
		}
		marine2.showInfo();
		
		for(int i=0;i<22;i++) {
			zergling2.attack(zealot2);
		}
		zealot2.showInfo();
		
		
		//메서드 오버로딩
		//다른형태 데이터 타입이나, 매개변수 갯수, 매개변수 종류가 다르면 이름이 같아도 선언할 수 있음
		System.out.println("-------------------");
		System.out.println("가나다");
		System.out.println(1);
		System.out.println(0.5);
		System.out.println('A');
		
	}// end of main

}// end of class