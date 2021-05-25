import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Test1111 {
	static int answer;
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		char[] E = s.nextLine().toCharArray();
		Stack<String> st = new Stack<String>(); 
		int n = s.nextInt();
		try {
			for(int i = 0; i < E.length; i++) {
				if(E[i] == '(') {
					st.push(String.valueOf(E[i]));
				}
				st.pop();
				if((i+1)== n && st.size() == 0) {
					answer = i+1;
				}
			}
			System.out.println(st);
		}catch(EmptyStackException e) {
			answer = 0;
		}finally {
			if (st.size() > 0)	
				answer = 0;
		}
		System.out.println(answer);
//		int sum = 0;//(
//		int check = 0;
//		for(int i = 1; i < E.length; i++) {
//			if(E[i] == '(') {
//				sum++;
//				if(i == n) {
//					sum++;
//				}
//			}
//			else {
//				sum2++;
//			}
//		}
//		System.out.println(sum1);
//		System.out.println(sum2);
//		System.out.println(check);
	}
		

}
