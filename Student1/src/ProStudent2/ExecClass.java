package ProStudent2;

import java.util.Arrays;

public class ExecClass {

	public static void main(String[] args) {
		//Student type의 student객체를 생성하여 name,middleScore,finalScore를 포함하여 학생정보를 넣는다.
		Student[] student = {new Student("홍길동",300,500),new Student("김밥",888,500),new Student("통닭",900,500),
				new Student("콜라",700,500),new Student("우유",100,500),new Student("김치",100,700),
				new Student("참치",180,500),new Student("파스타",550,500),new Student("된장",800,500),
				new Student("고등어",100,400)};
		//전체 중간고사 성적을 담을 변수 생성
		int totalMiddleScore = 0;
		//전체 기말고사 성적을 담을 변수 생성
		int totalFinalScore = 0;
		//전체성적을 담을 변수 생성
		int totalScore = 0;
		//student객체의 길이만큼 반복문을 회전한다.
		for(int i = 0; i < student.length; i++) {
			//전체 학생 중간고사 성적을 totalMiddleScore에 담는다.                                                         
			totalMiddleScore = totalMiddleScore + student[i].middleScore;
			totalFinalScore = totalFinalScore + student[i].finalScore;
			totalScore = totalScore + student[i].totalScore;
		}
		//학생전체의 중간고사 평균점수, 기말고사 평균점수, 전체 평균점수를 구한다.
		double avgMiddleScore = (double)totalMiddleScore / student.length;
		double avgFinalScore = (double)totalFinalScore / student.length;
		double avgTotalScore = (double)totalScore / student.length;
		
		System.out.println("중간고사 총점 : " + totalMiddleScore + ", 중간고사 평균" + avgMiddleScore);
		System.out.println("기말고사 총점 : " + totalFinalScore + ", 기말고사 평균" + avgFinalScore);
		System.out.println("전체 총점 : " + totalScore + ", 전체 평균" + avgTotalScore);
		
		for(int i = 0; i < student.length; i++) {
			for(int j = 1; j< student.length-i; j++) {
				if(student[j].totalScore>student[j-1].totalScore) {
					Student temp = student[j];
					student[j] = student[j-1];
					student[j-1] = temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(student));
		}
	}


