package 연습;

import java.util.Scanner;

public class Figure {
	double height ;
	double bottom;
	double width;
	double radius;
	Scanner scanner = new Scanner(System.in);
	public void Triangle_Input() {
		System.out.println("높이를 입력하세요");
		String userinput = scanner.nextLine();
		double height = Double.parseDouble(userinput);
		this.height = height;
		System.out.println("밑변의 길이를 입력하세요");
		String userinput2 = scanner.nextLine();
		double bottom = Double.parseDouble(userinput2);
		double result = (height * bottom) / 2;
		System.out.println("넓이는 "+ result);
	}
}
