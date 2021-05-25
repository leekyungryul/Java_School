package ProVersion;

import java.util.Scanner;

public class Circle extends Base{
	double half = 0;
	
	Circle(String name){
		super(name);
	}
	
	public void inputData() {
		super.inputData();
		Scanner scanner = new Scanner(System.in);		
		System.out.println("원의 반지름을 입력해주세요");
		String inputText = scanner.nextLine();
		this.half = Double.parseDouble(inputText);
	}
	
	public void calcArea() {
		this.areaSize = (this.half*this.half) * 3.14;
	}
}