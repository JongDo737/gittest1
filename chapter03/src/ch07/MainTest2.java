package ch07;

public class MainTest2 {
	public static void main(String[] args) {
		
		Car aiCar = new AICar();
		//템플릿메서드 
		// 실행의 흐름이 만들어져있음
		aiCar.run();
		System.out.println("-----------");
		
		Car manualCar = new ManualCar();
		manualCar.run();
	}
}
