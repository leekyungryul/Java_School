package Change;

import java.util.Arrays;
import java.util.Scanner;

public class Change {
//	춘향이는 편의점 카운터에서 일한다.
//	손님이 2원짜리와 5원짜리로만 거스름돈을 달라고 한다. 2원짜리 동전과 5원짜리 동전은 무한정 많이 가지고 있다. 
//	동전의 개수가 최소가 되도록 거슬러 주어야 한다. 거스름돈이 n인 경우, 최소 동전의 개수가 몇 개인지 알려주는 프로그램을 작성하시오.
//	예를 들어, 거스름돈이 15원이면 5원짜리 3개를, 거스름돈이 14원이면 5원짜리 2개와 2원짜리 2개로 총 4개를, 
//	거스름돈이 13원이면 5원짜리 1개와 2원짜리 4개로 총 5개를 주어야 동전의 개수가 최소가 된다.
//	왼쪽 MoneyDivide와 동일한 방법이다.
//	첫째 줄에 거스름돈 액수 n(1 ≤ n ≤ 100,000)이 주어진다.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = 2;
		int[] coins = {2,5};
		int money = s.nextInt();
		int[] dp = new int[money+1];
		Arrays.fill(dp, 1001);
		dp[0]=0;
		for(int i = 0; i < 2; i++) {
			for(int j = coins[i]; j <= money; j++) {
				if(dp[j-coins[i]]!=1001) {
					dp[j] = Math.min(dp[j], dp[j-coins[i]]+1);
				}
			}
		}
		if(dp[money]==1001) {
			System.out.println("-1");
		}
		else {
			System.out.println(dp[money]);
		}
	}

}