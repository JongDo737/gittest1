package practice07;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {
	static final int LOTTO_NUM = 6;
	int[] lottoNumbers = new int[LOTTO_NUM];
	Random r = new Random();

	public int[] createNums() {
		for (int i = 0; i < LOTTO_NUM; i++) {
			int num = r.nextInt(45)+1;
			lottoNumbers[i] = num;					
			for(int j=0; j<i;j++) {
				if(lottoNumbers[i] == lottoNumbers[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lottoNumbers);
		for(int i =0;i<6;i++) {
			System.out.print(lottoNumbers[i]+"\t");
			
		}
		return lottoNumbers;
	}
	public static void main(String[] args) {
		LottoNumber l = new LottoNumber();
		l.createNums();
	}
}
