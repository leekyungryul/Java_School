package Array;

import java.util.Arrays;
import java.util.Random;

public class 소트 {

	public static void main(String[] args) {
		double number[] = new double[5];
		
		Random r1 = new Random();
		for(int i = 0; i < number.length; i++) {
			number[i] = r1.nextDouble();
			//1미만의 정수만 생성된다.
		}
		
		System.out.println(Arrays.toString(number));
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
	}

}
