package Recur;

import java.util.Scanner;

public class Recursive {
/* 사용자가 시작값(100)과 최대값(200)을 직접 입력하여 
	100부터 200까지의 합을 구해보았습니다.*/ 
public static void main(String[] args) {	
		// 사용자 입력 시작
		Scanner scanner = new Scanner(System.in);
		// 사용자가 시작값을 입력
		System.out.println("시작값을 입력하세요");
		String UserinputInit = scanner.nextLine();
		// 사용자가 최대범위 입력
		System.out.println("최대범위를 입력하세요");
		String UserMaxLimit = scanner.nextLine();
		// 사용자 입력 끝
		
        // 사용자가 입력한 시작범위 값을 정수로 변환하여 number1에 지정
		int number1 = Integer.parseInt(UserinputInit);
        // 사용자가 입력한 최대범위 값을 정수로 변환하여 number2에 지정
		int number2 = Integer.parseInt(UserMaxLimit);
		
		// 결과값 출력
		System.out.println(number1 + "부터 " + number2 + 
							"까지 더한 결과값은 다음과 같습니다.");
		System.out.println(myRecursive(number1, number2));
	}	
	/* myRecursive 재귀함수 생성(파라미터를 하나 더 넣어서 
	 * 탈출조건에 쓰일 최대값을 위에서 사용자가 입력한 값이 되도록 하였습니다.)*/
	public static int myRecursive(int n, int MaxLimit) {
		// n값이 MaxLimit와 동일해 진다면
		if(n == MaxLimit) {
			// MaxLimit값을 반환합니다.
			return MaxLimit;
		}
		/* myRecursive 재귀함수결과에 n값을 더하여 반환하므로 
		 * 탈출조건에 부합시까지 계속 반복 됩니다.*/
		return n + myRecursive(n+1, MaxLimit);
	}
	
}
