package Waitng;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Waitng {
//	int [] arr;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("src/input.txt"));	
		Scanner s = new Scanner(System.in);
//		System.out.println("인원을 입력하세요");
		int N = s.nextInt();
		int [] arr = new int [N];
		for(int i = 0; i < arr.length; i++) {
//			System.out.println(i+1 + "번 대기자의 인출시간을 입력하세요");
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		int min = 0;
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			min = min + arr[i];
			sum = sum + min;
			System.out.println(min);
		}
		System.out.println(sum);
	}

}
