package Sort;

import java.util.Arrays;
import java.util.Random;

public class 연습 {
	public static int lowestindex(int []arr,int start) {
		int lowindex = start;
		for(int i = start; i < arr.length; i++) {
			if (arr[i] < arr[lowindex]) {
				lowindex = i;
			}
		}return lowindex;
	}
	public static void swap(int[]arr,int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static void sort(int[]arr) {
		for(int i = 0; i < arr.length; i++) {
			int j = lowestindex(arr,i);
			swap(arr,i,j);
			System.out.println((i+1)+ "번째 = "+Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		//배열 중 가장 작은 수를 구하는 메소드를 생성한다.
		//선택정렬 메소드를 생성한다(위의 메소드를 이용해서)
		Random random = new Random();
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i]= random.nextInt(100)+1;
			
		}sort(num);
		System.out.println(Arrays.toString(num));
	}

}
