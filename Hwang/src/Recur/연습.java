package Recur;

import java.util.Scanner;

public class 연습 {
	public static int fibo(int a) {
		if(a==0) return 0;
		if(a==1) return 1;
		return fibo(a-2) + fibo(a-1);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력");
		int a = scanner.nextInt();
		System.out.println(fibo(a));
	}

}
