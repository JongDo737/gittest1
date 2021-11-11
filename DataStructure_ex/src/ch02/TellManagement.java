package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TellManagement {
	static Scanner sc = new Scanner(System.in);

	// �����ϴ� ���
	public static void insert(HashMap<String, Phone> map) {

		Phone phone;
		String name, address, telephone;
		System.out.println("�̸� >> : ");
		name = sc.next();
		System.out.println("�ּ� >> : ");
		address = sc.next();
		System.out.println("��ȭ��ȣ >> : ");
		telephone = sc.next();

		phone = new Phone(name, address, telephone);

		map.put(phone.name, phone);
		System.out.println("������ �߰��Ͽ����ϴ�.");
	}

	// �����ϴ� ���
	public static void delete(HashMap<String, Phone> map) {
		// key �̸��� �Է� �޾Ƽ� ���

		System.out.println("�����Ͻ� �̸��� �Է��ϼ��� : ");
		String inputName = sc.next();
		if (map.containsKey(inputName)) {
			map.remove(inputName);
			System.out.println("������ �����Ͽ����ϴ�.");
		} else {
			System.out.println("�߸��Է��ϼ̰ų� �������� �ʴ� �̸��Դϴ�.");
		}
	}

	// ã��
	public static void search(HashMap<String, Phone> map) {
		// key �̸��� �Է� �޾� ��ã�Ƽ� ȭ�鿡 �����ּ���
		System.out.println("�˻��Ͻ� �̸��� �Է��ϼ��� : ");
		String inputName = sc.next();
		if (map.containsKey(inputName)) {
			System.out.println("�̸� : " + map.get(inputName).name);
			System.out.println("�ּ� : " + map.get(inputName).address);
			System.out.println("��ȭ��ȣ : " + map.get(inputName).telephone);
			// map1.get(key)�ϸ� Value ���� ��ȯ�ȴ�.
			// --> �׷��� map.get(inputName) �ϸ� phone�� �ּҰ��� ����̉�
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("�������� �ʴ� �̸��Դϴ�.");
		}

	}

	// ��ü����
	public static void showInfo(HashMap<String, Phone> map) {
		// ȭ�鿡 ��ü ������ �ѷ��ִ� ����� ������ּ���
		for (String key : map.keySet()) {
			System.out.println("�̸� : " + key);
			System.out.println("�ּ� : " + map.get(key).address);
			System.out.println("��ȭ��ȣ : " + map.get(key).telephone);
			System.out.println("---------------------");
		}
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> names = map.keySet();
		Iterator<String> iter = names.iterator();
		while (iter.hasNext()) {
			String name = iter.next();
			Phone person = map.get(name);
			System.out.println(name + " " + person.telephone);
		}
	}

	public static void main(String[] args) {

		HashMap<String, Phone> map = new HashMap<String, Phone>();
		Scanner sc = new Scanner(System.in);
		boolean isOK = true;
		int menu;
		System.out.println("---------------------");
		System.out.println("��ȭ��ȣ ���� ���α׷�");
		System.out.println("---------------------");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (isOK) {
			System.out.println("0. �Է��ϱ� 1. �����ϱ� 2. �˻��ϱ� 3. ��κ��� 4. �����ϱ�");
			menu = sc.nextInt();
			switch (menu) {
			case 0:
				insert(map);
				break;
			case 1:
				delete(map);
				break;
			case 2:
				search(map);
				break;
			case 3:
				showInfo(map);
				break;
			case 4:
				isOK = false;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�ٽ��Է��ϼ���");
				break;

			}
		}

	}

}
