package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		ThreeDPrinter1 printer = new ThreeDPrinter1();

		Powder powder = new Powder();

		printer.setMaterial(powder);

		System.out.println(printer.getMaterial());

		System.out.println("----------------");
		
		ThreeDPrinter2 printer2 = new ThreeDPrinter2();

		Plastic plastic = new Plastic();

		printer2.setMaterial(plastic);

		System.out.println(printer2.getMaterial());
		
		System.out.println("----------------");
		
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		//1.재료 세팅
		printer3.setMaterial(powder);
		//자료를 꺼내보세요
		System.out.println(printer3.getMaterial());
		
		//변수에 ThreeDPrinter3에 재료를 저장해주세요
		//temp1
		Powder temp1 = (Powder)printer3.getMaterial();
		
		//질문
		System.out.println(printer3);
		//객체를 출력하면 원래 주소값을 출력하게 되는데
		//toString을 재정의하면 주소값말고 내가 원하는 값을 출력할 수 있다.
		
		
		
	}

}
