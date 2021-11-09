package ch08;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		Unit zealot1 = new Zealot("질럿1");
		Unit marine1 = new Marine("마린1");
		Unit zergling1 = new Zergling("저글링1");

		Unit[] totalUnit = new Unit[3];
		totalUnit[0] = zealot1;
		totalUnit[1] = marine1;
		totalUnit[2] = zergling1;

//		for (Unit unit : totalUnit) {
//			unit.showInfo();
//		}
		// 1 스캐너를 사용해서 실행의 흐름을 만들어 보세요
		// 1. 질 -> 마
		// 2. 마 -> 저
		// 3. 저 -> 질
		Scanner sc = new Scanner(System.in);
		boolean gameOver = false;
		int userInput = 0;
		final int ZEALOT_ACTION = 1;
		final int MARINE_ACTION = 2;
		final int ZERGLING_ACTION = 3;
		final int SHOW_INFO = 4;
		final int GAME_END = 5;
		while (!(gameOver)) {
			System.out.println("1. 질럿이 마린을 공격");
			System.out.println("2. 마린이 저글링을 공격");
			System.out.println("3. 저글링이 질럿을 공격");
			System.out.println("4. 유닛 상태 보기");
			System.out.println("5. 종료");
			System.out.print("입력 : ");
			userInput = sc.nextInt();
			if (userInput == ZEALOT_ACTION) {
				zealot1.attack(marine1);
			} 
			else if (userInput == MARINE_ACTION) {
				marine1.attack(zergling1);
			} 
			else if (userInput == ZERGLING_ACTION) {
				zergling1.attack(zealot1);
			} 
			else if (userInput == SHOW_INFO) {
				zealot1.showInfo();
				marine1.showInfo();
				zergling1.showInfo();
			} 
			else if (userInput == GAME_END) {
				System.out.println("게임을 종료합니다.");
				gameOver = true;
			} 
			else {
				System.out.println("잘못입력하셨습니다. 다시입력하세요.");
			}
		} // end of while

	}

}
