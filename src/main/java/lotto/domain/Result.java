package lotto.domain;

public class Result {
	private int countOfMatch3;
	private int countOfMatch4;
	private int countOfMatch5;
	private int countOfMatch6;
	private int countOfMatchBonus;

	Result() {
		countOfMatch3 = 0;
		countOfMatch4 = 0;
		countOfMatch5 = 0;
		countOfMatch6 = 0;
		countOfMatchBonus = 0;
	}

	public void update(int count) {
		switch (count) {
		case 3:
			countOfMatch3++;
			break;
		case 4:
			countOfMatch4++;
			break;
		case 5:
			countOfMatch5++;
			break;
		case 6:
			countOfMatch6++;
			break;
		case 7:
			countOfMatchBonus++;
			break;
		default:
			break;
		}
	}

	private double totalMoney() {
		double totalMoney = countOfMatch3 * 5000 + countOfMatch4 * 50000 + countOfMatch5 * 1500000
				+ countOfMatchBonus * 30000000 + countOfMatch6 * 2000000000;
		return totalMoney;
	}

	public int showRate(Money money) {
		return money.calculateRate(totalMoney());
	}

	public int getCountOfMatch3() {
		return countOfMatch3;
	}

	public int getCountOfMatch4() {
		return countOfMatch4;
	}

	public int getCountOfMatch5() {
		return countOfMatch5;
	}

	public int getCountOfMatch6() {
		return countOfMatch6;
	}

	public int getCountOfMatchBonus() {
		return countOfMatchBonus;
	}
	
}
