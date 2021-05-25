package Quize1;

import java.util.Scanner;

public class CC {
	String name;
//	int number;
	Client[] client;
	
	CC(){
		
	}
	CC(String name, Client[] client){
		this.name = name;
		this.client = client;
	}
	public void inputName() {
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < client.length; i++) {
			System.out.println("고객의 이름을 입력하세요");
			client[i].name = s.nextLine();
		}
	}
	public void inputNum() {
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < client.length; i++) {
			System.out.println("고객의 전화번호를 입력하세요");
			client[i].number = s.nextInt();
		}
	}

	public void print() {
		for(int i = 0; i < client.length; i++) {
			System.out.println(client[i].name + "님의 전화번호는 " + client[i].number + "번 입니다.");
		}
	}
}
