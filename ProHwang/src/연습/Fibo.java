package 연습;

import java.util.Scanner;

public class Fibo {
	public static int Fibo(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return Fibo(n-2)+Fibo(n-1);
		}

	public static void main(String[] args) {
		System.out.println("원하시는 열번호를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(Fibo(num));
	}

}
