package Recur;

import java.util.Scanner;

public class Recursive2 {
	/* 사용자가 최초값(5)과 최종값(1)을 직접 입력하여 
	5부터 1까지의 곱한 결과값을 구해보았습니다.*/ 	
	public static void main(String[] args) {
		// 사용자 입력 시작
		Scanner scanner = new Scanner(System.in);
		System.out.println("시작숫자를 입력하세요");
		String UserinputInit1 = scanner.nextLine();
		System.out.println("종료숫자를 입력하세요");
		String UserinputInit2 = scanner.nextLine();
		// 사용자 입력 종료
		
		// 첫번째 사용자 입력값을 정수로 변환
		int number1 = Integer.parseInt(UserinputInit1);
		// 두번째 사용자 입력값을 정수로 변환
		int number2 = Integer.parseInt(UserinputInit2);

		// myRecursive 재귀함수 출력
		System.out.println(myRecursive(number1,number2));
}
	// 2개의 파라미터값을 받는 재귀함수를 생성합니다.
	public static int myRecursive(int n, int Endnum) {
		// 시작숫자가 종료숫자가 된다면 종료숫자를 반환하고 종료합니다.
		if(n == Endnum) return Endnum;
		/* myRecursive 재귀함수결과에 n값을 곱하여 반환하므로 
		 * 탈출조건에 부합시까지 계속 반복 됩니다.*/
		return n * myRecursive(n-1, Endnum);
}
}
