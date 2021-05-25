package 연습;

import java.util.Scanner;

public class Recursive2 {
	public static int Multi(int num1, int num2) {
		if (num1 == num2) return num2;
		return num1 * Multi(num1+1, num2 );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("첫번째 숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = scanner.nextInt();
		System.out.println(Multi(num1,num2));

	}

}
