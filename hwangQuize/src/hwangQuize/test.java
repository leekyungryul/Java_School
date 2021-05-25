package hwangQuize;

import java.io.FileInputStream;
import java.util.Scanner;


class Solution {
	static int N;
	static int AnswerN;

	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("src/input.txt"));

		/*
		 * 표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);

		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			/*
			 * 각 테스트 케이스를 표준 입력에서 읽어옵니다.
			 */

			N = sc.nextInt();

			char[] E = sc.nextLine().toCharArray();
//			
//			for(int i = 3; i<5; i++) {
//				System.out.println(i);
//				for(int j = 2; j <5; j++ ) {
//					System.out.println(j);
//				}
//			}

			// ///////////////////////////////////////////////////////////////////////////////////////////
			/*
			 * 이 부분에 여러분의 알고리즘 구현이 들어갑니다. 여러분의 정답은 AnswerN에 저장되는 것을 가정하였습니다.
			 */
			// ///////////////////////////////////////////////////////////////////////////////////////////


			System.out.println("#" + test_case + " " + AnswerN);
		}
	}
}

/* 
2
3 10 10 1 5 6 8 2 17
4 3 3 2 1 4 2 5 3 4 5
*/