package Middle1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Person[] person = {new Person(),new Person(),new Person()};
		ArrayList<Person> person = new ArrayList<Person>();
//		for(int i = 0; i < 5; i++) {
//			Person person = new Person();
//		}
		for(int j = 0; j < 9999; j++) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 유권자 정보입력");
			System.out.println("2. 유권자 정보 전체출력");
			Scanner s = new Scanner(System.in);
			String userinput = s.nextLine();
			if(userinput.equals("1")) {
				person.add(new Person());
			}else if(userinput.equals("2")) {
				for(int i = 0; i < person.size(); i++) {
					System.out.println(person.get(i).name + "의 나이는 " + person.get(i).age + "살 이고 주소는 " + person.get(i).address + "입니다.");
				}
			}
		}
		
	}

}
