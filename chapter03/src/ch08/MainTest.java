package ch08;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		Unit zealot1 = new Zealot("����1");
		Unit marine1 = new Marine("����1");
		Unit zergling1 = new Zergling("���۸�1");

		Unit[] totalUnit = new Unit[3];
		totalUnit[0] = zealot1;
		totalUnit[1] = marine1;
		totalUnit[2] = zergling1;

//		for (Unit unit : totalUnit) {
//			unit.showInfo();
//		}
		// 1 ��ĳ�ʸ� ����ؼ� ������ �帧�� ����� ������
		// 1. �� -> ��
		// 2. �� -> ��
		// 3. �� -> ��
		Scanner sc = new Scanner(System.in);
		boolean gameOver = false;
		int userInput = 0;
		final int ZEALOT_ACTION = 1;
		final int MARINE_ACTION = 2;
		final int ZERGLING_ACTION = 3;
		final int SHOW_INFO = 4;
		final int GAME_END = 5;
		while (!(gameOver)) {
			System.out.println("1. ������ ������ ����");
			System.out.println("2. ������ ���۸��� ����");
			System.out.println("3. ���۸��� ������ ����");
			System.out.println("4. ���� ���� ����");
			System.out.println("5. ����");
			System.out.print("�Է� : ");
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
				System.out.println("������ �����մϴ�.");
				gameOver = true;
			} 
			else {
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է��ϼ���.");
			}
		} // end of while

	}

}
