package lotto.domain;

import java.util.List;

public class User {
	public List<Lotto> buyLottos;
	public Money money;
	public Result result;

	public User(int money) {
		this.money = new Money(money);
	}

	public void buyLottos(Machine machine) {
		buyLottos = machine.createLottos(money);
	}
	
	public int calculateRate() {
		return result.showRate(money);
	}

	public void matchLottos(Machine machine, String winningString) {
		result = new Result();
		Lotto winningLotto = machine.createWinningLotto(winningString);
		for (Lotto lotto : buyLottos) {
			result.update(winningLotto.matchLotto(lotto));
		}
	}
}
