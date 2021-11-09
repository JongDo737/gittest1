package ch06;

public class AnimalMainTest {

	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		
		hAnimal.move();	//human메서드를 먼저 사용하고 
		//human메서드에 move가 없으면 부모클래스의 move를 사용한다
		System.out.println("=========");
		tAnimal.move();

	}

}
