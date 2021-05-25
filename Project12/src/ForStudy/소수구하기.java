package ForStudy;

import java.util.Scanner;

public class 소수구하기 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력해주세요.");
		
		Scanner s1 = new Scanner(System.in);
		int number = s1.nextInt();
		
		System.out.println("입력받은 숫자는" + number +"입니다.");
		
		boolean isPrime = true;
		for(int i = 0; i < number; i++) {
			if (i<2) {
				continue;
				//0,1은 패스한다.
			}
			if (number % i == 0) {
				//들어오면 소수가 안된다.
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("소수입니다.");
		}
	}

}
