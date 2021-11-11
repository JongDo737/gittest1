package practice13;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class TellManagement {
	static Scanner sc  = new Scanner(System.in);
	public static void insert(HashMap<String, Phone> map) {
		Phone phone;
		String name;
		String address;
		String telephone;
		System.out.println("�̸� >>");
		name = sc.next();
		System.out.println("�ּ� >>");
		address = sc.next();
		System.out.println("��ȭ��ȣ >>");
		telephone = sc.next();
		phone = new Phone(name, address, telephone);
		map.put(name, phone);
		System.out.println("�����Ǿ����ϴ�.");

	}
	public static void delete(HashMap<String, Phone> map) {
		String inputName;
		System.out.println("������ �̸��� �Է��ϼ���");
		inputName = sc.next();
		if(map.containsKey(inputName)) {
			map.remove(inputName);
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}
		else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}
	public static void search(HashMap<String, Phone> map) {
		String inputName;
		System.out.println("�˻��� ����� �̸��� �Է��ϼ���.");
		inputName = sc.next();
		if(map.containsKey(inputName)) {
			System.out.println("�̸� : "+map.get(inputName).name);
			System.out.println("�ּ� : "+map.get(inputName).address);
			System.out.println("��ȭ��ȣ : "+map.get(inputName).telephone);
		}
		else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}
	public static void showInfo(HashMap<String,Phone> map) {
		String inputName;
		for(Entry<String, Phone> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue().address +", "+entry.getValue().telephone);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		HashMap<String, Phone> map = new HashMap<>();
		boolean isOk = true;
		int check;
		while(isOk) {
			System.out.println("1.  �Է� 2. ���� 3. �˻� 4. ��ü���� 5. ����");
			check = sc.nextInt();
			switch(check) {
			case 1:
				insert(map);
				break;
			case 2:
				delete(map);
				break;
			case 3:
				search(map);
				break;
			case 4:
				showInfo(map);
				break;
			case 5:
				isOk = false;
				System.out.println("����");
				break;
			
			}
		}
	}
}
