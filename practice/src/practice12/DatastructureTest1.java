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

		// ������ �ְ� (�ε���) �ߺ��� �����ϴ�.
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Student> stu = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();

		// ����� ���ÿ� �ʱ�ȭ
		ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		
		// �� �߰����
		list.add(15);
		list.add(3);
		list.add(4);

		// �� ����
		list.remove(2);

		// �� ���
		System.out.println(list.get(1));

		// while �����
		// ��� ��ȸ(�ݺ���) �÷��� �����ӿ�ũ�� ����� ��ҵ��� �ϳ��� ���ʷ� �����ϴ� ��
		Iterator<Integer> iter = list.iterator();

		// true, false
		while(iter.hasNext()) {
			System.out.println("while�� ���� : "+ iter.next());
		}

		// �� �˻����
		System.out.println(list.contains(15));
		System.out.println(list.contains(30));
		// ���� ������ �ε����� ��ȣ�� ��ȭ�� ������ -1�� ��ȯ�ϴ� �༮.

		
		// ���ϴ� ���� �ε�����ġ�� �˷��ִ� �༮ -> ������ -1�� ��ȯ

		
		
		
		
		
		
		// ���� 1
		ArrayList<String> names = new ArrayList<>();

		// Scanner ���
		// �̸��� �Է��ϸ� names ����Ʈ�� ���� while
		// ȭ�鿡 �Է��� �̸��� �ѷ��ּ���

		Scanner sc = new Scanner(System.in);
		int count = 0;
		String inputName;
		while (true) {
			System.out.println((count+1) + "��° �̸��� �Է��ϼ��� (���� : 1)");
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