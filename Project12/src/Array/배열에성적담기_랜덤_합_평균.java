package Array;

import java.util.Arrays;
import java.util.Random;

class cal {
	public void avr(int sum, int[] scores) {
		System.out.println(sum / scores.length);
	}
}
public class 배열에성적담기_랜덤_합_평균 {


	public static void main(String[] args) {
		Random r1 = new Random();
		int sum = 0;
		int [] scores = new int[100];
		//총합을 구할때는 반복문 바깥에 총합변수를 정해주고 한다.
		for(int i = 0; i < scores.length; i++) {
			scores [i] = r1.nextInt(100)+1;
			sum += scores[i];
		} 
		cal c1 = new cal();
		c1.avr(sum,scores);
		System.out.println(Arrays.toString(scores));
		System.out.println("성적의 총합은 " + sum + "입니다.");
		double avr = (double)sum / scores.length;
		avr = (double)Math.round(avr*100)/100;
		System.out.println("성적의 평균은 " + avr + "입니다.");
	}

}
