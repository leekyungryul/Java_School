package Version1;

import java.util.Scanner;

public class Kaup {
	double Height = 0;
	double Weight = 0;
	public void Userinput() {
		System.out.println("키를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		String Userinput1 = scanner.nextLine();
		Height = Double.parseDouble(Userinput1) / 100;
		
		System.out.println("몸무게를 입력해 주세요");
		String Userinput2 = scanner.nextLine();
		Weight = Double.parseDouble(Userinput2);
	}
	public void Calkaup() {
		double Kaup = Weight / (Height*Height);
		if (Kaup >= 30) {
			System.out.println("비만입니다.");
		}
		else if (Kaup >= 24) {
			System.out.println("과체중입니다.");
		}
		else if (Kaup >= 20) {
			System.out.println("정상입니다.");
		}
		else if (Kaup >= 15) {
			System.out.println("저체중입니다.");
		}
		else if (Kaup >= 13) {
			System.out.println("여윔입니다.");
		}
		else if (Kaup >= 10) {
			System.out.println("영양실조증입니다.");
		}
		else if (Kaup < 10) {
			System.out.println("소모증입니다.");
		}
	}
}
