package practice12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class DatastructureTest2 {

	public static void main(String[] args) {

		Set set0;
		// ����
		HashSet<Integer> set = new HashSet<>();
		//�� �߰�
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(3);
		//�� Ȯ��
		System.out.println(set);
		// ������ ��
		System.out.println(set.size());

		// ����
		set.remove(2);
		 // ���� 1�� �����ϴ°��� index X
//		set.clear();

		// while �� �����
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println("while�� ��� : "+iter.next());
		}
		// ���ο� ���� �ִ��� Ȯ��
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