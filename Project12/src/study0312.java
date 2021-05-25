import java.util.Random;

public class study0312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		int randNum = r1.nextInt();
		randNum = randNum % 100; // 랜덤 생성 숫자가 100이하로 정하기 위하여
		
		System.out.println("랜덤하게 생성된 숫자" + randNum);
		
		if (randNum % 2 ==0 && randNum > 0) {
			System.out.println("짝수");
		}
		if (randNum % 2 == 1 && randNum > 0) {
			System.out.println("홀수");
		}
		if (randNum == 0) {
			System.out.println("0");
		}
		if (randNum < 0) {
			System.out.println("음수");
		}

	}

}
