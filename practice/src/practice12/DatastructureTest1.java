package practice12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student {
	String name;
	int grade;
}

public class DatastructureTest1 {

	public static void main(String[] args) {

		List list0;

		// 순서가 있고 (인덱스) 중복이 가능하다.
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Student> stu = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();

		// 선언과 동시에 초기화
		ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		
		// 값 추가방법
		list.add(15);
		list.add(3);
		list.add(4);

		// 값 삭제
		list.remove(2);

		// 값 출력
		System.out.println(list.get(1));

		// while 사용방법
		// 요소 순회(반복자) 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는 것
		Iterator<Integer> iter = list.iterator();

		// true, false
		while(iter.hasNext()) {
			System.out.println("while문 사용법 : "+ iter.next());
		}

		// 값 검색방법
		System.out.println(list.contains(15));
		System.out.println(list.contains(30));
		// 값이 있으면 인덱스의 번호를 반화느 없으면 -1을 반환하는 녀석.

		
		// 원하는 값의 인덱스위치를 알려주는 녀석 -> 없으먄 -1을 반환

		
		
		
		
		
		
		// 문제 1
		ArrayList<String> names = new ArrayList<>();

		// Scanner 사용
		// 이름을 입력하면 names 리스트에 저장 while
		// 화면에 입력한 이름을 뿌려주세요

		Scanner sc = new Scanner(System.in);
		int count = 0;
		String inputName;
		while (true) {
			System.out.println((count+1) + "번째 이름을 입력하세요 (종료 : 1)");
			inputName = sc.next();
			if(inputName.equals("1")) {
				break;
			}
			else {
				names.add(inputName);
				count++;				
			}
		}
		System.out.println(names);
		System.out.println("-----------------------");
		
		for (String s : names) {
			System.out.println(s);
		}

	}

}