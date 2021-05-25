package ProStep2;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Student[] class1 = {
			new Student("홍길동"),
			new Student("둘리"),
			new Student("또치"),	
			new Student("도우너"),	
			new Student("강감찬"),	
			new Student("이순신"),	
			new Student("이성계"),	
			new Student("박찬호"),	
			new Student("박세리"),	
			new Student("김연아")	
		};
		// 입력부분
		Random random = new Random();
		for (int i = 0; i < class1.length; i++) {
			class1[i].middleScore = random.nextInt(1001);
			class1[i].finalScore = random.nextInt(1001);
		}
		System.out.println(Arrays.toString(class1));
		
		// 계산부분
		for (int i = 0; i < class1.length; i++) {
			class1[i].sumScore();
		}
		
		// 클래스 총합 합산
		int classTotalScore = 0;
		int classTotalMiddleScore = 0;
		int classTotalFinalScore = 0;
		double classAvgTotalScore = 0;
		for (int i = 0; i < class1.length; i++) {
			classTotalScore = classTotalScore + class1[i].totalScore;
			classTotalMiddleScore = classTotalMiddleScore + class1[i].middleScore;
			classTotalFinalScore = classTotalFinalScore + class1[i].finalScore;
		}
		classAvgTotalScore = (double)classTotalScore / class1.length;
		
		// 성적 순으로 정렬
		for (int i = 0; i < class1.length - 1; i++) {
			for (int j = i; j < class1.length; j++) {
				if (class1[i].totalScore < class1[j].totalScore) {
					Student temp = class1[i];
					class1[i] = class1[j];
					class1[j] = temp;
				}
			}
		}
		
		// 순위 세팅
		for (int i = 0; i < class1.length; i++) {
			if (i > 1 && class1[i - 1].totalScore == class1[i].totalScore) {
				class1[i].rank = class1[i - 1].rank;
			} else {
				class1[i].rank = i + 1;
			}
		}
		
		// 출력
		for (int i = 0; i < class1.length; i++) {
			System.out.println(class1[i].name 
					+ " 총점 : " + class1[i].totalScore 
					+ " (" + class1[i].rank + ")");
		}
	}
}
