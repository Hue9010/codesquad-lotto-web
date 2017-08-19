package lotto;

import java.util.Collections;
import java.util.List;

public class Lotto {

	private final List<Integer> lottoNumbers;
	private static final int bonusIndex = 6;
	private static final int lottoSize = 6;
	
	Lotto(List<Integer> lotto) {
		lottoNumbers = Collections.unmodifiableList(lotto);
	}

	public void show() {
		System.out.println(lottoNumbers);
	}

	public int matchLotto(Lotto buyLotto) {
		int count = 0;
		for (int i = 0; i < lottoSize; i++) {
			count += buyLotto.matchNumber(lottoNumbers.get(i));
		}
		if (count == 5 && buyLotto.matchNumber(lottoNumbers.get(bonusIndex)) == 1) {
			count = 7;
		}
		return count;
	}

	private int matchNumber(int number) {
		if (lottoNumbers.contains(number)) {
			return 1;
		}
		return 0;
	}

}
