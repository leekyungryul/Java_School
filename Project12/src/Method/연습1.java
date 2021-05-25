package Method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 연습1 {

		public static void swap(int[] array, int first, int second) {
			int temp = array[first];
			array[first] = array[second];
			array[second] = temp;
		}
		public static void main(String[] args) {
			int[] numbers = new int[10];
			Random r1 = new Random();
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = r1.nextInt(100);
				for(int j =0; j < i; j++) {
					if(numbers[i]==numbers[j]) {
						i--;
					}
				}
			}
			for(int i = 1; i < numbers.length; i++) {
				for(int j = 0; j < numbers.length-i; j++) {
					if(numbers[j] > numbers[j+1]) {
						swap(numbers,j,j+1);
					}
				}
			}System.out.println(Arrays.toString(numbers));
		}
		
	}


