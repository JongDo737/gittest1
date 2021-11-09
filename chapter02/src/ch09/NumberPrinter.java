package ch09;

public class NumberPrinter {
	
	private int id;
	private static int waitNumber;
	public NumberPrinter(int id) {
		this.id = id;
	}
	//번호표를 찍어주세요.
	public void printWaitNumber() {
		waitNumber++;
		System.out.println(id+"번 기기의 대기순번 : "+ waitNumber);
		
	
	}
	
	
	
}
