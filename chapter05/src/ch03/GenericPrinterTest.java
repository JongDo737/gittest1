package ch03;

public class GenericPrinterTest {

	public static void main(String[] args) {

		// 재료
		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		// 사용할 때 자료형을 넣어주면 된다.
		// 사용방법 ; T대신에 사용할 때 어떤 자료형을 사용할 지 지정해주면 된다.
		GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<>();

		// 재료넣기
		genericPrinter1.setMaterial(powder);

		// 재료 꺼내기
		Powder tempPowder = genericPrinter1.getMaterial();
		
		System.out.println(tempPowder);
		
		System.out.println("------------");
		// 문제 1. 플라스틱으로 제네릭 클래스를 선언하고 재료 세팅후 재료꺼내기
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<Plastic>();

		genericPrinter2.setMaterial(plastic);

		Plastic tempPlastic = genericPrinter2.getMaterial();

		System.out.println(tempPlastic);
		//GenericPrinter클래스에서 toString 재정의 한거 사용하기
		System.out.println(genericPrinter1);
	}
}
