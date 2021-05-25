package ForStudy;

import java.util.Random;
import java.util.Scanner;

public class 구구단연습 {

	public static void main(String[] args) {
		for(int i = 0; i < 9; i++) {
			int num1 = i + 1;
			System.out.println("\n"+num1+"단입니다.");
			for(int j = 0; j < 9; j++) {
				int num2 = j + 1;
				int result = num1 * num2;
				System.out.println(result);
			} 
		} 
	} 

}
