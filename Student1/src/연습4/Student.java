package 연습4;

import java.util.Random;
import java.util.Scanner;

public class Student {
	String name;
	int mid;
	int fin;
	int rank;
	int total;
	Student(){
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("이름을 입력하세요");
		this.name = s.nextLine();
		this.mid = r.nextInt(101);
		this.fin = r.nextInt(101);
		this.total = this.mid + this.fin;
	}
	Student(String name, int mid, int fin){
		this.name = name;
		this.mid = mid;
		this.fin = fin;
	}
}
