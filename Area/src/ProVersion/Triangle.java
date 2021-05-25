package ProVersion;

import java.util.Scanner;

public class Triangle extends Base{
	double baseLine = 0;
	double height = 0;
	
	Triangle(String name){
		super(name);
	}
	@Override //왼쪽 내용을 입력하고 아래 새로운 메소드를 만들면 오류가 발생한다(기존 메소드에서 수정만 가능) 
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		super.inputData();
		
		System.out.println("밑변을 입력해주세요");
		String inputText = scanner.nextLine();
		this. baseLine = Double.parseDouble(inputText);
		
		System.out.println("높이를 입력해주세요");		
		inputText = scanner.nextLine();
		this. height = Double.parseDouble(inputText);
	}
	
	public void calcArea() {
		this.areaSize = this.baseLine * this.height / (double)2;
	}
}
