package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stA = sc.next();
		String stB = sc.next();
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for(int i=0; i<stA.length(); i++) {
			A.add((int)stA.charAt(stA.length()-i-1));
		}
		for(int i=0; i<stB.length(); i++) {
			B.add((int)stB.charAt(stB.length()-i-1));
		}
		
		for(int i=0; i<A.size();i++) {	// ���ؼ� 10�� ������ �ڷ� ���� ���� �Ѱ���
			int sum = 0;
			sum = A.get(i) + B.get(i) ;
			if(sum/10>0) {
				
			}
		}
		
		
		
		
	}

}
