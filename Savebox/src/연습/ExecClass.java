package 연습;

import java.util.Scanner;

public class ExecClass {

	public static void main(String[] args) {
		Savebox savebox = new Savebox();
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 99999; i++) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 송금");
			System.out.println("2. 송금자 입력 후 송금");
			System.out.println("원하지 않을시 crash입력");
			String userinput = scanner.nextLine();
			if(userinput.equals("1")) {
				savebox.deposit();
			}
			else if(userinput.equals("2")) {
				savebox.deposit2();
			}
			else if(userinput.equals("crash")) {
				savebox.Last();
			}
		}
		
	}

}
