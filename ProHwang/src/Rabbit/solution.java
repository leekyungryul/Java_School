package Rabbit;

import java.io.FileInputStream;
import java.util.Scanner;

class solution  {
	static int N;
	static int AnswerN;

	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("src/input.txt"));
 
		
		/*
		 * 표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		int T; 
		int N = 20;
		int numberOfRabbit;
		int fox_X, fox_Y;
		T = sc.nextInt();
//		토끼를 잡아내는 횟수를 자동입력한다.
		sc.nextLine();
//		메모장에서 칸을 넘기는 역할이다.
		
		for (int test_case = 1; test_case <= T; test_case++) {
//			토끼잡는 횟수가 3번이므로 아래전체를 3번 반복한다.
			// 21x21 배열 생성
			int[][] map = new int[N+1][N+1];
//			토끼의 수를 자동입력한다.
			numberOfRabbit = sc.nextInt();
			// 여우 위치의 가로좌표와 세로좌표를 자동입력한다.
			fox_X = sc.nextInt();
			fox_Y = sc.nextInt();
			map[fox_X][fox_Y] = 2; // 여우는 맵에서 2로 표시

			// 토끼 위치 배열에 넣기
			for (int i = 1; i <= numberOfRabbit; i++) {
				int rabbit_x = sc.nextInt();
				int rabbit_y = sc.nextInt();
				map[rabbit_x][rabbit_y] = 1; // 토끼는 맵에서 1로 표시
			}

			// 토끼 잡기
			int cnt = 0;
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (map[i][j] == 1) {
						// 가로 토끼잡음
						if (i == fox_X) {
							cnt++;
							// 세로 토끼 잡음
						} else if (j == fox_Y) {
							cnt++;
							// 대각선 토끼 잡음
						} else if ( Math.abs((int)(i - fox_X)) == Math.abs((int)(j - fox_Y))) {
							cnt++;
						}
						
					}
				}
			}
			AnswerN = cnt;

			System.out.println("#" + test_case + ": " + AnswerN);
			
			// Arrays.stream(map).forEach(x -> Arrays.fill(x, 0)); // use this line only when you want to reset map[][] to 0
		}
	}
}


