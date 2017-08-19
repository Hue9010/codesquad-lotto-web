package lotto;

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
	
	public void showLottoVolume() {
		System.out.println(lottoVolume() + "개를 구매했습니다.\n");
	}
}
