package Ex01;

public class Protoss {
	// 멤버변수
	String userName;
	int probe = 4;
	int unitCount = 4;
	int population = 10;
	int mineral = 50;
	int gas;
	int zealot;	
	int dragoon;
	int attackPower; // 공격유닛을 뽑으면 + , 상대방에게 공격을 할때 전투력수치비교할려고 사용함.
	int nexusHP = 10;
	String chat;
	String build = "넥서스";

	// 생성자
	public Protoss(String userName) {
		this.userName = userName;
	}
	// 메서드

	// 빌드업
	void buildings(String build) {
		this.build += " " + build;
		System.out.println(userName + " : " + build + "을(를) 짓습니다.");
		System.out.println("---------------------------------");
		if (build.equals("파일런")) {
			population += 8;
		}
	}

	// 자원 캐기
	void dig() {
		System.out.println(userName + " : " + "자원을 캡니다.");
		System.out.println("---------------------------------");
		mineral += probe * 50; // 미네랄캐기를 하면 프로브당 10원을 준다.
		gas += probe * 30; // 미네랄캐기를 하면 프로브당 8가스를 준다.
	}

	// 생산
	void produce(String product) {
		System.out.println(userName + " : " + product + "을(를) 생산합니다.");
		System.out.println("---------------------------------");
		if (product.equals("프로브")) {
			if (mineral >= 50) { // 미네랄이 부족하면 생산불가
				mineral -= 50; // 미네랄 감소
				probe++; // 프로브 1증가
				unitCount += 1; // 인구수 1증가
			} else {
				System.out.println(userName + " : " + "Not Enough Minerals");
				System.out.println("---------------------------------");
			}
		} else if (product.equals("질럿")) {
			if (mineral >= 100) {
				mineral -= 100;
				zealot++;
				unitCount += 1;
				attackPower += 2;
			} else {
				System.out.println(userName + " : " + "Not Enough Minerals");
				System.out.println("---------------------------------");
			}

		} else if (product.equals("드라군")) {
			if (mineral >= 125 && gas >= 50) {
				mineral -= 125;
				gas -= 50;
				dragoon++;
				unitCount += 2;
				attackPower += 2;
			}

			else {
				System.out.println(userName + " : " + "Not Enough Minerals");
				System.out.println("---------------------------------");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("---------------------------------");
		}
	}

	// 공격
	void attack() { // 전투력 수치 반환
		System.out.println(userName + " : " + "상대방에게 공격합니다.");
		System.out.println("---------------------------------");
	}

	// 공격받음
	void beAttacked(int damage) {
		nexusHP -= damage;

	}

	// 인포
	void gameInfo() {
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("닉네임 : " + userName);
		System.out.println("현재 자원 \n미네랄 : " + mineral + " 가스 : " + gas);
		System.out.println("인구수 : " + unitCount + " / " + population);
		System.out.println("현재 유닛 : \n프로브 : " + probe + "\n질럿 : " + zealot + "\n드라군 : " + dragoon);
		System.out.println("건물들 : " + build);
		System.out.println("전투력 : "+attackPower);
		System.out.println("넥서스 체력 : " + nexusHP);
		System.out.println("---------------------------------");
		System.out.println();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 채팅
	void doChat(String chat) {
		System.out.println(userName + "님이 채팅을 입력하셨습니다.\n\n" + userName + " : " + chat);
		System.out.println("---------------------------------");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
