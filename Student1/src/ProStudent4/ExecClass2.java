package ProStudent4;

import java.util.Arrays;
import java.util.Random;

public class ExecClass2 {

	public static void main(String[] args) {
//		Student s1 = new Student();
//		s1.name = "홍길동";
//		s1.middleScore = 900;
//		s1.finalScore = 950;
//		
//		
//		Student s2 = new Student("둘리");
//		Student s3 = new Student("까치", 500, 400);
		
		Student[] class1 = {
				new Student("atom1"),
				new Student("atom2"),
				new Student("atom3"),
				new Student("atom4"),
				new Student("atom5"),
				new Student("atom6"),
				new Student("atom7"),
				new Student("atom8"),
				new Student("atom9"),
				new Student("atom10"),};
		
		Student[] class2 = {
				new Student("atom1"),
				new Student("atom2"),
				new Student("atom3"),
				new Student("atom4"),
				new Student("atom5"),
				new Student("atom6"),
				new Student("atom7"),
				new Student("atom8"),
				new Student("atom9"),
				new Student("atom10"),};
		
		Student[] class3 = {
				new Student("atom1"),
				new Student("atom2"),
				new Student("atom3"),
				new Student("atom4"),
				new Student("atom5"),
				new Student("atom6"),
				new Student("atom7"),
				new Student("atom8"),
				new Student("atom9"),
				new Student("atom10"),};
		
		int sum1 = 0;
		Random random = new Random();
		for(int i = 0; i < class1.length; i++) {
			class1[i].middleScore = random.nextInt(1001);
			class1[i].finalScore = random.nextInt(1001);
			class1[i].sum();
			class1[i].avg();
			sum1 = sum1 + class1[i].finalScore;
		}
		int sum2 = 0;
		for(int i = 0; i < class2.length; i++) {
			class2[i].middleScore = random.nextInt(1001);
			class2[i].finalScore = random.nextInt(1001);
			class2[i].sum();
			class2[i].avg();
			sum2 = sum2 + class2[i].finalScore;
		}
		
		int sum3 = 0;
		for(int i = 0; i < class3.length; i++) {
			class3[i].middleScore = random.nextInt(1001);
			class3[i].finalScore = random.nextInt(1001);
			class3[i].sum();
			class3[i].avg();
			sum3 = sum3 + class3[i].finalScore;
		}
		double avg1 = sum1 / class1.length;
		double avg2 = sum2 / class2.length;
		double avg3 = sum3 / class3.length;

		System.out.println("class1 의 총합은 " + sum1 + "점 평균은 " + avg1 + "점 입니다.");
		System.out.println("class2 의 총합은 " + sum2 + "점 평균은 " + avg2 + "점 입니다.");
		System.out.println("class3 의 총합은 " + sum3 + "점 평균은 " + avg3 + "점 입니다.");
		int[] classScore = new int[3];
//		for(int i = 0; i < classScore.length; i++) {
		classScore[0] = sum1; 
		classScore[1] = sum2; 
		classScore[2] = sum3; 
		
//		for(int i = 0; i < classScore.length; i++) {
//			for(int j = 1; j < classScore.length-1; j++) {
//				if(classScore[j] > classScore[j-1]) {
//					int temp = classScore[j];
//					classScore[j] = classScore[j-1];
//					classScore[j-1] = temp;
//				}
//			}
//		}
		
        int i=0, j=0, rank=1;
        for(i=0; i<classScore.length; i++) {
            for(j=0; j<classScore.length; j++) {
                if(classScore[i]<classScore[j]) {
                    rank++;
                }
            }
            System.out.println(classScore[i] + "점 : " + rank + "등");
            rank=1;
        }

		System.out.printf(Arrays.toString(classScore));
		
	
		System.out.println(Arrays.toString(class1));
		System.out.println(Arrays.toString(class2));
		System.out.println(Arrays.toString(class3));

	}

}
