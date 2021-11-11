package practice12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class DatastructureTest2 {

	public static void main(String[] args) {

		Set set0;
		// 선언
		HashSet<Integer> set = new HashSet<>();
		//값 추가
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(3);
		//값 확인
		System.out.println(set);
		// 사이즈 값
		System.out.println(set.size());

		// 삭제
		set.remove(2);
		 // 숫자 1을 삭제하는거임 index X
//		set.clear();

		// while 문 사용방법
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println("while문 사용 : "+iter.next());
		}
		// 내부에 값이 있는지 확인
		System.out.println(set.contains(2));
		
		HashSet<Integer> set2 = new HashSet<>();
		while(set2.size()<6) {
			set2.add(getRandomNumber());
		}
		System.out.println(set2);
		
	}// end of main

	public static int getRandomNumber() {

		Random r = new Random();
		int value = r.nextInt(45) + 1;
		return value;
	}

}