package Greatcommon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Great {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[]  arr = new int[2];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("숫자입력");
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[-1]);
		for(int j = 0; j < arr.length; j++) {
			for(int i = 0; i < arr[1]; i++) {
				if(i > 0 && arr[j] % i == 0 && arr[j+1] % i == 0) {
					System.out.println(i);
				}
			}
		}
		
	}

}
