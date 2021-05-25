package 연습;

import java.util.Scanner;

public class Savebox {
	int coins = 0;
	public void deposit() {
		System.out.println("송금액을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String userinput = scanner.nextLine();
		int coin  = Integer.parseInt(userinput);
		coins = coins + coin;
		System.out.println("송금액은 " + coin + "원 입니다.");
	}
	public void deposit2() {
		System.out.println("송금자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String sender = scanner.nextLine();
		System.out.println("송금액을 입력하세요");
		String userinput = scanner.nextLine();
		int coin = Integer.parseInt(userinput);
		coins = coins + coin;
		System.out.println(sender + "님 " + coin + "원이 송금되었습니다.");
	}
	public void Last() {
		System.out.println("최종 누적액은 " + coins + "원입니다.");
	}
}
