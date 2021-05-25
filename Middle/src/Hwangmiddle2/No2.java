package Hwangmiddle2;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class No2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("배열의 길이");
		int len = s.nextInt();
		int array[] = new int[len];
		for(int j = 0; j < n; j++) {
			for(int i = 0; i < array.length; i++) {
				array[i] = s.nextInt();
			}
			Arrays.sort(array);
		}
		
//		System.out.println(Arrays.toString(array));
		
		
	}

}
