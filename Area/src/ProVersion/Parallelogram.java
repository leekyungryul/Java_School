package ProVersion;

import java.util.Scanner;

public class Parallelogram extends Base{
	double width = 0;
	double height = 0;
	
	Parallelogram(String name){
		super(name);
	}
	
	public void inputData() {
		super.inputData();

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("마름모의 가로 길이를 입력해주세요");
		String inputText = scanner.nextLine();
		this. width = Double.parseDouble(inputText);
		
		System.out.println("마름모의 세로 길이를 입력해수제요");
		inputText = scanner.nextLine();
		this. height = Double.parseDouble(inputText);
	}
	
	public void calcArea() {
		this.areaSize = this.width * this.height;
	}
}
