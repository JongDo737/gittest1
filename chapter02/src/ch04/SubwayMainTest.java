package ch04;

public class SubwayMainTest {

	public static void main(String[] args) {
		
		Subway sub1 = new Subway(1);
		Subway sub2 = new Subway(2);
		Subway sub3 = new Subway(3);
		
		sub1.take(1200);
		sub1.take(1200);
		sub2.take(1200);
		sub2.take(1000);
		sub3.take(1000);
		sub3.take(800);
		sub3.take(1400);
		sub3.take(800);
		
		sub1.showInfo();
		sub2.showInfo();
		sub3.showInfo();

	}

}
