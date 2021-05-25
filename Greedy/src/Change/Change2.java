package Change;

import java.util.Scanner;

public class Change2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int money = s.nextInt();
		int[] arr = {2,5};
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] <= money) {
				if(money-arr[i] % arr[i+1] == 0) {
					money = (money - arr[i]) / arr[i+1];
					cnt++;
				}else if(money-arr[i] % arr[i+1] != 0){
					cnt++;
					money = (money - arr[i]) - arr[i+1];
					cnt++;
					if(money-arr[i] % arr[i+1] != 0) {
						
					}
				}
				
			}
		}
		System.out.println(cnt);
	}

}
