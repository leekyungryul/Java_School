package Triangle;

import java.util.Scanner;

public class ExecClass {

	public static void main(String[] args) {
		System.out.println("도형을 선택하세요");
		System.out.println("1. 삼각형");

		Scanner scanner = new Scanner(System.in);
		String Userinput = scanner.nextLine();
		int select = Integer.parseInt(Userinput);
		if (select==1) {
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("밑변을 입력하세요");
			String Userinput1 = scanner1.nextLine();
			double bottom = Double.parseDouble(Userinput1);
			System.out.println("높이를 입력하세요");
			String Userinput2 = scanner1.nextLine();
			double height = Double.parseDouble(Userinput2);			
			Triangle triangle = new Triangle(bottom,height);
			System.out.println(triangle.Cal());
			
		}
		
	}

}
