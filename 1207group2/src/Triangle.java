import java.util.Scanner;

public class Triangle extends Base {
	double bottom = 0;
	double height = 0;

	Triangle(String name) {
		super(name);
	}

	public void inputData() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("삼각형의 밑변을 입력해주세요");
		String inputText = scanner.nextLine();
		this.bottom = Double.parseDouble(inputText);

		System.out.println("삼각형의 높이를 입력해주세요");
		inputText = scanner.nextLine();
		this.height = Double.parseDouble(inputText);
	}

	public void calcArea() {
		this.areaSize = this.bottom * this.height / (double) 2;
	}
}
