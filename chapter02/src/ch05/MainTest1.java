package ch05;

public class MainTest1 {

	public static void main(String[] args) {

		// 버스만들기
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Bus bus300 = new Bus(300);
		// 학생만들기
		Student student1 = new Student("홍길동", 10_000);
		Student student2 = new Student("야스오", 50_000);
		Student student3 = new Student("티모", 20_000);
		// 지하철만들기
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Subway subway3 = new Subway(3);
		
		System.out.println("----------등굣길-----------");
		System.out.println();
		
		student1.takeBus(bus300);
		student1.takeSubway(subway2);
		
		student2.takeSubway(subway3);
		student2.takeBus(bus300);
		student2.takeBus(bus100);
		student2.takeSubway(subway2);
		
		student3.takeBus(bus100);
		student3.takeBus(bus200);
		student3.takeSubway(subway1);
		
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();

		bus100.showInfo();
		bus200.showInfo();
		bus300.showInfo();
		
		subway1.showInfo();
		subway2.showInfo();
		subway3.showInfo();
		
		System.out.println();
		System.out.println("----------하굣길-----------");
		System.out.println();
		
		student1.takeBus(bus100);
		
		student2.takeSubway(subway1);
		student2.takeBus(bus300);
		student2.takeSubway(subway3);
		
		student3.takeSubway(subway1);
		student3.takeBus(bus100);
		
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();

		bus100.showInfo();
		bus200.showInfo();
		bus300.showInfo();
		
		subway1.showInfo();
		subway2.showInfo();
		subway3.showInfo();
		
	}

}
