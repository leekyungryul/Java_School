package Method;

import java.util.Random;
import java.util.Scanner;

public class without_static {
	public static void testMethod(int first,int second) {
		
		int result = first + second;
		System.out.println(""+ result + "=" + first +"+"+ second);
	}
	public static void testMethod2(int first, int second) {
		
		int result = first + second;
		System.out.println(""+ result + "=" + first +"+"+ second);
	}
	public static void main(String[] args) {
		Random r1 = new Random();
		int number1 = r1.nextInt(100);
		int number2 = r1.nextInt(100);
		testMethod2(number1,number2);
		
	}

}
