package Array;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Homework_이중배열_4_4 {
	public static void main(String[] args) {
		double[][] number = {{10, 33, 44, 0, 0}, {27, 5, 98, 0, 0}, {0, 0, 0, 0, 0}};
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				number[i][3] = number[i][3] + number[i][j]; // x축 합계
				number[2][j] = number[2][j] + number[i][j]; // y축 합계
				number[2][3] = number[2][3] + number[i][j]; // 총합계
				number[0][4] = number[0][3] / 3; // 1번학생 평균
				number[1][4] = number[1][3] / 3; // 2번학생 평균
			}
		}
		double[][] score = new double[2][4];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				score[i][j] = number[i][j];
			}
		}
		
		System.out.println("계산 결과1");
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[0].length; j++) {
				System.out.print("(" + i + ", " + j + ") : " + number[i][j] + "    ");
			}
			System.out.println();
		}
		
		System.out.println("계산 결과2");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[0].length; j++) {
				System.out.print("(" + i + ", " + j + ") : " + score[i][j] + "    ");
			}
			System.out.println();
		}
		for(int i = 0; i < score[0].length-1; i++) {
			for(int j=0; j < score[0].length-1-i; j++) {
				if(score[0][j]<score[0][j+1]) {
					double temp = score[0][j];
					score[0][j] = score[0][j+1];
					score[0][j+1] = temp;
					// j인덱스위치의 숫자가 j+1 인덱스 위치희 숫자보다 크다면 변경한다.
				}
			}
		}
		System.out.println(Arrays.toString(score[0]));


		for(int i = 0; i < score[1].length-1; i++) {
			for(int j=0; j < score[1].length-1-i; j++) {
				if(score[0][j]<score[1][j+1]) {
					double temp = score[1][j];
					score[1][j] = score[1][j+1];
					score[1][j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(score[1]));
	}
}
