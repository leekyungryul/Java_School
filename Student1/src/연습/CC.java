package 연습;

import java.util.Random;
import java.util.Scanner;

public class CC {
	String name;
	Student[] student;
	int rank;
	CC(String name, Student[] student){
		this.name = name;
		this.student = student;
	}
	int classTotal = 0;
	int classFin = 0;
	int classMid = 0;
	double classAvg = 0;
	public void init() {
		Random r = new Random();
		for(int i = 0; i < student.length; i++) {
			student[i].mid = r.nextInt(101);
			student[i].fin = r.nextInt(101);
			student[i].calc();
			classTotal = student[i].total + classTotal;
			classFin = student[i].fin + classFin;
			classMid = student[i].mid + classMid;			
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
	public void rank() {
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
		System.out.println("");

		for(int i = 0; i < student.length; i++) {
			System.out.println(student[i].name + "님 총점 " + student[i].total + "점 등수 " + student[i].rank);
		}

	}

}
