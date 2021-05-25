package 연습;

public class Student {
	String name;
	int fin;
	int mid;
	int total;
	double avg;
	int rank;
	
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
