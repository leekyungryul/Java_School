package 연습;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Client>visitor = new ArrayList<Client>();
		ArrayList<Score>score = new ArrayList<Score>();
		for(int j = 0; j < 9999; j ++) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 방문자 입력");
			System.out.println("2. 방문자 출력");
			System.out.println("3. 별점정보 입력");
			System.out.println("4. 별점정보 출력");
			System.out.println("5. quite");
			Scanner s = new Scanner(System.in);
			String userinput = s.nextLine();
			if(userinput.equals("1")) {
				visitor.add(new Client());
			} else if(userinput.equals("2")) {
				for(int i = 0; i < visitor.size(); i++) {
					System.out.println(visitor.get(i).name + " / " + visitor.get(i).number);
				}
			} else if (userinput.equals("3")) {
				System.out.println("입력을 원하시는 전화번호를 입력하세요");
				String name1 = "";
				String number1 = "";
				String phone= s.nextLine();
				for(int i = 0; i < visitor.size(); i++) {
					if(phone.equals(visitor.get(i).number)) {
						name1 = visitor.get(i).name;
						number1 = visitor.get(i).number;
					} 
				}
				if(name1.equals("")) {
					System.out.println("해당하는 전화번호가 없습니다.");
				} else {
					System.out.println("별점정보를 입력하세요");
					int like = s.nextInt();
					score.add(new Score(name1,number1,like));
				}
				
			} else if(userinput.equals("4")) {
				for(int i = 0; i < score.size(); i++) {
					System.out.println(score.get(i).number + " / " + score.get(i).like);
				}
			} else if(userinput.equals("5")) {
				break;
			}
		}
	}

}
