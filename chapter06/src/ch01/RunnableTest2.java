package ch01;

import javax.swing.JFrame;

class MyRunnable2 extends JFrame{
	
	int grade = 10;
	
	public MyRunnable2() {
		runnable.run();
	}
	
	//�ڹ� ����
	//���� ��ü
	Runnable runnable = new Runnable() {	//�������̽����� �߰�ȣ�� �����ؼ� ��ü�� �������
		
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
		//���� 1, ��ü ������ ���ÿ� run �޼��带 ���� �����ּ���.
		// --> �����ڿ� run()�޼��带 ȣ����� �ָ��.
		
		//���� 2, �ܺο��� run�޼��� ���� �����ּ���.
		myRunable2.runnable.run();
		
		
		

	}

}
