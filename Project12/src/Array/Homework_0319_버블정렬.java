package Array;

import java.util.Arrays;
import java.util.Random;

public class Homework_0319_버블정렬 {
	public static void swap(int[] array, int first, int second) {
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
		//위치교환시키는 함수를 하나 만들었다.
	}

	public static void main(String[] args) {
		int[] numbers = new int[6];
		//6개의 공간을 가진 비어진 정수형 배열을 생성합니다. 
		numbers[0] = 7;
		numbers[1] = 21;
		numbers[2] = 8;
		numbers[3] = 43;
		numbers[4] = 3;
		numbers[5] = 5;
		//각 인덱스마다 숫자를 넣어줍니다.
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j=0; j < numbers.length-1-i; j++) {
				if(numbers[j]>numbers[j+1]) {
					swap(numbers,j,j+1);
					// j인덱스위치의 숫자가 j+1 인덱스 위치희 숫자보다 크다면 변경한다.
				}
			}
		}
		System.out.println(Arrays.toString(numbers));

	}

}
