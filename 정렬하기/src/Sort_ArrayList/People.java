package Sort_ArrayList;

import java.util.Scanner;

public class People implements Comparable<People>{
	String name;
	int score;
	People(){
		Scanner s = new Scanner(System.in);
		System.out.println("이름");
		this.name = s.nextLine();
		System.out.println("성적");
		this.score = s.nextInt();		
	}
	
	People(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return this.name + "님의 성적은 " + this.score + "점";
	}
	
	public int compareTo(People anotherpeople) {
		return (score<anotherpeople.score)? -1 : ((score==anotherpeople.score)?0:1);
	}
}