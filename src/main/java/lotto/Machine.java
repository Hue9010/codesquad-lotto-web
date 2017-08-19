package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Machine {
	private List<Integer> randomNumbers;
	private static final int normalLotto = 6;
	private static final int winningLotto = 7;

	Machine() {
		randomNumbers = new ArrayList<>();
		setup();
	}

	public void setup() {
		for (int i = 0; i < 45; i++) {
			randomNumbers.add(i + 1);
		}
	}

	public List<Lotto> createLottos(Money money) {
		List<Lotto> lottos = new ArrayList<>();
		for (int i = 0; i < money.lottoVolume(); i++) {
			lottos.add(createLotto(normalLotto));
		}
		return lottos;
	}

	private Lotto createLotto(int lottoType) {
		Collections.shuffle(randomNumbers);
		List<Integer> lotto = randomNumbers.subList(0, lottoType);
		Collections.sort(lotto);

		return new Lotto(lotto);
	}

	public Lotto createWinningLotto(String winningString) {
		if (winningString.equals("lottery")) {
			return createLotto(winningLotto);
		}

		List<Integer> winningLotto = new ArrayList<>();
		String[] winningStringArray = winningString.split(",");

		for (String number : winningStringArray) {
			winningLotto.add(Integer.parseInt(number));
		}
		return new Lotto(winningLotto);
	}
}
