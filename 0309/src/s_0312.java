import java.util.Scanner;
import java.util.Random;

public class s_0312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input number");
		
		Scanner s1 = new Scanner(System.in);
		int userNumber = s1.nextInt();
		
		Random r1 = new Random();
		int randNumber = r1.nextInt(100)+1;
		
		System.out.println("사용자가 입력한 숫자: " + userNumber + ", 랜덤 생성된 숫자 : " + randNumber);
		
		int resultNum = userNumber + randNumber;
		System.out.println(userNumber + "+"+ randNumber + "=" + resultNum);
		
		resultNum = userNumber - randNumber;
		System.out.println(userNumber + "-"+ randNumber + "=" + resultNum);
		
		resultNum = userNumber * randNumber;
		System.out.println(userNumber + "*"+ randNumber + "=" + resultNum);
		
		resultNum = userNumber % randNumber;
		System.out.println(userNumber + "%"+ randNumber + "=" + resultNum);
		
		double resultNum2 = (double) userNumber / randNumber;
		resultNum2 = (double) Math.round(resultNum2);
		System.out.println(userNumber + "/" + randNumber + "=" + resultNum2);

	}

}
