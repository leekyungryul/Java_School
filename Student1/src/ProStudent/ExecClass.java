package ProStudent;

import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Student[] student = new Student[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("이름을 입력해주세요.");
			String name = scanner.nextLine();
			
			System.out.println("국어 점수를 입력해주세요");
			String inputString = scanner.nextLine();
			int korScore = Integer.parseInt(inputString);

			System.out.println("영어 점수를 입력해주세요");
			inputString = scanner.nextLine();
			int engScore = Integer.parseInt(inputString);

			System.out.println("수학 점수를 입력해주세요");
			inputString = scanner.nextLine();
			int mathScore = Integer.parseInt(inputString);
			
			student[i] = new Student(name, korScore, engScore, mathScore);
		}
		
		int totalKorScore = 0;
		int totalEngScore = 0;
		int totalMathScore = 0;
		for (int i = 0; i < 5; i++) {
			totalKorScore = totalKorScore + student[i].korScore;
			totalEngScore = totalEngScore + student[i].engScore;
			totalMathScore = totalMathScore + student[i].mathScore;
		}
		
		System.out.println("국어 총합 : " + totalKorScore);
		System.out.println("영어 총합 : " + totalEngScore);
		System.out.println("수학 총합 : " + totalMathScore);
	}
}