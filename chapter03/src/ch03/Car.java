package ch03;

public class Car {

	String name;
	int price;
	//포함관계 has a 
	//상속관계는 편리한 개념이지만 정확한 oop개념으로 설개 해야한다.
	Engine engine;
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
		engine = new Engine("GDI", 500);
	}
	
	public void showInfo() {
		System.out.println("name : "+name);
		System.out.println("price : "+price);
	}	
}
