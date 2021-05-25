package Rabbit;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class input_ex_pf {
	static int N;
	static int AnswerN;

	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("src/input.txt"));		
		/*
		 * 표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T; 

		T = Integer.parseInt( br.readLine() );

		 StringTokenizer tokens = new StringTokenizer(br.readLine());
		 int[] E = new int[tokens.countTokens()];;
		 for( int i = 0; tokens.hasMoreElements(); i++ ){
			 E[i] = Integer.parseInt(tokens.nextToken());
		  }
		 System.out.println(Arrays.toString(E));
		 // [3, 10, 10, 1, 5, 6, 8, 2, 17]

		
	}
}

