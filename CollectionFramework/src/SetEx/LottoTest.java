package SetEx;

import java.util.HashSet;
import java.util.Set;

public class LottoTest {
	public static void main(String[] args) {
		Set lotto = new HashSet();

		while (lotto.size() < 6) {
			int lottoNum = (int) (Math.random() * 45) + 1;
			lotto.add(lottoNum);
		}

		System.out.println(lotto);
	}
}
