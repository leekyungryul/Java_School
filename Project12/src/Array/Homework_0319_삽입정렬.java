package Array;

import java.util.Arrays;
import java.util.Random;

public class Homework_0319_삽입정렬 {

	public static void main(String[] args) {
		int numbers[] = new int [10];
		Random r1 = new Random();
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = r1.nextInt(100);
		}
		System.out.println(Arrays.toString(numbers));
		int compare,j;
		//비교 대상인 첫번째 i값을 compare 정수변수로 설정
		for(int i = 1; i < numbers.length; i++) {
			compare = numbers[i];
			//첫번째 1번 인덱스의 값을 compare에 지정해 놓는다.
			for(j = i-1; j>=0 && numbers[j]>compare; j--) {
				//i의 값보다 한칸 작은 값부터, 그 값이 위의 비교대상인 값보다 크고 0보다 클때까지 
				// 한칸씩 줄이면서 비교한다.
				numbers[j+1] = numbers[j];
				//
			}
			numbers[j+1] = compare;
		}
		System.out.println(Arrays.toString(numbers));
	}

}
