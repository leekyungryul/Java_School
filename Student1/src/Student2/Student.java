package Student2;

public class Student {
	String name;
	int totalScore;
	int midScore;
	int finalScore;
	int average;
	public Student(String name, int middle, int final1) {
		this.name = name;
		this.midScore = middle;
		this.finalScore = final1;
	}
	public String toString() {
		return this.name + " : " + this.totalScore;
	}
}
