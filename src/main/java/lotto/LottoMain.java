package lotto;

import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		Machine machine = new Machine();
		Scanner scanner = new Scanner(System.in);

		User user = new User(Input.useMoney(scanner));
		user.buyLottos(machine);
		user.showLottos();
		user.matchLottos(machine, Input.winningNumber(scanner));
		user.showResult();

		scanner.close();
	}
}
