package 연습4;

import java.util.Scanner;

public class CC {
	String name;
	int classTotal;
	int rank;
	Student[] student;
	CC(){
		Scanner s = new Scanner(System.in);
		System.out.println("반 이름을 입력하세요");
		this.name = s.nextLine();
	}
	CC(Student[] student){
		Scanner s = new Scanner(System.in);
		System.out.println("반 이름을 입력하세요");
		this.name = s.nextLine();
		this.student = student;
	}
	CC(String name, Student[] student){
		this.name = name;
		this.student  = student;
	}
	public void init() {
		for(int i = 0; i < student.length; i++) {
			classTotal = student[i].total + classTotal;
		}
	}
	public void print() {
		for(int i = 0; i < student.length; i++) {
			System.out.println(student[i].name + " / " + student[i].total);
		}
	}
}
