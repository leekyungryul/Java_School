package Atm;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Atm {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("src/Atm.txt"));
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int [] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		int sum = 0;
		int sum2 = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum +arr[i];
			sum2 = sum2 + sum; 
		}
		System.out.println(sum2);
	}

}
