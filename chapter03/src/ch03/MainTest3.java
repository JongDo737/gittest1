package ch03;

public class MainTest3 {

	public static void main(String[] args) {
		//�ڵ����� �����ؼ� show info ȣ���ϱ�
		Car car1 = new Car("�������ڽ���",14000);
		car1.showInfo();
		
		// ������ ������ ����ϱ�
		car1.engine.showInfo();

	}
}
