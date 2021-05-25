package Sort;

import java.util.Arrays;
import java.util.Random;

public class Bubble {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[10];
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(numbers));
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
		}
	
		public static void sort(int[] arrays) {
			for(int i = 0; i < arrays.length-1; i++) {
				for(int j = 1; j < arrays.length-i; j++) {
					if(arrays[j] < arrays[j-1]) {
						swap(arrays,j,j-1);
					}
				}System.out.println((i+1)+"회전결과 = "+Arrays.toString(arrays));
			}
		}
		private static void swap(int[]arr,int first,int second) {
			int temp = arr[first];
			arr[first]=arr[second];
			arr[second]=temp;
		}
	}


