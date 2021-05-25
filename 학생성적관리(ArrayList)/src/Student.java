import java.util.Scanner;

class Student implements Comparable{
	String name;
	int total;
	int mid;
	int fin;
	int rank;
	Student(){
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		this.name = s.nextLine();
		System.out.println("중간고사 성적을 입력하세요");
		this.mid = s.nextInt();
		System.out.println("기말고사 성적을 입력하세요");
		this.fin = s.nextInt();
		this.total = this.mid + this.fin;
	}
	Student(String name, int mid, int fin){
		this.name = name;
		this.mid = mid;
		this.fin = fin;
	}
	public int compareTo(Object o) {
		return this.total - ((Student)o).total;
	}
	public void calc() {
		this.total = this.mid + this.fin;
	}

	public String toString() {
		return this.name + "의 총점: " + this.total + "점, 중간 " + this.mid + "점, 기말 " + this.fin;
	}
}

