package ProStudent2;

public class Student {
	//프로퍼티를 생성한다.
	String name;
	int middleScore;
	int finalScore;
	int totalScore;
	
	Student(String name, int middleScore, int finalScore){
		this.name = name;
		this.middleScore = middleScore;
		this.finalScore = finalScore;
		this.sumScore();
	}
	public void sumScore() {
		this.totalScore = this.middleScore+ this.finalScore;
	}
	public String toString() {
		return this.name + " : " + this.totalScore;
	}
}
