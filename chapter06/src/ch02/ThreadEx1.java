package ch02;

import java.util.Scanner;

class MyThread1 extends Thread {

	boolean flag = true;

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

public class ThreadEx1 {

	public static void main(String[] args) {
		
		System.out.println("작업자를 생성 하겠습니다.");
		//메인 쓰레드가 작업자를 요청해서 생성
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		
		System.out.println("0번을 입력하면 중지합니다.");
		Scanner sc = new Scanner(System.in);
		
		//문제 3. do-while  문을 사용해서 사용자가 한번 입력을 하더라도 
		//다시 입력을 받을 수 있게 코드를 만들어주세요
		do {
			int userInput = sc.nextInt();
			if(userInput == 0) {
//				thread1.stop();	//deprecated -> 더이상 유지보수하지 않음 (언젠가 사라질 수 있는 메서드임)
				thread1.flag = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}while(true);
		
	}
}
