package TestExample;

import java.util.Arrays;
import java.util.Random;

interface ILottoNumber {
	public abstract int[] randomNumber();
}

class LottoNumber implements ILottoNumber {
	int[] lotto = new int[6];
	Random r = new Random();

	@Override
	public int[] randomNumber() {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		return lotto;
	}

	public void printLottoNumber(int[] lotto) {
		System.out.println();
		System.out.println("=====행운의 Lotto번호=====");
		System.out.println();
		System.out.println(Arrays.toString(lotto));
		System.out.println();
		System.out.println("======================");
	}

}

public class LottoNumberTest {
	public static void main(String[] args) {
		ILottoNumber lotto1 = new LottoNumber();
		int[] lottoNumber = lotto1.randomNumber();
		((LottoNumber) lotto1).printLottoNumber(lottoNumber);

	}
}
