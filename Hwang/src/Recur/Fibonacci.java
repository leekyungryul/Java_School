package Recur;

import java.util.Scanner;

public class Fibonacci {
// 출력을 원하는 수의 항번호(10)를 입력할수 있도록 만들어 봤습니다. 
	public static void main(String[] args) {
		// 사용자 입력시작
		Scanner scanner = new Scanner(System.in);
		System.out.println("원하시는 수열의 항번호를 입력하세요");
		String Userinput = scanner.nextLine();
		// 사용자 입력 끝
		
		// 사용자 입력값을 fibo함수의 파라미터로 사용하기 위하여 정수로 변환하였습니다.
		int num = Integer.parseInt(Userinput);
		
		// 결과값 출력
		System.out.println("입력하신 " + num + "번째항의 숫자는 " + Fibo(num) + "입니다.");
	}
	// 피보나치 수열의 원하는 항번호 출력을 위한 재귀함수 생성
	public static int Fibo(int n) {
		/* 피보나치 수열의 0번과 1번 인덱스의 값이 0과 1이므로
		파라미터값이 0이 될때와 1이될때는 0과 1반환 후 종료*/
		if(n==0) return 0;
		else if(n==1) return 1;
		
		return Fibo(n-1) + Fibo(n-2);
		/*ex) fibo(4)일경우
 * fibo(4) =>3          fibo(3)=>2           +            fibo(2)=>1
 * 
 *            fibo(2)=>1    +    fibo(1)=>1         fibo(1)=>1  +   fibo(0)
 *           
 *     fibo(1) + fibo(0)   
 *     */
		}
	}

