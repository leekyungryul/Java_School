package Sort;

import java.util.Arrays;
import java.util.Random;

public class 연습 {
	public static void swap(int[]arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static int lowindex(int[]arr, int a) {
		int low = a;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < arr[a]) {
				a = i;
			}
		}return a;

	}
	public static void sort(int [] arr) {
		for(int i = 0; i < arr.length; i++) {
			int lowidx = lowindex(arr, i);
			swap(arr,i,lowidx);
		}
	}
	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[10];
		for(int i = 0; i < num.length; i ++) {
			num[i] = r.nextInt(100)+1;
		}
		System.out.println(num);
		sort(num);
		System.out.println();
	}
}
