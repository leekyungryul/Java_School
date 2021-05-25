
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;
import java.io.FileInputStream;


class Bracket {
	static int N;
	static int AnswerN;

	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("src/sample_input..txt"));	// txt 파일을 읽어온다.

		Scanner sc = new Scanner(System.in);

		int T;
		T = sc.nextInt();	

		for (int test_case = 1; test_case <= T; test_case++) {	// 위에서 읽어온 T값만큼 테스트를 반복.

			N = sc.nextInt();	// 각 문제의 숫자 조건을 저장.

			char[] E = sc.nextLine().toCharArray();	// char을 배열로 저장한다.

			System.out.println("E len ="+E.length);	// ()()) 얘들의 길이를 출력.
			Stack<String> s = new Stack<String>();

			int size = Integer.MAX_VALUE;	// N번째 '('괄호가 나오면 그 때 스택 '('를 추가로 넣기 전에 스택에 이미 들어있는 '('의 개수를 값으로 받는다. 시작할 때 미리 큰 값을 넣어둠. 여기는 그냥 -1을 넣어도 될 듯.

			try {
				for (int i = 1; i < E.length; i++) {	// 각 문제를 푼다. ()()(() 의 길이만큼 반복...
					if (E[i] == '(') {
						if (i == N)	
							size = s.size();
						s.push(String.valueOf(E[i]));	// '('가 나오면 스택에 '('를 넣는다.
					} else {
						s.pop();	// ')'가 나오면 스택에 넣은 '('를 제거한다.
						if (s.size() == size) {	// 위에서 'N'번째 '('가 나왔을 때의 스택에 있는 
							AnswerN = i;
							size = Integer.MAX_VALUE;	// AnswerN의 값이 바뀌지 않도록 충분히 큰 값을 넣어준다.
						}
					}

				}
				
			} catch (EmptyStackException e) {	// 스택이 비어있는데 ')'가 나오면 에러가 난다. 즉, ')'로 시작하거나 괄호 짝이 안 맞을 때.
				AnswerN = 0;
				
			} finally {
				if (s.size() > 0)	// 스택에 '('가 남아도 안 된다. 괄호 짝이 안 맞을 때.
					AnswerN = 0;
			}

			// 표준출력(화면)으로 답안을 출력합니다.
			System.out.println("#" + test_case + " " + AnswerN);
		}
	}
}