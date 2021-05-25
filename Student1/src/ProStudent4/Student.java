package ProStudent4;

public class Student {
	String name;
	int middleScore;
	int finalScore;
	int sum;
	int avg;
//	"오버로딩" 
//	파라미터에 들어오는 형태에 따라서 달라질수있게 만든다.
//	생성자를 여러형태로 만들어서 시작하면 된다.
	Student( ){
	}
	
	Student(String name){
		this.name = name;
	}
	Student(String name, int middelScore, int finalScore){
		this.name = name;
		this.middleScore = middleScore;
		this.finalScore = finalScore;
	}
	
	public void sum() {
		this.sum = this.middleScore + this.finalScore;
	}
	public void avg() {
		this.avg = this.sum / 2;
	}
	
	@Override
	public String toString() {
		return ""+ this.name
				+"(" + "중간: " + this.middleScore + ","
				+  " 기말: " + this.finalScore + "," + " 총합: "+ this.sum + "," + " 평균: " + this.avg + ")";
	}
}