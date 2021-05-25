package 연습;

import java.util.Scanner;

public class Kaup {
//	double weight;
//	double hieght;
	public double Userinput1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		String Userinput1 = scanner.nextLine();
		double Height = Double.parseDouble(Userinput1)/100;
		return Height;
	}
	public double Userinput2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몸무게를 입력하세요");
		String Userinput2 = scanner.nextLine();
		double Weight = Double.parseDouble(Userinput2);
		return Weight;
	}
	public void calKaup(double weight, double height) {
		double kaup = (double)weight / (height*height);
		if(kaup >= 30) {
			System.out.println("비만");
		}else if(kaup >= 24) {
			System.out.println("과체중");
		} else if (kaup >= 20) {
			System.out.println("정상");
		} else if (kaup > 15) {
			System.out.println("저체중");
		} else if (kaup >= 13) {
			System.out.println("여윔");
		} else if (kaup >= 10) {
			System.out.println("영양 실조증");
		} else {
			System.out.println("소모증");
		}
	}
}
