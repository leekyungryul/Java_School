import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Student[] s1 = {new Student("홍길동", 500),new Student("홍길동2", 300),new Student("홍길동3", 200)};
		
		Student[] s2 = new Student[3];
		s2[0] = new Student("이온유1", 300);
		s2[1] = new Student("이온유2", 100);
		s2[2] = new Student("이온유3", 50);
//		제네릭 = <Student>...
		ArrayList<Student> s3 = new ArrayList();
		s3.add(new Student("이순신", 900));
		s3.add(new Student("이성계", 400));
		
		s3.get(0).name = "김구";
		s3.get(1).middleScore = 500;
		
		for(int i = 0; i < s3.size(); i++) {
			System.out.println(s3.get(i).name + "의 중간고사 점수 : " + s3.get(i).middleScore);
		}
	}

}
