package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String input = sc.next();
		int count = input.length();
		//count ��ü�� �Է¹��� ���ڿ��� ���̷� �ʱ�ȭ ���Ѽ�
		//ũ�ξ�Ƽ�� �����϶� --;
		
		for (int i = 0; i < croatia.length; i++) {
			//ũ�ξ�Ƽ�� ���ڰ� ���ԵǾ��ִ��� Ȯ�����ش�.
			if (input.contains(croatia[i])) {

				for (int k = 0; k < input.length() - croatia[i].length() + 1; k++) { 
					// ũ�ξ�Ƽ�� ���ڿ� ���̸�ŭ input�� ©���ش�.
					//k < input.length() - croatia[i].length() �̷��� ���������� 
					//ArrayIndexOutOfBoundsException ������ ����'
					
					String cro = "";	//�ڸ����� �ʱ�ȭ
					
					for (int j = k; j < k + croatia[i].length(); j++) {
						//ũ�ξ�Ƽ�� ���ڱ��̸�ŭ 
						
						cro += input.charAt(j);
						if (cro.equals(croatia[i])) {		//���ڿ� ��
							count--;
						}
					}
				}
			}
		}

		System.out.println(count);

	}
}
