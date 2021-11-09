package ch02;

public class GenericMainTest {

	public static void main(String[] args) {

		GenericThread<MyThread> genericThread1 = new GenericThread<>();
		MyThread myThread = new MyThread();
		genericThread1.setName(myThread);
		
		System.out.println(genericThread1.getName());
		
//		((MyThread)genericThread1).start();
	}

}
