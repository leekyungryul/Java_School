package 고객관리;

import java.util.Scanner;

public class Client {
	String name;
	String number;
	Scanner s = new Scanner(System.in);
	Client(){
		System.out.println("방문자 이름을 입력하세요");
		this.name = s.nextLine();
		System.out.println("방문자 전화번호를 입력하세요");
		this.number = s.nextLine();
	}
	Client(String name, String number){
		this.name = name;
		this.number = number;
	}
}
