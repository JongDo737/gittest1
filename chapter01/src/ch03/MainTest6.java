package ch03;

import java.util.Scanner;

public class MainTest6 {

	public static void main(String[] args) {
		//���� ������
		//���ǽ� ? ���1 : ���2;
		//���ǽ��� ���ϰ�� : ���1 , �����ϰ�� : ���2
		int num1 =(5>3) ? 10:20;
		System.out.println(num1);
		
		int num2 =(5<3) ? 10:20;
		System.out.println(num2);
		
		int max;
		System.out.println("�Է¹��� �� ���� ū ���� ����ϼ���.");
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է� 1: ");
		int num3 =sc.nextInt();
		System.out.println("�Է� 2: ");
		int num4 =sc.nextInt();
		max = num3>num4 ? num3 : num4;
		System.out.println(max);
		
		
	}

}
