package Triangle2;

import java.util.Scanner;

public class Figure {
	double bottom;
	double height;
	public void TriangleInput(){
		System.out.println("밑변을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String Userinput1 = scanner.nextLine();
		double bottom = Double.parseDouble(Userinput1);
		this.bottom = bottom;
		System.out.println("높이를 입력하세요");
		String Userinput2 = scanner.nextLine();
		double height = Double.parseDouble(Userinput2);
		this.height = height;

	}
	public void TriangleCal(){
		double result = (double) (bottom * height) / 2;
		System.out.println(result);
	}
		

}
