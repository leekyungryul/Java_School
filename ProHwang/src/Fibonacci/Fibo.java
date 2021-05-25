package Fibonacci;

import java.util.Scanner;

public class Fibo {
	// 원하는 피보나치수열의 항번호의 숫자를 출력하기
	public static int Fibo(int n) {
		if(n == 0) return 0;
		else if (n==1) return 1;
		return Fibo(n-2) + Fibo(n-1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원하는 항번호를 입력하세요");
		String Userinput = scanner.nextLine();
		int Num = Integer.parseInt(Userinput);
		System.out.println(Fibo(Num));
	}

}
