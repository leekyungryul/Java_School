import java.util.Random;
import java.util.Scanner;

public class 가위바위보_연습 {

	public static void main(String[] args) {
		System.out.println("가위,바위,보 중 하나를 내어주세요");
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		Scanner s1 = new Scanner(System.in);
		String userinput = s1.nextLine();
		if(userinput.equals("1")) {
			System.out.println("가위를 내셨습니다.");
		} else if(userinput.equals("2")) {
			System.out.println("바위를 내셨습니다.");
		} else if(userinput.equals("3")) {
			System.out.println("보를 내셨습니다.");
		}
		Random r1 = new Random();
		int cominput = r1.nextInt(3)+1;
		if(cominput==1) {
			System.out.println("컴은 가위");
		}else if(cominput==2) {
			System.out.println("컴은 바위");
		}else if(cominput==3) {
			System.out.println("컴은 보");
		}
		int User = Integer.parseInt(userinput);
		if(User == cominput) {
			System.out.println("비겼습니다.");
		} else {
			int Nextuser = User + 1;
			if (Nextuser>3) {
				Nextuser = 1;
			}
			if (Nextuser==cominput) {
				System.out.println("컴 승리");
			}
			else {
				System.out.println("컴 패배");
			}
		}
	}

}
