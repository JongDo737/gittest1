package Ex01;

public class Terran {
	// 멤버변수
	String userName;
	int scv = 4;
	int unitCount = 4;
	int population = 10;
	int mineral = 50;
	int gas;
	int marine;
	int tank;
	int attackPower; // 공격유닛을 뽑으면 + , 상대방에게 공격을 할때 전투력수치비교할려고 사용함.
	int commendCenterHP = 10;
	String chat;
	String build = "커멘드센터";

	// 생성자
	public Terran(String userName) {
		this.userName = userName;
	}
	// 메서드

	// 빌드업
	void buildings(String build) {
		this.build += " " + build;
		System.out.println(build + "을(를) 짓습니다.");
		System.out.println("---------------------------------");
		if (build.equals("서플라이")) {
			population += 8;
		}
	}

	// 자원 캐기
	void dig() {
		System.out.println(userName + " : " + "자원을 캡니다.");
		System.out.println("---------------------------------");
		mineral += scv * 50; // 미네랄캐기를 하면 scv당 10원을 준다.
		gas += scv * 30; // 미네랄캐기를 하면 scv당 8가스를 준다.
	}

	// 생산
	void produce(String product) {
		System.out.println(product + "을(를) 생산합니다.");
		System.out.println("---------------------------------");
		if (product.equals("scv")) {
			if (mineral >= 50) { // 미네랄이 부족하면 생산불가
				mineral -= 50; // 미네랄 감소
				scv++; // scv 1증가
				unitCount += 1; // 인구수 1증가
			} else {
				System.out.println("Not Enough Minerals");
				System.out.println("---------------------------------");
			}
		} else if (product.equals("마린")) {
			if (mineral >= 50) {
				mineral -= 50;
				marine++;
				unitCount += 1;
				attackPower += 1;
			} else {
				System.out.println("Not Enough Minerals");
				System.out.println("---------------------------------");
			}

		} else if (product.equals("탱크")) {
			if (mineral >= 150 && gas >= 100) {
				mineral -= 150;
				gas -= 100;
				tank++;
				unitCount += 2;
				attackPower += 3;
			}

			else {
				System.out.println("Not Enough Minerals");
				System.out.println("---------------------------------");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("---------------------------------");
		}
	}

	// 공격
	void attack() { // 전투력 수치 반환
		System.out.println("상대방에게 공격합니다.");
		System.out.println("---------------------------------");
	}

	// 공격 받기
	void beAttacked(int damage) {
		commendCenterHP -= damage;
	}

	// 인포
	void gameInfo() {
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("닉네임 : " + userName);
		System.out.println("현재 자원 \n미네랄 : " + mineral + " 가스 : " + gas);
		System.out.println("인구수 : " + unitCount + " / " + population);
		System.out.println("현재 유닛 : \nSCV : " + scv + "\n마린 : " + marine + "\n탱크 : " + tank);
		System.out.println("건물들 : " + build);
		System.out.println("전투력 : "+attackPower);
		System.out.println("커멘드센터 체력 : " + commendCenterHP);
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
