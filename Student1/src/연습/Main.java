package 연습;

public class Main {

	public static void main(String[] args) {
		Student[] class1 = {new Student("이경율1"),
							new Student("이경율2"),
							new Student("이경율3"),
							new Student("이경율4"),
							new Student("이경율5"),
		};
		Student[] class2 = {new Student("이경율1"),
							new Student("이경율2"),
							new Student("이경율3"),
							new Student("이경율4"),
							new Student("이경율5"),
};
		Student[] class3 = {new Student("이경율1"),
							new Student("이경율2"),
							new Student("이경율3"),
							new Student("이경율4"),
							new Student("이경율5"),
};
		CC[] cc = {new CC("1반", class1),new CC("2반", class2),new CC("3반", class3),};
		for(int i = 0; i < cc.length; i++) {
			cc[i].init();
			cc[i].sort();
			cc[i].rank();
			cc[i].print();
		}
//		for(int i = 0; i < student.length-1; i++) {
//			for(int j = i; j < student.length; j++) {
//				if(student[i].total < student[j].total) {
//					Student temp = student[i];
//					student[i] = student[j];
//					student[j] = temp;
//				}
//			}
//		}
//	}
		for(int i = 0; i < cc.length-1; i++) {
			for(int j = i; j < cc.length; j++) {
				if(cc[i].classTotal < cc[j].classTotal) {
					CC temp = cc[i];
					cc[i] = cc[j];
					cc[j] = temp;
				}
			}
		}
		for(int i = 0 ; i < cc.length; i++) {
			System.out.println(cc[i].classTotal);
		}
//		for(int i = 0; i < student.length; i++) {
//			if(i > 1 && student[i].total == student[i-1].total) {
//				student[i].rank = student[i-1].rank;
//			}
//			else {
//				student[i].rank = i+1;
//			}
//		}
//	}
		for(int i = 0; i < cc.length; i++) {
			if(i > 1 && cc[i].classTotal == cc[i-1].classTotal) {
				cc[i].rank = cc[i-1].rank;
			}
			else {
				cc[i].rank = i+1 ;
			}
			System.out.println(cc[i].name + "의 순위는 " + cc[i].rank + "등 총점은 " + cc[i].classTotal);
		}
	}

}
