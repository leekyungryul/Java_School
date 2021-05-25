package 클래스연습;

import java.util.Arrays;
import java.util.Random;

public class Static2 {

	public static void main(String[] args) {
		int[] score = {0,0,0,0,0,0,0};
		
		insertNumber(score);
		int total = calScore(score);
		System.out.println("총합 : " + total);
	}
	public static void insertNumber(int[] s) {
		Random r1 = new Random();
		for (int i = 0; i < s.length; i++) {
			s[i] = r1.nextInt(101);
		}
		System.out.println(Arrays.toString(s));
	}
	public static int calScore(int[] s) {
		int total = 0;
		for(int i = 0; i < s.length; i++) {
			total = total + s[i];
		}
		return total;
	}

}
