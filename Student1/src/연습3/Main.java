package 연습3;

public class Main {
//	학생객체를 담을 배열의 크기를 정해준다
//	생성된 배열에 반복문으로 학생객체를 생성한다.
//	위에서 생성된 배열들을 다시 CC배열에 담아준다.
//	CC배열을 반복문을 돌려서 학생성적을 입력한다.
	public static void main(String[] args) {
//		Student[] class1 = new Student[3];
//		for(int i = 0; i < class1.length; i++) {
//			new Student();
//		}
//		Student[] class2 = new Student[3];
//		for(int j = 0; j < class1.length; j++) {
//			new Student();
//		}
//		Student[] class3 = new Student[3];
//		for(int k = 0; k < class1.length; k++) {
//			new Student();
//		}
		Student[] class1 = {new Student(),new Student()};
		Student[] class2 = {new Student(),new Student()};
		Student[] class3 = {new Student(),new Student()};

		CC[] cc = {new CC(class1),new CC(class2),new CC(class3)};
		for(int i = 0; i < cc.length; i++) {
			cc[i].Calc();
			cc[i].Sort();
			cc[i].Rank();
			cc[i].Print();
		}
		for(int k = 0; k < cc.length-1; k++) {
			for(int h = k; h < cc.length; h++) {
				if(cc[k].classtotal < cc[h].classtotal) {
					CC temp = cc[k];
					cc[k] = cc[h];
					cc[h] = temp;
				}
			}
		}
//		for(int)
		for(int j = 0; j < cc.length; j++) {
			if(j > 1 && cc[j].classtotal == cc[j-1].classtotal) {
				cc[j].rank = cc[j-1].rank;
			} else {
				cc[j].rank = j+1;
			}
			System.out.println(cc[j].name + " / " + cc[j].classtotal + " / " + cc[j].rank);
		}
	}

}
