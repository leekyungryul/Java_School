import java.util.Random;

public class 학점출력_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		int score = r1.nextInt(100);
		System.out.println("your score is " + score);
		
		if (score >= 90) {
			System.out.println("your grade A");
		} else if (score >= 80) {
			System.out.println("your grade B");
		} else if (score >= 70) {
			System.out.println("your grade C");
		} else if (score >= 60) {
			System.out.println("your grade D");
		} else if (score >= 50) {
			System.out.println("your grade E");
		} else {
			System.out.println("fail");
		}
		


	}

}
