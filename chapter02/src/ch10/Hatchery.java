package ch10;

public class Hatchery {

	public static int zerglingCount = 0;
	private int hatcheryWayId;
	private String name;

	public Hatchery(int id) {
		this.hatcheryWayId = id;
		name = "��ó��";
	}

	// ���� �����ϱ�
	public Zergling HatchZergling() {
		System.out.println("���۸��� �����մϴ�.");
		zerglingCount++;
		return new Zergling("���۸�");
	}
}