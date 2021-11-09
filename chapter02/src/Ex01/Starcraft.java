package Ex01;

import java.util.Scanner;

public class Starcraft {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Gamer gamer1 = new Gamer("zl����������"); // �÷��̾� �ν��Ͻ� ����
		Gamer gamer2 = new Gamer("�׻��ƴ�");
		// �÷��̾� ��������
		// �Է¹޾Ƽ� ���� �����Ϸ��ߴµ� out of my �Ƿ�
		Protoss player1 = new Protoss(gamer1.ouputName()); // �÷��̾�1�� �����佺
		Terran player2 = new Terran(gamer2.ouputName()); // �÷��̾�2�� �׶�
		
		System.out.println(player1.userName+"���� ���ӿ� �����Ͽ����ϴ�.");
		System.out.println(player2.userName+"���� ���ӿ� �����Ͽ����ϴ�.");


		System.out.println("������ �����մϴ�.");
		for (int i = 3; i > 0; i--) {
			System.out.println(i); // 3�� �� ���� ����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// �÷���
		
		//ó�� ���� ���¸� �����ش�.
		player1.gameInfo();	
		player2.gameInfo();

		System.out.println("-------------------");
		boolean gameover = true;	//������ ������������ �÷��׸� Ȱ���Ͽ� �ݺ������
		int number;
		int player1Power;
		int player2Power;
		String input;
		String chat = "";
		while (gameover) {
			// �÷��̾� 2���� ������ ���鼭 ���� ����
			while (true) { // player1 ����
				System.out.println(player1.userName + "���� �����Դϴ�.");
				System.out.println("1. ���� �����ϱ�" + "\n2. �ǹ� ����" + "\n3. �ڿ�ĳ��" + "\n4. �����ϱ�" + "\n5. ä��ġ��"
						+ "\n6. �� ���� Ȯ���ϱ�" + "\n�Է� : ");
				number = sc.nextInt();
				if (number == 1) {
					System.out.println("� ������ �����ұ��\n���κ� ���� ���\n�Է� : ");
					input = sc.next();
					player1.produce(input);
					break;
				} else if (number == 2) {
					System.out.println("� �ǹ��� �������\n���Ϸ�(�α��� 8����) ����Ʈ���� ��\n�Է� : ");
					input = sc.next();
					player1.buildings(input);
					break;
				} else if (number == 3) {
					player1.dig();
					break;
				} else if (number == 4) {
					player1.attack();
					if (player1.attackPower > player2.attackPower) {
						System.out.println(player1.userName + "���� �� ���մϴ�. Ŀ����� �����մϴ�.");
						player2.beAttacked(player1.attackPower - player2.attackPower);			//������ = ���� - ���ѳ�
						if (player2.commendCenterHP <= 0) { // ���� Ŀ��尡 ���ư��� ���� ��
							System.out.println("Ŀ��弾�Ͱ� �μ������ϴ�.");
							player1.doChat("���� ���ϳ� �����ض�");
							gameover = false;
							break;
						}
						break;
					} else if (player1.attackPower == player2.attackPower) {
						System.out.println("�������� ���Ƽ� ���ظ� ������ �����ϴ�.");
						break;
					} else {
						System.out.println(player1.userName + "���� �� ���մϴ�. �ؼ����� ���ظ� �Խ��ϴ�..");
						player1.beAttacked(player2.attackPower - player1.attackPower);
						if (player1.nexusHP <= 0) { // �ؼ����� ���ư��� ���� ��
							System.out.println("�ؼ����� �μ������ϴ�.");
							player1.doChat("���� ���ϳ� �����ض�");
							gameover = false;
							break;
						}
						break;
					}
				} else if (number == 5) {
					System.out.print("�Է� : ");
					chat = sc.nextLine();	//���⵵ ���� ��Ű�� ���ؼ� nextLine() Ȱ��
					chat = sc.nextLine();
					player1.doChat(chat);
					continue;
				} else if (number == 6) {
					player1.gameInfo();
					continue;
				} else {
					System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
					continue;
				}
			} // end of player1
			
			if(!(gameover)) {	//�÷��̾�1 ���ӵ��� �ؼ����� Ŀ��尡 �μ����� �÷��̾�2�� �Ѿ�� ���� ����
				break;
			}
			
			while (true) { // player2 ����
				System.out.println(player2.userName + "���� �����Դϴ�.");
				System.out.println("1. ���� �����ϱ�" + "\n2. �ǹ� ����" + "\n3. �ڿ�ĳ��" + "\n4. �����ϱ�" + "\n5. ä��ġ��"
						+ "\n6. �� ���� Ȯ���ϱ�" + "\n�Է� : ");
				number = sc.nextInt();
				if (number == 1) {
					System.out.println("� ������ �����ұ��\nscv ���� ��ũ\n�Է� : ");
					input = sc.next();
					player2.produce(input);
					break;
				} else if (number == 2) {
					System.out.println("� �ǹ��� �������\n���ö���(�α��� 8����) �跰 ��\n�Է� : ");
					input = sc.next();
					player2.buildings(input);
					break;
				} else if (number == 3) {
					player2.dig();
					break;
				} else if (number == 4) {
					player2.attack();
					if (player2.attackPower > player1.attackPower) {
						System.out.println(player2.userName + "���� �� ���մϴ�. �ؼ����� �����մϴ�.");
						player1.beAttacked(player2.attackPower - player1.attackPower);
						if (player1.nexusHP <= 0) { // �ؼ����� ���ư��� ���� ��
							System.out.println("�ؼ����� �μ������ϴ�.");
							player2.doChat("���� ���ϳ� �����ض�");
							gameover = false;
							break;
						}
						break;
					} else if (player2.attackPower == player1.attackPower) {
						System.out.println("�������� ���Ƽ� ���ظ� ������ �����ϴ�.");
						break;
					} else {
						System.out.println(player2.userName + "���� �� ���մϴ�. Ŀ����� ���ظ� �Խ��ϴ�..");
						player2.beAttacked(player1.attackPower - player2.attackPower);
						if (player2.commendCenterHP <= 0) { // Ŀ����� ���ư��� ���� ��
							System.out.println("Ŀ��弾�Ͱ� �μ������ϴ�.");
							player1.doChat("���� ���ϳ� �����ض�");
							gameover = false;
							break;
						}
						break;
					}
				} else if (number == 5) {
					System.out.print("�Է� : ");
					chat = sc.nextLine();	
					chat = sc.nextLine();
					player2.doChat(chat);
					continue;
				} else if (number == 6) {
					player2.gameInfo();
					continue;
				} else {
					System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
					continue;
				}
			} // end of player2

		} // end of game
		// ���� : ���� : 	
		//���� �ٹ̱�
		if (player1.nexusHP <= 0) {
			System.out.println();
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڽ��ڡڡڡڡڡڡڡڡڡڡڡ�\n");
			System.out.println("�ڡڡڡڡڡڡڡڡڡ�" + player2.userName + "�ڡڡڡڡڡڡڡڡڡ�\n");
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		} else {
			System.out.println();
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڽ��ڡڡڡڡڡڡڡڡڡڡڡ�\n");
			System.out.println("�ڡڡڡڡڡڡڡڡڡ�" + player2.userName + "�ڡڡڡڡڡڡڡڡڡ�\n");
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		}
		System.out.println(player1.userName+"���� ������ �������ϴ�.");
		System.out.println(player2.userName+"���� ������ �������ϴ�.");

	}// end of main

}// end of class
