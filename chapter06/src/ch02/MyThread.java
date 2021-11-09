package ch02;

public class MyThread extends Thread {

	boolean flag = true;

	@Override
	public String toString() {
		return "ÀÛ¾÷ÀÚ : "+Thread.currentThread();
	}
	@Override
	public void run() {
		while (flag) {
			System.out.print("-");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // end of while
	}// end of run
}
