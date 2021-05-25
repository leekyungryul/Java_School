package 연습2;

import java.util.Random;
import java.util.Scanner;

public class CC {
	String name;
	Student[] student;
	int rank;
	CC(){
		
	}
	CC(String name, Student[] student){
		this.name = name;
		this.student = student;
	}
	int classtotal;
	int classmid;
	int classfin;
	double avg;
	public void init() {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < student.length; i++) {
			student[i].mid = r.nextInt(101);
			student[i].fin = r.nextInt(101);
			student[i].calc();
		}
	}
	public void sort() {
		for(int i = 0; i < student.length-1; i++) {
			for(int j = i; j < student.length; j++) {
				if(student[i].total < student[j].total) {
					Student temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}
			}
		}
	}
	public void rankset() {
		for(int i = 0; i < student.length; i++) {
			if(i > 1 && student[i].total == student[i-1].total) {
				student[i].rank = student[i-1].rank;
			}
			else {
				student[i].rank = i+1;
			}
		}
	}
	public void print() {
		for(int i = 0; i < student.length; i++) {
			System.out.println(student[i].name + "님의 총점은 " + student[i].total + "점이고 석차는 " + student[i].rank +"등 입니다.");
			System.out.println("");
		}
	}
}
