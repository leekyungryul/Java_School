package DualArray;

import java.util.Arrays;
import java.util.Scanner;

public class 연습 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [][] array = new int[3][3];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println(i*3+j+1 + "번째 숫자를 입력해주세요");
				array[i][j] = s.nextInt();
			}
			Arrays.sort(array[i]);
		}
		System.out.println(Arrays.toString(array[0]));
		System.out.println(Arrays.toString(array[1]));
		System.out.println(Arrays.toString(array[2]));
		System.out.println("");
		int [][] sumarray = new int [5][4];
		for(int i = 0; i < sumarray.length; i++) {
			for(int j = 0; j < sumarray[i].length; j++) {
				if(i < 3 && j <3) {
					sumarray[i][j] = array[i][j]; 
				}
				else if(j == 3) {
					sumarray[i][j] = Arrays.stream(sumarray[i]).sum();
				}
				else if(i == 3){
					sumarray[i][j] = sumarray[0][j] + sumarray[1][j] + sumarray[2][j];
				}
				else if(i == 4) {
					sumarray[i][j] = sumarray[i-1][j] / 3;
				}
				
			}
		}
		for(int i = 0; i < sumarray.length; i++) {
			System.out.println(Arrays.toString(sumarray[i]));
		}
	}
}
