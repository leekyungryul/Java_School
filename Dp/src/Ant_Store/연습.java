package Ant_Store;

import java.io.FileInputStream;
import java.util.Scanner;

public class 연습 {
//	개미의 식량창고 털기
//	n개의 식량창고가 있다.
//	각 창고마다 저장된 식량이 다르다
//	인접한 창고를 연속해서 털수없다.
//	가장 많은 식량을 털수있는 최대값을 산출
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("src/ant.txt"));
		Scanner s = new Scanner(System.in);
//		창고의 숫자를 받았다.
		int n = s.nextInt();
//		각 창고별 식량의 숫자를 담을 배열을 만들어주었다.
		int [] arr = new int [n+1];
//		각 dp값을 담을 배열을 같은 크기로 만들어주었다.
		int [] dp = new int[n+1];
//		각 창고에 식량의 크기를 배열에 담는다
		for(int i = 1; i <= n; i++) {
			arr[i] = s.nextInt();
		}
//		dp배열의 첫번째 값은 식량크기저장배열의 첫번째 값과 같이 한다.
		dp[1] = arr[1];
		dp[2] = Math.max(arr[1], arr[2]);
//		첫번째 값을 제외하고 두번째부터 계산을 시작한다.
//		두번째부터 현위치에서 식량을 털었을때 총합이 바로앞에서 턴 결과보다 크다면 창고를 털고 dp배열에 담는다.
		for(int i = 3; i <= n; i++ ) {
			dp[i] = Math.max(dp[i-2] + arr[i], dp[i-1]);
		}
		System.out.println(dp[n]);
		
	}

}