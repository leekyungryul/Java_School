package Change;

import java.util.Scanner;

public class Quize1 {

	public static void main(String[] args) {
//		거스름돈의 종류가 배열에 담겨져있다.
//		사용자에게서 돈을 받는다.
//		상품의 가격을 받는다.
//		거스름돈이 있는 배열의 길이만큼 반복문을 수행하면서 만약 주어야할 돈이(거스름돈) 배열에 있는 거스름돈의 보다 크다면
//		배열에 있는 거스름돈으로 나누고 몫은 누적시킨다.
//		나머지는 다시 주어야할 돈(거스름돈)으로 입력시킨다.
	Scanner s = new Scanner(System.in);
	int[] changes = {500, 100, 50, 10, 5, 1};
	int money = 1000;
	System.out.println("상품의 가격을입력하세요");
	int product = s.nextInt();
	int change = money - product;
	int sum = 0;
	for (int i = 0; i < changes.length; i++) {
		if (change < changes[i]) {
			continue;
		}
//			돌려줄 돈을 배열내 거스름돈으로 나누어준 몫
		int a = change / changes[i];
		sum = sum + a;
//			돌려줄 돈을 배열내 거스름돈으로 나누어준 나머지
		int b = change % changes[i];
		change = b;
	}
	System.out.println(sum);
}
	}


