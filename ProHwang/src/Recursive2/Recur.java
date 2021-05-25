package Recursive2;

import java.util.Scanner;

public class Recur {
	//원하는 숫자부터 거꾸로 1까지 곱하기
	public static int Recur(int n1, int n2) {
		if(n1 == 1) return 1;
		return n1 * Recur(n1-1, n2);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원하는 시작숫자를 입력하세요");
		String Userinput1 = scanner.nextLine();
		int Num1 = Integer.parseInt(Userinput1);
		System.out.println("원하는 종료숫자를 입력하세요");
		String Userinput2 = scanner.nextLine();
		int Num2 = Integer.parseInt(Userinput2);
		System.out.println(Recur(Num1, Num2));
	}

}
