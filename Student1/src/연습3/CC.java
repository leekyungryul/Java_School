package 연습3;

import java.util.Scanner;

public class CC {
	String name;
	Student[] student;
	int rank;
	CC(Student[] student){
		Scanner s = new Scanner(System.in);
		System.out.println("반을 입력하세요");
		this.name = s.nextLine();
		this.student = student;
	}
	
	CC(String name, Student[] student){
		this.name = name;
		this.student = student;
	}
	int classtotal = 0;
	int classmid = 0;
	int classfin = 0;
	public void Calc() {
		for(int i = 0; i < student.length; i++) {
			classtotal = classtotal + student[i].total;
			classmid = classmid + student[i].mid;
			classfin = classfin + student[i].fin;
		}
	}
	public void Sort() {
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
	public void Rank() {
		for(int i = 0; i < student.length; i ++) {
			if(i > 1 && student[i].total == student[i-1].total) {
				student[i].rank = student[i-1].rank;
			} else {
				student[i].rank = i + 1;
			}
		}
	}
	public void Print() {
		for(int i = 0; i < student.length; i++) {
			System.out.println(student[i].name + " / " + student[i].total + " / " + student[i].rank);
		}
	}
}
