package practice07;

import javax.swing.JFrame;

class MyRunnable extends JFrame{
	
	public MyRunnable() {
		
	}
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			
			for(int i=0;i<10;i++) {
				System.out.print("-");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
}




public class RunnableTest2 {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		myRunnable.runnable.run();
	}
}
