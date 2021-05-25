package Sort;

import java.util.Arrays;
import java.util.Random;

public class 연습1 {
	public static void swap(int[]arr,int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static void sort(int[]arr) {
		for(int i = 0; i < arr.length; i++) {
			int lowindex = i;
			for(int j = i+1; j < arr.length; j ++) {

			if(arr[j]<arr[lowindex]) {
				lowindex = j;
					//int k = lowestindex;
					swap(arr,j,i);
				}
			}
		}
	}

	public static void main(String[] args) {
		Random random = new Random();
		int[]num = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(100);
		}
		sort(num);
		System.out.println(Arrays.toString(num));
	}

}
