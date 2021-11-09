package ex10;

public class StarCraftTribe {

	int workman; // 프로브 scv 드론
	int mineral;
	int gas;
	int population;
	int unitCount;
	int attackPower;
	int playerHP;
	String playerName;

	public StarCraftTribe(String playerName) {
		workman = 4;
		mineral = 50;
		gas = 0;
		population = 10;
		unitCount = 4;
		playerHP = 10;
		this.playerName = playerName;
	}

	// 자원 캐기
	void dig() {
		System.out.println(playerName + " : " + "자원을 캡니다.");
		System.out.println("---------------------------------");
		mineral += workman * 50; // 미네랄캐기를 하면 프로브당 10원을 준다.
		gas += workman * 30; // 미네랄캐기를 하면 프로브당 8가스를 준다.
	}

	void attack() { // 전투력 수치 반환
		System.out.println(playerName + " : " + "상대방에게 공격합니다.");
		System.out.println("---------------------------------");
	}

	// 공격받음
	void beAttacked(int damage) {
		playerHP -= damage;
	}
	void gameInfo() {
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("닉네임 : " + playerName);
		System.out.println("현재 자원 \n미네랄 :" + mineral + " 가스 : " + gas);
		System.out.println("인구수 : " + unitCount + " / " + population);
		System.out.println("현재 유닛 : \n일꾼 : " + workman);
		System.out.println("전투력 : "+attackPower);
		System.out.println("본진 체력 : " + playerHP);
		System.out.println("---------------------------------");
		System.out.println();
	}
}
