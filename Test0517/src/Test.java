import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;
import java.io.FileInputStream;


class Test {
	static int AnswerN;

	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("src/sample_input..txt"));	
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();	
		for (int test_case = 1; test_case <= T; test_case++) {	
			int N = sc.nextInt();	

			char[] E = sc.nextLine().toCharArray();	

			Stack<String> s = new Stack<String>();

			int size = 100;	
			try {
				for (int i = 1; i < E.length; i++) {	
					if (E[i] == '(') {
						s.push(String.valueOf(E[i]));	
						if (i == N)	
							size = s.size();
						
					} else {
						if (s.size() == size) {	
							AnswerN = i;
							size = 100;	
						}
						s.pop();	
					}
				}
			} catch (EmptyStackException e) {	
				AnswerN = 0;
			} finally {
				if (s.size() > 0)	
					AnswerN = 0;
			}
			System.out.println("#" + test_case + " " + AnswerN);
		}
	}
}

