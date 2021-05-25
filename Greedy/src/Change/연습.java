package Change;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("제품의 가격을 입력하세요");
		int product = s.nextInt();
		int money = 1000;
		int sum = 0;
		int[]arr = {500,100,50,10,5,1};
		int remain = money - product;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > remain) {
				continue;
			}
			if(arr[i] < remain) {
				sum = sum + (remain / arr[i]);
				remain = remain%arr[i];
			}
		}
		System.out.println(sum);
		
	}

}
