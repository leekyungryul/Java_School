package Recur;

import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		System.out.println("원하시는 숫자를 입력하세요");
		Scanner s = new Scanner(System.in);
//		String userinput = s.nextLine();
		int n = s.nextInt();
		hanoi(n, "from", "to", "by");
	}
	
	public static void hanoi(int n, String from, String to, String by) {
		int cnt = 0;
		if(n == 1) {
			System.out.println(n + "을 " +from + "에서 " + to + "로 " +"이동하였습니다.");
			cnt++;
			System.out.println(cnt);
			return;
		} 
		
		hanoi(n-1, from, by, to);			
		System.out.println(n + "을 " + from + "에서 " + to + "로 " +"이동하였습니다.");
		cnt++;
		System.out.println(cnt);
		hanoi(n-1, by, to, from);
				
	}
}
