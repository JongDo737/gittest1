package ch01;

class MyThreadEx2 extends Thread {
	String name;

	public MyThreadEx2(String name) {
		this.name = name;
	}

	// 약속
	@Override
	public void run() {
		int i;
		for (i = 0; i < 50; i++) {
			System.out.println(name + " : " + i + "\t");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}// end of run

}// end of MyThreadEx2

public class ThreadTest2 {
	// 메인 쓰레드
	public static void main(String[] args) {

		System.out.println(Thread.currentThread()); // 현재 작업자를 나타내주는 메서드
		System.out.println("메인 쓰레드 시작");

		MyThreadEx2 th1 = new MyThreadEx2("작업자 1");
		th1.start();  // <--쓰레드의 작업을 시작하는 명령어
		//메인스레드 시작 종료 후 작업자1이 시작됌
		
//		for (int i = 0; i < 50; i++) {
//			System.out.println("test : " + i);
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		MyThreadEx2 th2 = new MyThreadEx2("작업자 2");
		th2.start();
		
		MyThreadEx2 th3 = new MyThreadEx2("작업자 3");
		th3.start();
		
		System.out.println("메인 쓰레드 종료");

	}// end of main
}// end of class
