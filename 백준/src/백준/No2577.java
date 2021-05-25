package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class No2577 {
//	문제
//	세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 
//	몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
//	예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
//	계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
//	입력
//	첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.
//	출력
//	첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 
//	A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
//	예제 입력 1 
//	150
//	266
//	427
//	예제 출력 1 
//	3
//	1
//	0
//	2
//	0
//	0
//	0
//	2
//	0
//	0
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		정수로 a,b,c의 값을 입력받는다.
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
//		a*b*c의 값을 문자형으로 변환한다.
		String result = String.valueOf(a*b*c);
//		총 10자리의 배열을 만들어서 각 숫자자리마다 반복문을 돌면서 카운트해준다.
		int[] num = new int[10];
//		연산의 결과 값의 길이만큼 반복하면서 위의 배열에 각 위치에 카운트해준다.
		for(int i = 0; i < result.length(); i++) {
//			문자열의 각 자리를 정수로 변환해서 배열의 자리에 카운트 한다.
			num[result.charAt(i) - '0']++; 
		}
//		System.out.println(Arrays.toString(num));
//		최종적으로 num배열의 각 숫자자리에 카운트된 숫자를 출력해준다.
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
//A[idx] = strA.charAt(i) - '0';