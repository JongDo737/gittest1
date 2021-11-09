package ch09;

public class MainTest1 {

	public static void main(String[] args) {
		
		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		NumberPrinter numberPrinter2 = new NumberPrinter(2);
		NumberPrinter numberPrinter3 = new NumberPrinter(3);
		
		
		//
		numberPrinter3.printWaitNumber();
		numberPrinter3.printWaitNumber();
		numberPrinter3.printWaitNumber();
		
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		
		System.out.println("-----------");
		
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
	}//end of main

}
