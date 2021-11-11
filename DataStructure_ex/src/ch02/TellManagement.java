package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TellManagement {
	static Scanner sc = new Scanner(System.in);

	// 삽입하는 기능
	public static void insert(HashMap<String, Phone> map) {

		Phone phone;
		String name, address, telephone;
		System.out.println("이름 >> : ");
		name = sc.next();
		System.out.println("주소 >> : ");
		address = sc.next();
		System.out.println("전화번호 >> : ");
		telephone = sc.next();

		phone = new Phone(name, address, telephone);

		map.put(phone.name, phone);
		System.out.println("정보를 추가하였습니다.");
	}

	// 삭제하는 기능
	public static void delete(HashMap<String, Phone> map) {
		// key 이름을 입력 받아서 사용

		System.out.println("삭제하실 이름을 입력하세요 : ");
		String inputName = sc.next();
		if (map.containsKey(inputName)) {
			map.remove(inputName);
			System.out.println("정보를 삭제하였습니다.");
		} else {
			System.out.println("잘못입력하셨거나 존재하지 않는 이름입니다.");
		}
	}

	// 찾기
	public static void search(HashMap<String, Phone> map) {
		// key 이름을 입력 받앗 ㅓ찾아서 화면에 보여주세요
		System.out.println("검색하실 이름을 입력하세요 : ");
		String inputName = sc.next();
		if (map.containsKey(inputName)) {
			System.out.println("이름 : " + map.get(inputName).name);
			System.out.println("주소 : " + map.get(inputName).address);
			System.out.println("전화번호 : " + map.get(inputName).telephone);
			// map1.get(key)하면 Value 값이 반환된다.
			// --> 그래서 map.get(inputName) 하면 phone의 주소값이 출력이됌
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("존재하지 않는 이름입니다.");
		}

	}

	// 전체보기
	public static void showInfo(HashMap<String, Phone> map) {
		// 화면에 전체 정보를 뿌려주는 기능을 만들어주세요
		for (String key : map.keySet()) {
			System.out.println("이름 : " + key);
			System.out.println("주소 : " + map.get(key).address);
			System.out.println("전화번호 : " + map.get(key).telephone);
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
		System.out.println("전화번호 관리 프로그램");
		System.out.println("---------------------");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (isOK) {
			System.out.println("0. 입력하기 1. 삭제하기 2. 검색하기 3. 모두보기 4. 종료하기");
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
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("다시입력하세요");
				break;

			}
		}

	}

}
