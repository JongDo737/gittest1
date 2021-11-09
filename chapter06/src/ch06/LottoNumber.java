package ch06;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

	public static final int LOTTO_NUM_SIZE = 6;

	// �ζǹ�ȣ�� �����ϴ� ��� (6�ڸ�)

	public int[] getLottoNumber() {
		// ��ȣ�� ���� ���� �����
		int[] numbers = new int[LOTTO_NUM_SIZE];

		Random r = new Random();

		for (int i = 0; i < LOTTO_NUM_SIZE; i++) {
			numbers[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					System.out.println(numbers[i] +" : ������ �߻�");
					i--;
					break;
				}
			}

		}

		// �迭 ����
		Arrays.sort(numbers);

		return numbers;
	}

	// �׽�Ʈ�ڵ�
	public static void main(String[] args) {
		LottoNumber l = new LottoNumber();
		int[] nums = l.getLottoNumber();
		for (int i : nums) {
			System.out.print(i + "\t");

		}
	}

}
