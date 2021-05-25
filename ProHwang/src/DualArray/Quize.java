package DualArray;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Quize {
	public static void sort(double[]arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 1; j < arr.length-i; j++) {
				if(arr[j]>arr[j-1]) {
					double temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}

	public static void main(String[] args)  {
//		Scanner s = new Scanner(System.in);
//		double [][] score = new double[3][5];
//		for(int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				score[i][j] = s.nextInt();
//			}
//		}
		double [][] score = {{10,33,44,0,0},{27,5,98,0,0},{0,0,0,0,0}};
		for(int i = 0; i <2; i++) {
			for(int j = 0; j < 3; j++){
//				가로합계
				score[i][3] = score[i][3] + score[i][j];
//				세로합계
				score[2][j] = score[2][j] + score[i][j];
//				각줄합계
				score[2][3] = score[2][3] + score[i][j];
//				각줄평균
				score[i][4] = (score[i][3] / 3);
			}
		}
		System.out.println(Arrays.toString(score[0]));
		System.out.println(Arrays.toString(score[1]));
		System.out.println(Arrays.toString(score[2]));
		System.out.println("");

//		System.out.println(score.length);
//		System.out.println(score[0].length);
		
		double [] student1 = new double[3];
		double [] student2 = new double[3];
		System.arraycopy(score[0], 0, student1, 0, 3);
		System.arraycopy(score[1], 0, student2, 0, 3);
		System.out.println(Arrays.toString(student1));
		System.out.println(Arrays.toString(student2));
		
		sort(student1);
		System.out.println(Arrays.toString(student1));
		sort(student2);
		System.out.println(Arrays.toString(student2));

	}

}
