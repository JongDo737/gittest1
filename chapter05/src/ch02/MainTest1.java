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
		//1.��� ����
		printer3.setMaterial(powder);
		//�ڷḦ ����������
		System.out.println(printer3.getMaterial());
		
		//������ ThreeDPrinter3�� ��Ḧ �������ּ���
		//temp1
		Powder temp1 = (Powder)printer3.getMaterial();
		
		//����
		System.out.println(printer3);
		//��ü�� ����ϸ� ���� �ּҰ��� ����ϰ� �Ǵµ�
		//toString�� �������ϸ� �ּҰ����� ���� ���ϴ� ���� ����� �� �ִ�.
		
		
		
	}

}
