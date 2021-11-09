package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String input = sc.next();
		int count = input.length();
		//count 자체를 입력받은 문자열의 길이로 초기화 시켜서
		//크로아티아 문자일때 --;
		
		for (int i = 0; i < croatia.length; i++) {
			//크로아티아 문자가 포함되어있는지 확인해준다.
			if (input.contains(croatia[i])) {

				for (int k = 0; k < input.length() - croatia[i].length() + 1; k++) { 
					// 크로아티아 문자열 길이만큼 input을 짤라준다.
					//k < input.length() - croatia[i].length() 이렇게 하지않으면 
					//ArrayIndexOutOfBoundsException 오류가 생김'
					
					String cro = "";	//자른문자 초기화
					
					for (int j = k; j < k + croatia[i].length(); j++) {
						//크로아티아 문자길이만큼 
						
						cro += input.charAt(j);
						if (cro.equals(croatia[i])) {		//문자열 비교
							count--;
						}
					}
				}
			}
		}

		System.out.println(count);

	}
}
