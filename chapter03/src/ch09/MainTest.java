package ch09;

public class MainTest {

	public static void main(String[] args) {
		
		Television television = new Television();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();
		
		television.turnOn();
		television.turnOff();
		System.out.println("-----------");
		refrigerator.turnOn();
		refrigerator.turnOff();
		
		// ������ - �� (��ü ���� ���� )
		
		RemoteController[] remote = new RemoteController[3] ;
		remote[0] = television;
		remote[1] = refrigerator;
		remote[2] = toyRobot;
		
		//Ȯ�天 for�� turnOn() ȣ��
		for(RemoteController r : remote) { //�ϰ� ����
			r.turnOn();
		}
		System.out.println("-----------");
		for (RemoteController r : remote) {
			r.turnOff();
		}
		
		//instanceof ������ ����غ���
		for (int i = 0; i < remote.length; i++) {
			if(remote[i] instanceof ToyRobot) {
				System.out.println("�峭�� ��ü�Դϴ�.");
				//���� ����
				//ȭ�鿡 name ��� ������ ������ּ���.
				//���ɽ��� �Ȼ��´ϱ� �ٿ�ĳ���� �����ָ� �ȴ�.
				System.out.println(((ToyRobot)remote[i]).name);
			}
			else if(remote[i] instanceof Television) {
				System.out.println("TV ��ü�Դϴ�.");
			}
			else if(remote[i] instanceof Refrigerator) {
				System.out.println("����� ��ü�Դϴ�.");
			}
		}
		
		//�������̽� ����
		//ǥ��ȭ �����ϴ�.
		//���� ������� Ŭ�����鿡�� ���踦 �ξ� �� �� �ִ�.
		//Ŭ�������� ���յ��� ���缭 ������ �ڵ帣�� ������ �� �ִ�.
		
		//����
		//��ü���� �з����� �ٽ�
		//��ü�� ��ü���� ��ȣ �����ؼ� �ڵ带 ������ ������. ( ����, ���� ��)
		//��ü�� ��ü���� ���踦 �����Ͽ� �ڵ带 ������ ������.
		// ( ���, ���԰���, �߻�Ŭ����, �������̽�) 
		//������ (Ŭ������ �پ��� ���·�) !!
		
		
		
		
		
		
		
		
		
		
		
	}

}
