import java.util.Scanner;
import java.util.Stack;

public class Test2 {
	static int answer;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] E = sc.nextLine().toCharArray();
		Stack<String> s  = new Stack<String>();
//		System.out.println(E);
		
//		int answer;
		int size = 100;
		for(int i = 1; i < E.length; i++) {
			if(E[i] == '(') {
				s.push(String.valueOf(E[i]));
				if(i == n) 
					size = s.size();
				
			} else {
				if(s.size() == size) {
					answer = i;
					size = 100;
				}
				s.pop();
			}
			

		}
		System.out.println(answer);
		
	}

}
