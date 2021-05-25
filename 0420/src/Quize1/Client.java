package Quize1;

import java.util.Scanner;

public class Client {
	String name;
	int number;
	int like;
	Client(){
		
	}
	Client(String name){
		this.name = name;
	}
	Client(String name, int number){
		this.name = name;
		this.number = number;
	}
	public void numInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("고객의 전화번호를 입력하세요");
		int userinput = s.nextInt();
		this.number = userinput;
	}
	public void nameInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("고객의 이름을 입력하세요");
		String userinput = s.nextLine();
		this.name = userinput;
	}
	public void likeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("고객의 별점을 입력하세요");
		int userinput = s.nextInt();
		this.like = userinput;
	}
	public void print() {
		System.out.println(this.name + "님의 전화번호는 " + this.number + "입니다.");
	}
}
