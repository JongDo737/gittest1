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

		// 소수를 배열에 담는 과정
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
			System.out.println(count);	//첫 소수가 최소값임
		}
	}
}
