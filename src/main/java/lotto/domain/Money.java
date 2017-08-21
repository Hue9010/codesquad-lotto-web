package lotto.domain;

public class Money {
	private int money;

	Money(int money) {
		this.money = money;
	}

	public int lottoVolume() {
		return money / 1000;
	}

	public int calculateRate(double totalMoney) {
		return (int) ((totalMoney / money) * 100);
	}

}
