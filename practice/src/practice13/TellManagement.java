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
		System.out.println("이름 >>");
		name = sc.next();
		System.out.println("주소 >>");
		address = sc.next();
		System.out.println("전화번호 >>");
		telephone = sc.next();
		phone = new Phone(name, address, telephone);
		map.put(name, phone);
		System.out.println("생성되었습니다.");

	}
	public static void delete(HashMap<String, Phone> map) {
		String inputName;
		System.out.println("삭제할 이름을 입력하세요");
		inputName = sc.next();
		if(map.containsKey(inputName)) {
			map.remove(inputName);
			System.out.println("삭제가 완료되었습니다.");
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
	public static void search(HashMap<String, Phone> map) {
		String inputName;
		System.out.println("검색할 사람의 이름을 입력하세요.");
		inputName = sc.next();
		if(map.containsKey(inputName)) {
			System.out.println("이름 : "+map.get(inputName).name);
			System.out.println("주소 : "+map.get(inputName).address);
			System.out.println("전화번호 : "+map.get(inputName).telephone);
		}
		else {
			System.out.println("잘못입력하셨습니다.");
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
			System.out.println("1.  입력 2. 삭제 3. 검색 4. 전체정보 5. 종료");
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
				System.out.println("종료");
				break;
			
			}
		}
	}
}
