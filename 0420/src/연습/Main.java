package 연습;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> visitor = new ArrayList<Customer>();
		ArrayList<Score> score = new ArrayList<Score>();
//		메뉴를 구성한다.
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 9999; i++) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 고객정보입력");
			System.out.println("2. 전체 고객정보 출력");
			System.out.println("3. 별점정보 입력");
			System.out.println("4. 별점정보 출력");
			System.out.println("5. quite");
//			visitor 리스트에 방문자 객체를 생성한다.
			String userinput = s.nextLine();
			if(userinput.equals("1")) {
				System.out.println("이름을 입력하세요");
				String name = s.nextLine();
				System.out.println("전화번호를 입력하세요");
				String number = s.nextLine();
				visitor.add(new Customer(name,number));
			}else if(userinput.equals("2")) {
				for(int j = 0; j < visitor.size(); j++) {
					System.out.println(visitor.get(j).name + ", 연락처 " + visitor.get(j).phone);
				}
			}else if(userinput.equals("3")) {
				String name = "";
				String number = "";
				System.out.println("별점을 입력하실 전화번호를 입력하세요");
				String num = s.nextLine();
				for(int j = 0; j < visitor.size(); j++) {
					if(num.equals(visitor.get(j).phone)) {
						name = visitor.get(j).name;
						number = visitor.get(j).phone;
					}
				}
				if(number.equals("")) {
					System.out.println("해당하는 전화번호가 없습니다.");
				} else {
					System.out.println("별점을 입력해 주세요");
					String scoreString = s.nextLine();
					try {
						int scoreNumber = Integer.parseInt(scoreString);
						score.add(new Score(name, number, scoreNumber));
					} catch(Exception e) {
						
					}
				}
			}
			else if(userinput.equals("4")) {
				int totalscore = 0;
				for(int j = 0; j < score.size(); j ++) {
					System.out.println(score.get(j).name + ", " + score.get(j).score);
				}
			}
			else if(userinput.endsWith("5")) {
				break;
			}
		}
	}

}
