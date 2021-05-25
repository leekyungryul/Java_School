package Student2;

import java.util.Arrays;
import java.util.Scanner;

public class ExecClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalScore;
		int average;
		Student[] student = new Student[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("이름을 입력해주세요.");
			String name = scanner.nextLine();
			
			System.out.println("중간고사 점수를 입력해주세요");
			String inputString = scanner.nextLine();
			int midScore = Integer.parseInt(inputString);

			System.out.println("기말고사 점수를 입력해주세요");
			inputString = scanner.nextLine();
			int finalScore = Integer.parseInt(inputString);
			
			student[i] = new Student(name, midScore, finalScore);
			student[i].totalScore = student[i].midScore +student[i].finalScore;
			student[i].average = student[i].totalScore / 2;
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(student[i].name + "의 총점은 " +student[i].totalScore + "점 입니다.");
			System.out.println(student[i].name + "의 평균은 " +student[i].average + "점 입니다.");
		}
	
		for(int i = 0; i < student.length; i++) {
			for(int j = 1; j < student.length-i; j++) {
				if(student[j].totalScore > student[j-1].totalScore) {
					Student temp = student[j];
					student[j] = student[j-1];
					student[j-1] = temp;
		}

	}				

		}System.out.println(Arrays.toString(student));
		}}
