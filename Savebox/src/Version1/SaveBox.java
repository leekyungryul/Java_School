package Version1;

import java.util.Scanner;

public class SaveBox {
	int coins = 0;
	public void deposit1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("송금액을 입력해주세요");
		String Userinput = scanner.nextLine();
		int Money = Integer.parseInt(Userinput);
		coins = Money + coins;
		System.out.println("땽그랑");
	}
	public void deposit2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("송금자를 입력해주세요");
		String Sender = scanner.nextLine();
		System.out.println("송금액을 입력해주세요");
		String Userinput = scanner.nextLine();
		int Money = Integer.parseInt(Userinput);
		coins = Money + coins;
		System.out.println(Sender + "님 " + Money + "원이 입금되었습니다.");
	}
	public void Last() {
		System.out.println("최종 누적액은 " + coins + "원 입니다.");
	}
}
