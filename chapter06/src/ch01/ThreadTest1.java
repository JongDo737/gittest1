package ch01;

public class ThreadTest1 {
	//메인함수 <-- 메인 쓰레드
	public static void main(String[] args) {
		
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
			
			
			try {
				Thread.sleep(500);	//static 메서드 ( 클래스명으로 접근해서 메서드 사용)
			} catch (InterruptedException e) {
				
			} 	
			
		}//end of for
		
		
	} //end of main
	
}// end of class
