package Middle2;

import java.util.ArrayList;
import java.util.Collections;
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
			System.out.println("3. 유권자의 수를 출력");
			System.out.println("4. 유권자의 평균나이를 출력");
			System.out.println("5. 연령대별 유권자의 수");


			Scanner s = new Scanner(System.in);
			String userinput = s.nextLine();
			if(userinput.equals("1")) {
				person.add(new Person());
			}else if(userinput.equals("2")) {
				for(int i = 0; i < person.size(); i++) {
					System.out.println(person.get(i).name + "의 나이는 " + person.get(i).age + "살 이고 주소는 " + person.get(i).address + "입니다.");
				}
			} else if(userinput.equals("3")) {
				System.out.println(person.size());
			} else if(userinput.equals("4")) {
				int avgAge = 0;
				int totalAge = 0;
				for(int i = 0; i < person.size(); i++) {
					avgAge = avgAge + person.get(i).age;
				}
				totalAge = avgAge / person.size();
				System.out.println(totalAge);
			} else if(userinput.equals("5")) {
				for(int i = 0; i < person.size()-1; i++) {
					for(int k = i; k < person.size(); k++) {
						if(person.get(i).age > person.get(k).age) {
							 Collections.swap(person, i, k);
						}
					}
				}
				int child = 0;
				int old = 0;
				int one = 0;
				int ten = 0;
				int two = 0;
				int three = 0;
				int four = 0;
				for(int i = 0; i < person.size(); i++) {
					if(person.get(i).age > 50) {
						old++;						
					}else if(person.get(i).age >= 40) {
						four++;						
					}else if(person.get(i).age >= 30) {
						three++;						
					}else if(person.get(i).age >= 20) {
						two++;						
					}else if(person.get(i).age >= 10) {
						one++;						
					}else {
						child++;						
					}
				}System.out.println("50대 이상은 " + old + "명 " + "40대는 " + four + "명 " +"30대는 " + three + "명 " +"20대는 " + two + "명 " + "10대는 " + one + "명 " + "어린이는 " + child + "명 ");
				
			}
		}
		
	}

}
