package ch06;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

	public static final int LOTTO_NUM_SIZE = 6;

	// 로또번호를 생성하는 기능 (6자리)

	public int[] getLottoNumber() {
		// 번호를 담을 공간 만들기
		int[] numbers = new int[LOTTO_NUM_SIZE];

		Random r = new Random();

		for (int i = 0; i < LOTTO_NUM_SIZE; i++) {
			numbers[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					System.out.println(numbers[i] +" : 같은값 발생");
					i--;
					break;
				}
			}

		}

		// 배열 정렬
		Arrays.sort(numbers);

		return numbers;
	}

	// 테스트코드
	public static void main(String[] args) {
		LottoNumber l = new LottoNumber();
		int[] nums = l.getLottoNumber();
		for (int i : nums) {
			System.out.print(i + "\t");

		}
	}

}
