package ch10;

public class Hatchery {

	public static int zerglingCount = 0;
	private int hatcheryWayId;
	private String name;

	public Hatchery(int id) {
		this.hatcheryWayId = id;
		name = "해처리";
	}

	// 질럿 생성하기
	public Zergling HatchZergling() {
		System.out.println("저글링을 생산합니다.");
		zerglingCount++;
		return new Zergling("저글링");
	}
}