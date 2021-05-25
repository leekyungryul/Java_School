package 연습3;

import java.util.Random;
import java.util.Scanner;

public class Student {
	String name;
	int total;
	int mid;
	int fin;
	int rank;
	Student(){
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("이름");
		this.name = s.nextLine();
		System.out.println("중간고사");
		this.mid = r.nextInt(101);
		System.out.println("기말고사");
		this.fin = r.nextInt(101);
		this.total = this.mid + this.fin;

		
	}
	Student(String name, int mid, int fin){
		this.name = name;
		this.mid = mid;
		this.fin = fin;
		this.total = this.mid + this.fin;
	}
	
}
