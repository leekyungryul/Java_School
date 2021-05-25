package Method;

import java.util.Arrays;
import java.util.Random;

public class 성적구해서배열에넣어서메소드 {
	public static void insertNumber(int[] s) {
		Random r1 = new Random();
		for(int i = 0; i < s.length; i++) {
			s[i] = r1.nextInt(101);
		}
	}
	public static int calcScore(int[] s) {
		int total = 0;
				for(int i = 0; i < s.length; i++) {
					total = total +  s[i];
				}
				System.out.println("총합: " + total);
				return total;
				//return을 사용하기 위해서는 void를 int로 변경해주어야 한다.
	}
	public static void main(String[] args) {
		int[] score = new int[10];
		insertNumber(score);
		System.out.println(Arrays.toString(score));
		
		int total = calcScore(score);
	}

}
