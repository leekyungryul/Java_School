package Quize1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Client[] client1 = new Client[3];
		client1[0] = new Client();
		client1[1] = new Client();
		client1[2] = new Client();
		System.out.println("고객님의 정보를 입력하세요");
		System.out.println("");
		for(int i = 0; i < client1.length; i++) {
			client1[i].nameInput();
//			client1[i].numInput();
//			client1[i].print();
		}
//		System.out.println("고객님의 전화번호를 입력하세요");
//		System.out.println("");
//		String userinput = s.nextLine();
//		int num2 = Integer.parseInt(userinput);
//		for(int i = 0; i < client1.length; i++) {
//			if(num2.equals(client1[i].number)) {
//				client1[i].numInput();
//			}
//		}
		
		System.out.println("고객님의 별점정보를 입력을 하세요");
		System.out.println("");
		for(int i = 0; i < client1.length; i++) {
			System.out.println(client1[i].name + "님의 별점");
			client1[i].likeInput();
			}

		System.out.println("고객정보 출력을 원하시면 1번을 누르세요");
		String userinput2 = s.nextLine();
		int num1 = Integer.parseInt(userinput2);
		if(num1 == 1) {
			for(int i = 0; i < client1.length; i++) {
				client1[i].print();
			}
		}
		

	}

}
