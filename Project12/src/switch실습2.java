import java.util.Random;

public class switch실습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		int randNum = r1.nextInt();
		randNum = randNum % 100;
		
		System.out.println("랜덤하게 생성된 숫자는 " + randNum);
		
		if (randNum % 2 == 0 && randNum >0) {
			System.out.println("양수,짝수");
		} else if (randNum % 2 == 1 && randNum > 0 ) {
			System.out.println("양수,홀수");
		} else if (randNum % 2 == 0 && randNum < 0) {
			System.out.println("음수, 짝수");
		} else if (randNum % 2 ==-1 && randNum < 0) {
			System.out.println("음수,홀수");
		}
		
		

	}

}
