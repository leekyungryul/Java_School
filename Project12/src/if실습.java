import java.util.Random;

public class if실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		int randNum = r1.nextInt(5) + 1;
		
		System.out.println("랜덤하게 생성된 숫자는 " + randNum);
		
		if (randNum == 1 ) {
			System.out.println("★☆☆☆☆");
		} else if (randNum == 2) {
			System.out.println("★★☆☆☆");
		} else if (randNum == 3) {
			System.out.println("★★★☆☆");
		} else if (randNum == 4) {
			System.out.println("★★★★☆");
		} else if (randNum == 5) {
			System.out.println("★★★★★");
		}
		
		switch(randNum) {
		case 1:
			System.out.println("★☆☆☆☆");
			break;
		case 2:
			System.out.println("★★☆☆☆");
			break;
		case 3:
			System.out.println("★★★☆☆");
			break;
		case 4:
			System.out.println("★★★★☆");
			break;
		case 5:
			System.out.println("★★★★★");
			break;
			
		}

	}

}
