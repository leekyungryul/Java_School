package Ant_Store;

import java.io.FileInputStream;
import java.util.Scanner;

public class Ant {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("src/Ant.txt"));
		Scanner s = new Scanner(System.in);
//		개미가 털 창고의 갯수를 입력받는다
		int n = s.nextInt();
//		창고의 가치를 저장할 배열과 각 위치에서 도출된 결과값을 저장할 배열을 만든다.
		int [] arr = new int[n];
		int [] dp = new int[n];
//		각 창고의 가치를 배열에 담는다. 
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for(int i = 0; i < n; i++) {
			if(dp[i] != 0) {
				continue;
			}
			dp[i] = Math.max(dp[i-1], dp[i-2]+arr[i]);
		}
		System.out.println(dp[n-1]);
	}

}