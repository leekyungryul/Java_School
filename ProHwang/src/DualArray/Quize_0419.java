package DualArray;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Quize_0419 {

	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("src/input2.txt"));
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int [][] array = new int[a][b];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = s.nextInt();
			}
		}
		int T; 
		T = s.nextInt();
		for(int i = 0; i < T; i++) {
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();
			int result1 = 0;
			for(int j = 0; j < array.length; j++) {
				for(int k = 0; k< array[j].length; k++) {
					if(j < x1-1 ) {
						continue;
					}
					if(k < y1-1) {
						continue;
					}
					if(j > x2-1) {
						continue;
					}
					if(k > y2-1) {
						continue;
					}
					else {
						result1 = result1 + array[j][k];
					}
				}
			}
			System.out.println(result1);
		}

	}

}
