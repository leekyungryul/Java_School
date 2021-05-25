package Sort;

import java.util.Arrays;
import java.util.Random;

public class Selection {
	public static void swap(int[]arr,int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static int lowestindex(int[]arr, int start) {
		int lowindex = start;
		for(int i = start; i < arr.length; i++) {
			if(arr[i] < arr[lowindex]) {
				lowindex = i;
			}
		}return lowindex;
	}
	public static void selectionsort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			int j = lowestindex(array,i);
			swap(array,i,j);
		}
	}
	public static void main(String[] args) {
		Random random = new Random();
		int[]num = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(100)+1;
		}
		selectionsort(num);
		System.out.println(Arrays.toString(num));
	}

}
