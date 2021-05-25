package Dfs;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		s.nextLine();
		int [][] arr = new int[n][m];
		for(int i = 0; i < n; i++) {
			String str = s.nextLine();
			for(int j = 0; j < m; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
