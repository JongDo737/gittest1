package practice03;

public class MainTest {

	public static void main(String[] args) {
		GenericPrint<Material> genericPrint1 = new GenericPrint<>();
		GenericPrint<Material> genericPrint2 = new GenericPrint<>();
		
		Material pla = new Plastic();
		Material pow = new Powder();
		
		genericPrint1.setMaterial(pow);
		
		System.out.println(genericPrint1);
		
		genericPrint2.setMaterial(pla);
		
		System.out.println(genericPrint2);
		
		pla.doPrint();
		
		GenericPrint<Material> genericPrint = new GenericPrint<Material>();
		genericPrint.setMaterial(new Powder());
		System.out.println(genericPrint);

	}

}
