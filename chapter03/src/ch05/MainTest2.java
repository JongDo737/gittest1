package ch05;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {

		final int BANANA = 1;
		final int PEACH = 2;

		// 스캐너
		// 사용자가 입력한 1, 2 ,받으면 해당하는 객체의 정보를
		// 화면에 출력해 주세요
		Scanner sc = new Scanner(System.in);

		System.out.println("바나나 : 1, 복숭아 : 2\n입력 : ");
		int number = sc.nextInt();
		
		Fruit fruit;	//이렇게 사용하면 if 문을만나도 블록의 유효범위가 넘기 때문에 if 문 바깥에서 사용할 수도 있음
		
		if (number == BANANA) {
			fruit = new Banana();	//업 캐스팅
		} else{
			fruit = new Peach();
		}
		fruit.showInfo();	
		//사용자가 입력한 값에 따라서 인스턴스를 쉽게 바꿔줄 수 있다.
		
	}
}
