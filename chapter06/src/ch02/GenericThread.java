package ch02;

public class GenericThread <T extends Thread>{

	private T myThread;

	public GenericThread() {
	}

	public T getName() {
		return myThread;
	}

	public void setName(T myThread) {
		this.myThread = myThread;
	}
	
	
}
