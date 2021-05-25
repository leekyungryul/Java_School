package Triangle2;

import java.util.Scanner;

public class ExecClass {

	public static void main(String[] args) {
		System.out.println("도형을 선택하세요");
		System.out.println("1. 삼각형");
		System.out.println("2. 사각형");
		System.out.println("3. 원형");
		System.out.println("4. 마름모");


		Scanner scanner = new Scanner(System.in);
		String Userinput = scanner.nextLine();
		int select = Integer.parseInt(Userinput);
		Figure figure = new Figure();
		if (select==1) {
			figure.TriangleInput();
			figure.TriangleCal();
		}
	}

}

