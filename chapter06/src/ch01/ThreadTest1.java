package ch01;

public class ThreadTest1 {
	//�����Լ� <-- ���� ������
	public static void main(String[] args) {
		
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
			
			
			try {
				Thread.sleep(500);	//static �޼��� ( Ŭ���������� �����ؼ� �޼��� ���)
			} catch (InterruptedException e) {
				
			} 	
			
		}//end of for
		
		
	} //end of main
	
}// end of class
