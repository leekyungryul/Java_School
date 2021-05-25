import java.util.Random;

public class 비교문실습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		int score = r1.nextInt(6)+1;
		System.out.println("choose number is "+ score);
		
		if (score ==1) {
			System.out.println("멍멍");
		} else if (score ==2) {
			System.out.println("야옹");
		} else if (score ==3) {
			System.out.println("히히");
		} else if (score ==4) {
			System.out.println("호호");
		} else if (score ==5) {
			System.out.println("메롱");
		} else if (score ==6) {
			System.out.println("야호");
		}

	}

}
