package ch06;

public class AnimalMainTest {

	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		
		hAnimal.move();	//human�޼��带 ���� ����ϰ� 
		//human�޼��忡 move�� ������ �θ�Ŭ������ move�� ����Ѵ�
		System.out.println("=========");
		tAnimal.move();

	}

}
