package CorlorPaper;

import java.util.Scanner;

public class CorlorPaper {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		색종이의 갯수
		System.out.println("색종이의 갯수를 입력하세요");
		int N = s.nextInt();
		int[][] arr = new int[100][100];
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			System.out.println("시작좌표를 ");
			int X = s.nextInt();
			int Y = s.nextInt();
			for(int a = X; a < X+10; a++) {
				for(int b = Y; b < Y+10; b++) {
					arr[a][b] = 1;
				}
			}
		}
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(arr[i][j] == 1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
