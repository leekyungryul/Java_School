package Array;

import java.util.Arrays;
import java.util.Random;

public class Homework_버블정렬_중복방지 {

	public static void swap(int[] array, int first, int second) {
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}
	public static void main(String[] args) {
		Random r1 = new Random();
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = r1.nextInt(100);
			for(int j = 0; j < i; j++) {
				if(numbers[i]==numbers[j]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j=0; j < numbers.length-1-i; j++) {
				if(numbers[j]>numbers[j+1]) {
					swap(numbers,j,j+1);
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
	}
	

}
