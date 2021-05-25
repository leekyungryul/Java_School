package Quize_pro2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Customer> visitor = new ArrayList<Customer>();
		ArrayList<Score> score = new ArrayList<Score>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 99999; i++) {
			System.out.println("원하시는 메뉴를 선택해주세요");
			System.out.println("1: 방문자 입력");
			System.out.println("2: 전체 방문자 출력");
			System.out.println("3: 별점 입력");
			System.out.println("4: 전체 별점 출력");
			System.out.println("quit: 종료");
			
			String userInput = scanner.nextLine();
			if (userInput.equals("1")) {
				// 방문자 입력 구현
				// case: 1
				System.out.println("이름을 입력해주세요");
				String name = scanner.nextLine();
				System.out.println("연락처를 입력해주세요");
				String phone = scanner.nextLine();
				visitor.add(new Customer(name, phone));
				
//				// case: 2
//				visitor.add(new Customer());
			} else if (userInput.equals("2")) {
				// 전체 출력 구현
				for (int j = 0; j < visitor.size(); j++) {
					System.out.println(visitor.get(j).name + ", 연락처 : " + visitor.get(j).phone);
				}
			} else if (userInput.equals("3")) {
				System.out.println("별점 입력할 연락처를 입력해주세요.");
				String phoneNumber = scanner.nextLine();
				String userName = "";
				String userPhone = "";
				for (int j = 0; j < visitor.size(); j++) {
//					리스트내 고객의 저장된 전화번호와 지금 입력한 전화번호가 같으면
					if (visitor.get(j).phone.equals(phoneNumber)) {
//						userName변수에는 리스트내 고객의 이름을 
						userName = visitor.get(j).name;
//						userPhone변수에는 리스트내 고객의 전화번호를
						userPhone = visitor.get(j).phone;
					}
				}
//				위의 반복문에서 저장된 정보를 가지고 userName에 저장된 값이 없다면
				if (userName.equals("")) {
//					아래 출력
					System.out.println("입력한 번호의 고객이 없습니다.");
//				그 외에는	
				} else {
//					아래 출력
					System.out.println("별점을 입력해주세요 (1~5)");
//					별점을 입력받아서 scoreString변수에 담고 
					String scoreString = scanner.nextLine();
					try {
//						다시 정수로 변환해서 scoreNumber에 담는다.
						int scoreNumber = Integer.parseInt(scoreString);
//						score리스트에 userName,userPhon,scoreNumber을 담는다.
						score.add(new Score(userName, userPhone, scoreNumber));
					} catch (Exception e) {
					}
				}
//				4를 입력한다면
			} else if (userInput.equals("4")) {
				int totalScore = 0;
				for (int j = 0; j < score.size(); j++) {
					System.out.println(score.get(j).phone + "의 별점 : " + score.get(j).score);
					totalScore = totalScore + score.get(j).score;
				}
				System.out.println("별점 총합 : " + totalScore + ", 평균 별점 : " + ((double)totalScore / score.size()));
			} else if (userInput.equals("quit")) {
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}