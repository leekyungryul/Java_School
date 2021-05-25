package Sort;

import java.util.Arrays;
import java.util.Random;

public class Bubble {
	public static void swap(int[]arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100)+1;
		}
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 1; j < numbers.length-i; j++) {
				if(numbers[j] < numbers[j-1]) {
					swap(numbers,j,j-1);
				}
			}System.out.println((i+1)+"회전= "+Arrays.toString(numbers));
		}
}
}