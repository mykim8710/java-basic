package TreeSetEx;

import java.util.*;

public class LottoTest {
	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<>();
		while (lotto.size() < 6) {
			lotto.add(new Random().nextInt(45) + 1);
		}
		System.out.println(lotto);
	}
}