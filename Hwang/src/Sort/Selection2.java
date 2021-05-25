package Sort;

import java.util.Arrays;
import java.util.Random;

public class Selection2 {
	public static void swap(int[]arr,int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static int highestindex(int[]arr, int start) {
		int highindex = start;
		for(int i = start; i < arr.length; i++) {
			if(arr[i] > arr[highindex]) {
				highindex = i;
			}
		}return highindex;
	}
	public static void selectionsort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			int j = highestindex(array,i);
			swap(array,i,j);
		}
	}
	public static void main(String[] args) {
		Random random = new Random();
		int[]num = new int[20];
		for(int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(100)+1;
			for(int j = 0; j < i; j++) {
				if(num[i]==num[j]) {
					i--;
				}
			}
		}
		selectionsort(num);
		System.out.println(Arrays.toString(num));
	}

}
