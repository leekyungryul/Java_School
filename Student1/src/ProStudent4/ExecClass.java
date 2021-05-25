package ProStudent4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExecClass {

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
				new Student("atom10"),
		};
		int sum1 = 0;
		Random random = new Random();
		for(int i = 0; i < class1.length; i++) {
			class1[i].middleScore = random.nextInt(1001);
			class1[i].finalScore = random.nextInt(1001);
			class1[i].sum();
			class1[i].avg();
			sum1 = sum1 + class1[i].finalScore;
		}
		int avg = sum1 / class1.length;
		System.out.println("class1 의 총합은 " + sum1 + "점 입니다.");
		System.out.println("class1 의 평균은 " + avg + "점 입니다.");
				
		System.out.println(Arrays.toString(class1));

		for(int i = 0; i < class1.length; i++) {
			for(int j = 1; j < class1.length-1; j++) {
				if(class1[j].sum > class1[j-1].sum) {
					Student temp = class1[j];
					class1[j] = class1[j-1];
					class1[j-1] = temp;
				}
			}
		}
//		System.out.println(Arrays.toString(class1));
		for(int i = 0; i < class1.length; i++) {
			System.out.println(i+1 + "등: " + class1[i]);
		}


	}

}
