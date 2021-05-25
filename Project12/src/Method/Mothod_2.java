package Method;

import java.util.Random;
import java.util.Scanner;

public class Mothod_2 {
	public static int testMethod(int first,int second, int third) {
		
		int result = first + second+ third;
		System.out.println(""+ result + "=" + first +"+"+ second+"+"+third);
		return result;
	}
	public static void testMethod2(int first, int second) {
		
		int result = first * second;
		System.out.println(""+ result + "=" + first +"*"+ second);
	}
	public static void main(String[] args) {
		Random r1 = new Random();
		int number1 = r1.nextInt(100);
		int number2 = r1.nextInt(100);
		
		int result = testMethod(number1,number2, 30);
		System.out.println(result);
		testMethod2(number1,number2);
		
	}

}