package 연습2;

public class Main {

	public static void main(String[] args) {
		Student[] class1 = {new Student("1번학생"),
							 new Student("2번학생"),
							 new Student("3번학생"),
							 new Student("4번학생"),
							 new Student("5번학생"),
		};
		Student[] class2 = {new Student("1번학생"),
							 new Student("2번학생"),
							 new Student("3번학생"),
							 new Student("4번학생"),
							 new Student("5번학생"),
};
		Student[] class3 = {new Student("1번학생"),
							 new Student("2번학생"),
							 new Student("3번학생"),
							 new Student("4번학생"),
							 new Student("5번학생"),
};
		CC[]cc = {new CC("1반",class1),new CC("2반",class2),new CC("3반",class3)};
		
		for(int i = 0; i < cc.length-1; i++) {
			for(int j = 0; j < cc.length; j++) {
				if(cc[i].classtotal < cc[j].classtotal) {
					CC temp = cc[i];
					cc[i] = cc[j];
					cc[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < cc.length; i++) {
			if(i > 1 && cc[i].classtotal == cc[i].classtotal) {
				cc[i].rank = cc[i-1].rank;
			}
			else {
				cc[i].rank = i + 1;
			}
		}
		
		for(int i = 0; i < cc.length; i++) {
			cc[i].init();
			cc[i].sort();
			cc[i].rankset();
			System.out.println("------------------"+cc[i].rank + "등 " + cc[i].name+ cc[i].classtotal +"점" + "------------------");
			System.out.println("");
			cc[i].print();
		}
		

	}

}
