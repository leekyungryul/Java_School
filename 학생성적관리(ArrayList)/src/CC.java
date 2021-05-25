import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class CC implements Comparable{
	String name;
	int rank;
	Student[] student;
//	ArrayList<Student>student;
	Scanner s = new Scanner(System.in);
	CC(){
		System.out.println("반의 이름을 입력하세요");
		this.name = s.nextLine();
		
	}
	CC(String name, Student[] student){
//		System.out.println("반의 이름을 입력하세요");
		this.name = name;
		this.student = student;
	}
	Random r = new Random();
	int classtotal = 0;
	int classfin = 0;
	int classmid = 0;
	double classavg = 0;
//	public void add() {
//		student.add(new Student());
//	}
	public void init() {
		
//		for(int i = 0; i < student.size(); i++) {
//			student.get(i).mid = r.nextInt(101);
//			student.get(i).fin = r.nextInt(101);
//			student.get(i).calc();
//			
//		}
		for(int j = 0; j < student.length; j ++) {
			classtotal = classtotal + student[j].total;
			classfin = classfin + student[j].fin;
			classmid = classmid + student[j].mid;
		}
		classavg = classtotal / student.length;
//		for(int j = 0; j < student.size(); j ++) {
//			classtotal = classtotal + student.get(j).total;
//			classfin = classfin + student.get(j).fin;
//			classmid = classmid + student.get(j).mid;
//		}
//		classavg = classtotal / student.size();
	}
	public void print() {
		for(int i = 0; i < student.length; i++) {
			System.out.println("");
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
	public int compareTo(Object o) {
		return this.classtotal - ((CC)o).classtotal;
	}
	public String toString() {
		return this.name + "= " + this.classtotal;
	}


	
}