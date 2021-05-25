package Rabbit;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

class input_ex  {
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
		sc.nextLine();
		
		 String[] E = sc.nextLine().split(" ");
         System.out.println(Arrays.toString(E));
//		 [3, 10, 10, 1, 5, 6, 8, 2, 17]
		
//		 char[] c = sc.nextLine().toCharArray();
//		 System.out.println(Arrays.toString(c));
//		  [3,  , 1, 0,  , 1, 0,  , 1,  , 5,  , 6,  , 8,  , 2,  , 1, 7]
		
//		 StringTokenizer tokens = new StringTokenizer(sc.nextLine().trim());
//	     while (tokens.hasMoreTokens()) {
//	        System.out.print(tokens.nextToken()+" ");
//	        // 3 10 10 1 5 6 8 2 17 
//	     }
		
		
	}
}


