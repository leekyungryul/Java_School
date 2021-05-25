package Recursive1;

import java.util.Scanner;

public class Recursive1 {
	public static int Recur(int n1, int n2) {
		if(n1 == n2) return n2;
		return n1 + Recur(n1+1,n2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("시작값을 입력하세요");
		String Userinput1 = scanner.nextLine();
		int Num1 = Integer.parseInt(Userinput1);
		
		System.out.println("종료값을 입력하세요");
		String Userinput2 = scanner.nextLine();
		int Num2 = Integer.parseInt(Userinput2);
		
		System.out.println(Recur(Num1, Num2));
	}

}
