package Hwangmiddle4;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class No4 {
//	주어진 숫자를 역으로 정렬을 하고 처음 숫자를 k만큼 쓰고 그 다음 숫자를 한번쓰고 다시 첫번째 숫자를 다시 사용하고
//	
	public static void main(String[] args)throws Exception{
		System.setIn(new FileInputStream("src/no4.txt"));
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		int cnt = s.nextInt();
		int part = s.nextInt();
		int[] arr = new int[len];
		for(int i = 0; i < len; i++) {
			arr[i] = s.nextInt();
		}
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 1; j < arr.length-i; j++) {
				if(arr[j] > arr[j-1]) {
					int temp =arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		int count = 0;
		int[] d = new int[len];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < part; j++) {
				count++;
				d[j] = arr[i];
				
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
}
}

