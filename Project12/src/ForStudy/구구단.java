package ForStudy;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int num1 = s1.nextInt();
		for (int i = 0; i<9; i++) {
			int num2 = i+1;
			int result = num1*num2;
			System.out.println(result);
		}
	}

}
