package Version1;

import java.util.Scanner;

public class ExecClass {

	public static void main(String[] args) {
		SaveBox savebox = new SaveBox();
		for(int i = 0; i < 99999; i++) {
		System.out.println("메뉴를 선택하세요");
		System.out.println("1. 송금");
		System.out.println("2. 송금자 입력 후 송금");
		System.out.println("원하지 않을시 crash");
		Scanner scanner = new Scanner(System.in);
		String Userinput1 = scanner.nextLine();
		
		if(Userinput1.equals("1")) {
			savebox.deposit1();
		}else if(Userinput1.equals("2")) {
			savebox.deposit2();
		}else if(Userinput1.equals("crash")) {
			savebox.Last();
			break;
		}
		
	}}

}
