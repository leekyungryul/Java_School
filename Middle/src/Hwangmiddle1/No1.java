package Hwangmiddle1;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class No1 {

	public static void main(String[] args)throws Exception{
		System.setIn(new FileInputStream("src/no3.txt"));
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		
		int [][] arr = new int[x+1][y+1];
		for(int i = 1; i <= arr.length; i++) {
			for(int j = 1; j <= arr[i].length; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		int tc = s.nextInt();
		for(int k = 0; k < tc; k++) {
			int x1 = s.nextInt();
			int x2 = s.nextInt();
			int[][] arr2 = new int[x+2][y+2];
			for(int i = 0; i < arr2.length; i++) {
				for(int j = 0; j < arr2[i].length; j++) {
					arr2[i][j] = arr[i][j];
				}
			}
			System.out.println(Arrays.toString(arr[0]));
		}
	}

}
