package ch10;

public class HatcheryMainTest {

	public static void main(String[] args) {
		Hatchery hatchery1 = new Hatchery(1);
		Hatchery hatchery2 = new Hatchery(2);
		Hatchery hatchery3 = new Hatchery(3);

		Zergling zergling1 = hatchery1.HatchZergling();
		Zergling zergling2 = hatchery1.HatchZergling();
		Zergling zergling3 = hatchery1.HatchZergling();
		Zergling zergling4 = hatchery1.HatchZergling();
		Zergling zergling5 = hatchery1.HatchZergling();

		hatchery2.HatchZergling();
		hatchery2.HatchZergling();

		System.out.println("현재 생성된 저글링 수 : " + Hatchery.zerglingCount + "마리");

	}

}