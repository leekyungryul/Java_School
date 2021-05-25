import java.util.Random;
import java.util.Scanner;

public class study_0312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력해 주세요 ==> ");

		Scanner s1 = new Scanner(System.in);
		int userNumber = s1.nextInt();
		
		Random r1 = new Random();
		int randNumber = r1.nextInt(100) + 1;
		
		System.out.println("사용자가 입력한 숫자: "+userNumber + ", 랜덤 생성된 숫자: "+ randNumber);
		
		int resultNum = userNumber + randNumber;
		System.out.println(userNumber + "+" + randNumber + "=" + resultNum);
		
		resultNum = userNumber - randNumber;
		System.out.println(userNumber + "-" + randNumber + "=" + resultNum);
		
		resultNum = userNumber * randNumber;
		System.out.println(userNumber + "*" + randNumber + "=" + resultNum);
		
		double resultNum2 = userNumber / (double) randNumber;
//		double resultNum2 = 0.5323223;
		System.out.println(resultNum2);
		resultNum2 = Math.round(resultNum2 * 100) / (double)100;
		
		System.out.println(""+userNumber + "/" + randNumber + "=" + resultNum2);
		
		resultNum = userNumber % randNumber;
		System.out.println(userNumber + "%" + randNumber + "=" + resultNum);
	}
	

}
