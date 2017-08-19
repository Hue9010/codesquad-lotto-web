package lotto;

import java.util.Scanner;

public class Input {

	public static int useMoney(Scanner scanner) {
		System.out.println("구입금액을 입력해 주세요.");
		int money = scanner.nextInt();
		scanner.nextLine();
		return money;
	}

	public static String winningNumber(Scanner scanner) {
		// System.out.println("지난 주 당첨 번호를 입력해 주세요.\n예) 1,2,3,4,5,6,7 (수동입력시 7개
		// 입력)\n7번째는 보너스 번호, lottery입력시 랜덤 생성.");
		System.out.println("지난 주 당첨 번호를 입력해 주세요.\n예) 1,2,3,4,5,6,7 (수동입력시 보너스번호 포함 7개 입력, lottery입력시 랜덤 생성)");
		return scanner.nextLine();
	}
}
