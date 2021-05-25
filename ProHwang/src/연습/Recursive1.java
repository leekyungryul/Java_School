package 연습;

import java.util.Scanner;

public class Recursive1 {
	public static int Sum(int n1, int n2) {
		if (n2==n1) return n2;
		return n1 + Sum(n1+1, n2);
	}
	public static void main(String[] args) {
		// 1~100까지의 합을 구한다.
		System.out.println("첫번째 값을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		System.out.println("두번째 값을 입력하세요");
		int num2 = scanner.nextInt();
		System.out.println(Sum(num1, num2));

	}

}
