package Hwangmiddle3;

import java.util.Arrays;
import java.util.Scanner;

public class No3_1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int matrix[][] = new int[x][y];
				
		for (int i = 0; i < matrix.length; i++) {	
			for (int j = 0; j < matrix[i].length; j++) {	
				matrix[i][j] = s.nextInt();
			}
			Arrays.sort(matrix[i]);
			System.out.println("");
		}	
		
		int tc = s.nextInt();
		int[] result = new int[6];
		for(int i = 0; i < tc; i++) {
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int result1 = 0;
			int result2 = 0;
			for(int j = 0; j < matrix.length; j++) {
				for(int k = 0; k< matrix[j].length; k++) {
					if(k == y1-1) {
						result1 = result1 + matrix[j][k];
						
					}else {
						continue;
					}
				}
			}
			for(int j = 0; j < matrix.length; j++) {
				for(int k = 0; k< matrix[j].length; k++) {
					if(j == x1-1) {
						result2 = result2 + matrix[j][k];
					}else {
						continue;
					}
				}
			}
			System.out.print(result1 + " "+ result2);
			
		}
		


		
	}

}
