package baekjoon;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int count=0;
		int total_count = 0;
		int sum = 0;
		int j;

		// �Ҽ��� �迭�� ��� ����
		for (int i = M; i <= N; i++) {
			
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (j == i) {
				count=j;
				sum+=i;
			}
		}
		if(sum==0) {
			System.out.println("-1");
		}
		else {
			System.out.println(sum);
			System.out.println(count);	//ù �Ҽ��� �ּҰ���
		}
	}
}
