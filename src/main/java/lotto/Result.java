package lotto;

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

	public void showResult(Money money) {
		System.out.println("당첨 통계");
		System.out.println("--------------------");
		System.out.println("3개 일치 (5000원)- " + countOfMatch3 + "개");
		System.out.println("4개 일치 (50000원)- " + countOfMatch4 + "개");
		System.out.println("5개 일치 (1500000원)- " + countOfMatch5 + "개");
		System.out.println("5개 일치, 보너스 볼 일치(30000000원)- " + countOfMatchBonus + "개");
		System.out.println("6개 일치 (2000000000원)- " + countOfMatch6 + "개");
		System.out.println("총 수익률은 " + money.calculateRate(totalMoney()) + "%입니다.");
	}
}
