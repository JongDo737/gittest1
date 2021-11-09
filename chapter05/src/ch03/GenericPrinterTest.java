package ch03;

public class GenericPrinterTest {

	public static void main(String[] args) {

		// ���
		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		// ����� �� �ڷ����� �־��ָ� �ȴ�.
		// ����� ; T��ſ� ����� �� � �ڷ����� ����� �� �������ָ� �ȴ�.
		GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<>();

		// ���ֱ�
		genericPrinter1.setMaterial(powder);

		// ��� ������
		Powder tempPowder = genericPrinter1.getMaterial();
		
		System.out.println(tempPowder);
		
		System.out.println("------------");
		// ���� 1. �ö�ƽ���� ���׸� Ŭ������ �����ϰ� ��� ������ ��Შ����
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<Plastic>();

		genericPrinter2.setMaterial(plastic);

		Plastic tempPlastic = genericPrinter2.getMaterial();

		System.out.println(tempPlastic);
		//GenericPrinterŬ�������� toString ������ �Ѱ� ����ϱ�
		System.out.println(genericPrinter1);
	}
}
