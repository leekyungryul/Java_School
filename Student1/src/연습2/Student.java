package 연습2;

public class Student {
	String name;
	int rank;
	int total;
	int fin;
	int mid;
	double avg;
	
	Student(){
		
	}
	Student(String name){
		this.name = name;
	}
	Student(String name, int mid, int fin){
		this.name = name;
		this.mid = mid;
		this.fin = fin;
	}
	public void calc() {
		this.total = this.mid + this.fin;
		this.avg = this.total / 2;
	}
}
