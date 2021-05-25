package Waitng;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
//		대기자의 숫자를 받는다(배열의 크기결정)
//		각 대기자별 소요시간을 받는다.(배열내 요소들의 값)
//		순서를 서는 방법에 따라 개일별 소요시간의 전체합이 달라진다.(오름차순이 가장 적은 시간을 가진다.)
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int []arr = new int[N];
		Random r = new Random();
		for(int i = 0; i < N; i++) {
			arr[i] = r.nextInt(15)+1;
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int sum = 0;
		int min = 0;
		for(int j = 0; j < arr.length; j++) {
			sum = sum + arr[j];
			min = min +sum;
			System.out.println(sum);
			System.out.println("");
			System.out.println(min);
			System.out.println("");
		}
		System.out.println(min);
	}

}
