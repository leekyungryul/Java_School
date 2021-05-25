package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//n가지 종류의 동전이 있다. 각각의 동전이 나타내는 가치는 다르다. 
//이 동전을 적당히 사용해서, 그 가치의 합이 k원이 되도록 하고 싶다. 
//그 경우의 수를 구하시오. 각각의 동전은 몇 개라도 사용할 수 있다.
//사용한 동전의 구성이 같은데, 순서만 다른 것은 같은 경우이다.
//입력
//첫째 줄에 n, k가 주어진다. (1 ≤ n ≤ 100, 1 ≤ k ≤ 10,000) 다음 n개의 줄에는 각각의 동전의 가치가 주어진다. 
//동전의 가치는 100,000보다 작거나 같은 자연수이다.
//출력
//첫째 줄에 경우의 수를 출력한다. 경우의 수는 231보다 작다.
//예제 입력 1 
//3 10
//1
//2
//5
//예제 출력 1 
//10
public class No2579 {
	static int[] dp;
	static int[] stair;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		dp = new int[n+1];
		stair = new int [n+1];
		for(int i = 1; i<= n; i++) {
			stair[i] = Integer.parseInt(bf.readLine());
		}
		dp[0] = 0;
		dp[1] = stair[1];
		dp[2] = stair[1]+stair[2];
		for(int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i-2]+stair[i], dp[i-3]+stair[i-1]+stair[i]);			
		}
		System.out.println(Arrays.toString(stair));
		System.out.println(Arrays.toString(dp));
		System.out.println(dp[n]);
	}
}
//f(n-2) +f(n)
//f(n-3)+f(n-1)+f(n)