package Student;

public class ExecClass {

	public static void main(String[] args) {
		Student s1 = new Student("이경율",50,60,90);
		Student s2 = new Student("이지효",90,60,90);
		Student s3 = new Student("김재민",100,70,90);
		Student s4 = new Student("배두용",100,80,100);
		Student s5 = new Student("박성철",100,100,90);
		
		System.out.println(s1.KorScore);
		
//		int SumKor = s1.KorScore + s2.KorScore + s3.KorScore + s4.KorScore+ s5.KorScore;
//		int SumEng = s1.EngScore + s2.EngScore + s3.EngScore + s4.EngScore + s5.EngScore;
//		int SumMath = s1.MathScore + s2.MathScore + s3.MathScore + s4.MathScore + s5.MathScore;
		
//		System.out.println("학생별 국어점수의 총합은 " + SumKor +
//				           " 영어점수의 총합은 " + SumEng +
//				           " 수학점수의 총합은 " + SumMath + " 입니다.");
	}

}


