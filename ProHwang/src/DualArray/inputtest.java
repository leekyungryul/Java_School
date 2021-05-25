package DualArray;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class inputtest {

	public static void main(String[] args) throws Exception {
//		System.setIn(new FileInputStream("src/input1.txt"));
//
//		Scanner s = new Scanner(System.in);
		System.setIn(new FileInputStream("src/input1.txt"));

		/*
		 * 표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		
		int [][] score = new int[3][5];
		for(int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				score[i][j] = sc.nextInt();
			}
		}
		System.out.println(Arrays.toString(score[0]));
		System.out.println(Arrays.toString(score[1]));
		
//		double [][] score = {{10,33,44,0,0},{27,5,98,0,0},{0,0,0,0,0}};
		for(int i = 0; i <2; i++) {
			for(int j = 0; j < 3; j++){
//				가로합계
				score[i][3] = score[i][3] + score[i][j];
//				세로합계
				score[2][j] = score[2][j] + score[i][j];
//				각줄합계
				score[2][3] = score[2][3] + score[i][j];
//				각줄평균
				score[i][4] = score[i][3] / 3;


			}
		}
		System.out.println(Arrays.toString(score[0]));
		System.out.println(Arrays.toString(score[1]));
		System.out.println(Arrays.toString(score[2]));

		System.out.println(score.length);
		System.out.println(score[0].length);

	}

}
