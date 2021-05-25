package 클래스연습;

import java.util.Random;

public class Static {
	public static int testmethod(int n1, int n2, int n3) {
		int resultNumber = n1 + n2;
		System.out.println(""+ n1 + "+" + n2 + "="+resultNumber);
		return resultNumber;
	}
	
	public static void testMethod2(int number1, int number2) {
		int resultNumber = number1 - number2;
		System.out.println(""+ number1 + "-"+ number2 + "=" + resultNumber);
	}

	public static void main(String[] args) {
		Random r1 = new Random();
		int number1 = r1.nextInt(100);
		int number2 = r1.nextInt(100);
		
		int result = testmethod(number1, number2, 30);
		testMethod2(number1,number2);

	}

}
