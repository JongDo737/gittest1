package ch01;

import javax.swing.JFrame;

class MyRunnable2 extends JFrame{
	
	int grade = 10;
	
	public MyRunnable2() {
		runnable.run();
	}
	
	//자바 문법
	//구현 객체
	Runnable runnable = new Runnable() {	//인터페이스지만 중괄호로 구현해서 객체로 만들어줌
		
		@Override
		public void run() {
			for (int i = 0; i <10; i++) {
				
				System.out.print("-");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}//end of for
			
		}//end of run
	};
	
}


public class RunnableTest2 {

	public static void main(String[] args) {
		
		MyRunnable2 myRunable2 = new MyRunnable2();
		//문제 1, 객체 생성과 동시에 run 메서드를 실행 시켜주세요.
		// --> 생성자에 run()메서드를 호출시켜 주면됌.
		
		//문제 2, 외부에서 run메서드 동작 시켜주세요.
		myRunable2.runnable.run();
		
		
		

	}

}
