package ProVersion;

import java.util.Scanner;

public class Square extends Base {
	double width = 0;
	double height = 0;

	Square(String name) {
		super(name);
	}

	public void inputData() {
		super.inputData();

		Scanner scanner = new Scanner(System.in);

		System.out.println("사각형의 가로 길이를 입력해주세요");
		String inputText = scanner.nextLine();
		this.width = Double.parseDouble(inputText);

		System.out.println("사각형의 세로 길이를 입력해주세요");
		inputText = scanner.nextLine();
		this.height = Double.parseDouble(inputText);
	}

	public void calcArea() {
		this.areaSize = this.width * this.height;
	}
}