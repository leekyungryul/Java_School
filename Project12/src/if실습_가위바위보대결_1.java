import java.util.Random;
import java.util.Scanner;

public class if실습_가위바위보대결_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("가위바위보 중 하나를 입력해 주세요");
		System.out.println("");
		
		Scanner s1 = new Scanner(System.in);
		int userNum = s1.nextInt();
		
		
		if (userNum == 1) {
			System.out.println("사용자는 가위를 냈습니다.");
		} else if(userNum == 2) {
			System.out.println("사용자는 바위를 냈습니다.");
		} else if(userNum == 3) {
			System.out.println("사용자는 보를 냈습니다.");
		}

		Random r1 = new Random();
		int comNum = r1.nextInt(3)+1;
		
		if (comNum == 1) {
			System.out.println("컴퓨터는 가위를 냈습니다.");
		} else if(comNum == 2) {
			System.out.println("컴퓨터는 바위를 냈습니다.");
		} else if(comNum == 3) {
			System.out.println("컴퓨터는 보를 냈습니다.");
		}
		
		if (userNum == comNum) {
			System.out.println("비겼습니다.");
		} else {
			int nextUserNum = userNum + 1;
			if (nextUserNum > 3) {
				nextUserNum = 1;
			}
			if (nextUserNum == comNum) {
				System.out.println("컴퓨터 승리");
			} else {
				System.out.println("사용자 승리");
			}
			
		}
		
	}

}
