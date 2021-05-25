import java.util.Random;

public class if실습_가위바위보대결 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		int person = r1.nextInt(3) + 1;
		int com = r1.nextInt(3) + 1;
		
		if (person == 1) {
			System.out.println("나는 가위");
		} else if (person == 2 ) {
			System.out.println("나는 바위");
		} else if (person == 3) {
			System.out.println("나는 보");
		} 
		
        if (com == 1) {
			System.out.println("너는 가위");
		} else if (com == 2 ) {
			System.out.println("너는 바위");
		} else if (com == 3) {
			System.out.println("너는 보");
		}
	     
		if (person == com) {
			System.out.println("비겼다");
		} else if ((person == 3 && com ==1)||(person == 2 && com == 1)||(person ==3 && com == 2)) {
			System.out.println("내가 이겼다");
		} else if ((person == 1 && com ==3)||(person == 1 && com == 2)||(person ==2 && com == 3)) {
			System.out.println("내가 졌다");
		}
	}

}
