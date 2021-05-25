package Middle3;

import java.util.Scanner;

public class Person {
	String name;
	String address;
	int age;
	Scanner s = new Scanner(System.in);

	Person() {
		System.out.println("유권자의 이름을 입력해주세요");
		this.name = s.nextLine();
		System.out.println("유권자의 주소를 입력해주세요");
		System.out.println("서울, 경기도, 강원도");
		this.address = s.nextLine();
		System.out.println("유권자의 나이를 입력해주세요");
		this.age = s.nextInt();
	}

	Person(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
}
