package ProVersion;

import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
//		Triangle triangle = new Triangle("삼각형");
//		Base rectangle = new Rec("사각형");
		// Base(부모클래스)에서 상속받았기때문에 부모 타입의 변수에 담을수있다.
//		System.out.println("도형을 선택해주세요");
//		Scanner scanner = new Scanner(System.in);
//		String userinput = scanner.nextLine();
//		double num = Double.parseDouble(userinput);
		
		Base[] poligon = {new Triangle("삼각형"), new Square("사각형"),new Circle("원형"),new Parallelogram("마름모")};
			for(int i = 0; i < 999999; i++) {
				System.out.println("도형을 선택해주세요");
				System.out.println("1. 삼각형");
				System.out.println("2. 사각형");
				System.out.println("3. 원형");
				System.out.println("4. 종료");

				Scanner scanner = new Scanner(System.in);
				String userinput = scanner.nextLine();
				int num = Integer.parseInt(userinput);
				if(num == 1) {
					poligon[0].inputData();
					poligon[0].printSize();
					System.out.println("");
				} else if (num == 2) {
					poligon[1].inputData();
					poligon[1].printSize();
					System.out.println("");
				} else if (num == 3) {
					poligon[2].inputData();
					poligon[2].printSize();
					System.out.println("");

				} else if (num == 4) {
					System.out.println("종료");
					break;
				}

			}
		
//		Circle circle = new Circle("원형");
//		
//		System.out.println("원하시는 도형을 선택하세요");
//		Scanner scanner = new Scanner(System.in);
//		String userinput = scanner.nextLine();
//		int num = Integer.parseInt(userinput);
//		
//		if(num == 1) {
//			triangle.inputData();
//			triangle.printSize();
//		}
//		else if(num == 2) {
//			rectangle.inputData();
//			rectangle.printSize();
//		}
//		else if(num == 3) {
//			circle.inputData();
//			circle.printSize();
//	}
	}
	}
