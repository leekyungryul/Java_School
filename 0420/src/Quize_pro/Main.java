package Quize_pro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Customer> visitor = new ArrayList<Customer>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 99999; i++) {
			System.out.println("원하시는 메뉴를 선택해주세요");
			System.out.println("1: 방문자 입력");
			System.out.println("2: 전체 방문자 출력");
			System.out.println("quit: 종료");
			
			String userInput = scanner.nextLine();
			if (userInput.equals("1")) {
				// 방문자 입력 구현
//				// case: 1
//				System.out.println("이름을 입력해주세요");
//				String name = scanner.nextLine();
//				System.out.println("연락처를 입력해주세요");
//				String phone = scanner.nextLine();
//				visitor.add(new Customer(name, phone));
				
				// case: 2
				visitor.add(new Customer());
			} else if (userInput.equals("2")) {
				// 전체 출력 구현
				for (int j = 0; j < visitor.size(); j++) {
					System.out.println(visitor.get(j).name + ", 연락처 : " + visitor.get(j).phone);
				}
			} else if (userInput.equals("quit")) {
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
