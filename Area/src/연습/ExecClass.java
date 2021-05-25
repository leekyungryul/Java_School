package 연습;

import java.util.Scanner;

public class ExecClass {

	public static void main(String[] args) {
		System.out.println("도형을 선택하세요");
		System.out.println("1. 삼각형");
		Scanner scanner = new Scanner(System.in);
		String userinput = scanner.nextLine();
		Figure f = new Figure();
		if(userinput.equals("1")) {
			f.Triangle_Input();
		}
	}

}
