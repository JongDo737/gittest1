package Ex01;

import java.util.Scanner;

public class Starcraft {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Gamer gamer1 = new Gamer("zl존플토장인"); // 플레이어 인스턴스 생성
		Gamer gamer2 = new Gamer("테사기아님");
		// 플레이어 종족선택
		// 입력받아서 종족 선택하려했는데 out of my 실력
		Protoss player1 = new Protoss(gamer1.ouputName()); // 플레이어1은 프로토스
		Terran player2 = new Terran(gamer2.ouputName()); // 플레이어2는 테란
		
		System.out.println(player1.userName+"님이 게임에 입장하였습니다.");
		System.out.println(player2.userName+"님이 게임에 입장하였습니다.");


		System.out.println("게임을 시작합니다.");
		for (int i = 3; i > 0; i--) {
			System.out.println(i); // 3초 후 게임 시작
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 플레이
		
		//처음 시작 상태를 보여준다.
		player1.gameInfo();	
		player2.gameInfo();

		System.out.println("-------------------");
		boolean gameover = true;	//게임이 끝나기전까지 플레그를 활용하여 반복문사용
		int number;
		int player1Power;
		int player2Power;
		String input;
		String chat = "";
		while (gameover) {
			// 플레이어 2명이 번갈아 가면서 게임 진행
			while (true) { // player1 차례
				System.out.println(player1.userName + "님의 차례입니다.");
				System.out.println("1. 유닛 생산하기" + "\n2. 건물 짓기" + "\n3. 자원캐기" + "\n4. 공격하기" + "\n5. 채팅치기"
						+ "\n6. 내 상태 확인하기" + "\n입력 : ");
				number = sc.nextInt();
				if (number == 1) {
					System.out.println("어떤 유닛을 생산할까요\n프로브 질럿 드라군\n입력 : ");
					input = sc.next();
					player1.produce(input);
					break;
				} else if (number == 2) {
					System.out.println("어떤 건물을 지을까요\n파일런(인구수 8증가) 게이트웨이 등\n입력 : ");
					input = sc.next();
					player1.buildings(input);
					break;
				} else if (number == 3) {
					player1.dig();
					break;
				} else if (number == 4) {
					player1.attack();
					if (player1.attackPower > player2.attackPower) {
						System.out.println(player1.userName + "님이 더 강합니다. 커멘더를 공격합니다.");
						player2.beAttacked(player1.attackPower - player2.attackPower);			//데미지 = 썐놈 - 약한놈
						if (player2.commendCenterHP <= 0) { // 상대방 커멘드가 날아가면 게임 끝
							System.out.println("커멘드센터가 부셔졌습니다.");
							player1.doChat("ㅋㅋ 머하노 수고해라");
							gameover = false;
							break;
						}
						break;
					} else if (player1.attackPower == player2.attackPower) {
						System.out.println("전투력이 같아서 피해를 입힐수 없습니다.");
						break;
					} else {
						System.out.println(player1.userName + "님이 더 약합니다. 넥서스가 피해를 입습니다..");
						player1.beAttacked(player2.attackPower - player1.attackPower);
						if (player1.nexusHP <= 0) { // 넥서스가 날아가면 게임 끝
							System.out.println("넥서스가 부셔졌습니다.");
							player1.doChat("ㅋㅋ 머하노 수고해라");
							gameover = false;
							break;
						}
						break;
					}
				} else if (number == 5) {
					System.out.print("입력 : ");
					chat = sc.nextLine();	//띄어쓰기도 포함 시키기 위해서 nextLine() 활용
					chat = sc.nextLine();
					player1.doChat(chat);
					continue;
				} else if (number == 6) {
					player1.gameInfo();
					continue;
				} else {
					System.out.println("잘못입력하셨습니다. 다시 입력하세여.");
					continue;
				}
			} // end of player1
			
			if(!(gameover)) {	//플레이어1 게임도중 넥서스나 커멘드가 부서지면 플레이어2로 넘어가는 오류 수정
				break;
			}
			
			while (true) { // player2 차례
				System.out.println(player2.userName + "님의 차례입니다.");
				System.out.println("1. 유닛 생산하기" + "\n2. 건물 짓기" + "\n3. 자원캐기" + "\n4. 공격하기" + "\n5. 채팅치기"
						+ "\n6. 내 상태 확인하기" + "\n입력 : ");
				number = sc.nextInt();
				if (number == 1) {
					System.out.println("어떤 유닛을 생산할까요\nscv 마린 탱크\n입력 : ");
					input = sc.next();
					player2.produce(input);
					break;
				} else if (number == 2) {
					System.out.println("어떤 건물을 지을까요\n서플라이(인구수 8증가) 배럭 등\n입력 : ");
					input = sc.next();
					player2.buildings(input);
					break;
				} else if (number == 3) {
					player2.dig();
					break;
				} else if (number == 4) {
					player2.attack();
					if (player2.attackPower > player1.attackPower) {
						System.out.println(player2.userName + "님이 더 강합니다. 넥서스를 공격합니다.");
						player1.beAttacked(player2.attackPower - player1.attackPower);
						if (player1.nexusHP <= 0) { // 넥서스가 날아가면 게임 끝
							System.out.println("넥서스가 부셔졌습니다.");
							player2.doChat("ㅋㅋ 머하노 수고해라");
							gameover = false;
							break;
						}
						break;
					} else if (player2.attackPower == player1.attackPower) {
						System.out.println("전투력이 같아서 피해를 입힐수 없습니다.");
						break;
					} else {
						System.out.println(player2.userName + "님이 더 약합니다. 커멘더가 피해를 입습니다..");
						player2.beAttacked(player1.attackPower - player2.attackPower);
						if (player2.commendCenterHP <= 0) { // 커멘더가 날아가면 게임 끝
							System.out.println("커멘드센터가 부셔졌습니다.");
							player1.doChat("ㅋㅋ 머하노 수고해라");
							gameover = false;
							break;
						}
						break;
					}
				} else if (number == 5) {
					System.out.print("입력 : ");
					chat = sc.nextLine();	
					chat = sc.nextLine();
					player2.doChat(chat);
					continue;
				} else if (number == 6) {
					player2.gameInfo();
					continue;
				} else {
					System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
					continue;
				}
			} // end of player2

		} // end of game
		// 승자 : 패자 : 	
		//나름 꾸미기
		if (player1.nexusHP <= 0) {
			System.out.println();
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★\n");
			System.out.println("★★★★★★★★★★★승자★★★★★★★★★★★\n");
			System.out.println("★★★★★★★★★★" + player2.userName + "★★★★★★★★★★\n");
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★\n");
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★\n");
		} else {
			System.out.println();
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★\n");
			System.out.println("★★★★★★★★★★★승자★★★★★★★★★★★\n");
			System.out.println("★★★★★★★★★★" + player2.userName + "★★★★★★★★★★\n");
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★\n");
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★\n");
		}
		System.out.println(player1.userName+"님이 게임을 나갔습니다.");
		System.out.println(player2.userName+"님이 게임을 나갔습니다.");

	}// end of main

}// end of class
