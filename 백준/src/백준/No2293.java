package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No2293 {
//	n가지 종류의 동전이 있다. 각각의 동전이 나타내는 가치는 다르다. 
//	이 동전을 적당히 사용해서, 그 가치의 합이 k원이 되도록 하고 싶다. 
//	그 경우의 수를 구하시오. 각각의 동전은 몇 개라도 사용할 수 있다.
//	사용한 동전의 구성이 같은데, 순서만 다른 것은 같은 경우이다.
//	입력
//	첫째 줄에 n, k가 주어진다. (1 ≤ n ≤ 100, 1 ≤ k ≤ 10,000) 다음 n개의 줄에는 각각의 동전의 가치가 주어진다. 
//	동전의 가치는 100,000보다 작거나 같은 자연수이다.
//	출력
//	첫째 줄에 경우의 수를 출력한다. 경우의 수는 231보다 작다.
//	예제 입력 1 
//3 10
//1
//2
//5
//	예제 출력 1 
//	10
//	dp[n] = dp[n] + dp[n-coin[i]]
	static int[] coin;
	static int[] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int money = Integer.parseInt(st.nextToken());
		System.out.println(n);
		System.out.println(money);
		coin = new int[n];
		for(int i = 0; i < n; i++) {
			coin[i] = Integer.parseInt(bf.readLine());
		}
		System.out.println(Arrays.toString(coin));
		dp = new int[money+1];
		dp[0] = 1;
		for(int i = 0; i< coin.length; i++) {
			for(int j = 1; j <= money; j++) {
				if(j >= coin[i]) {
					dp[j] = dp[j] + dp[j-coin[i]];
				}
				System.out.println(Arrays.toString(dp));
			}
			System.out.println("");
			System.out.println(Arrays.toString(dp));
		}
		System.out.println(dp[money]);
	}
}
