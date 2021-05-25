import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<CC> cc = new ArrayList<CC>();
//		CC [] cc = {new CC(),new CC(),new CC()};
		ArrayList<Student>students1 = new ArrayList<Student>();
		ArrayList<Student>students2 = new ArrayList<Student>();
		ArrayList<Student>students3 = new ArrayList<Student>();		
		
////		CC cc = new CC();
		try{
		for(int j = 0; j < 1; j++) {
			System.out.println(j+1 + "반 성적을 입력하겠습니다.");
			for(int i = 0; i < 2; i ++) {
				students1.add(new Student());
			}
			System.out.println(j+2 + "반 성적을 입력하겠습니다.");
			for(int i = 0; i < 2; i ++) {
				students2.add(new Student());
			}
			System.out.println(j+3 + "반 성적을 입력하겠습니다.");
			for(int i = 0; i < 2; i ++) {
				students3.add(new Student());
			}
			} 
				
			}catch(Exception e) {
				
			}
//		for(int i = 0; i < cc.length; i++) {
//			cc[i].init();
//			cc[i].sort();
//			cc[i].print();
//		}
//		System.out.println(students1.toString());System.out.println(students2.toString());System.out.println(students3.toString());
//		for(int i = 0; i < 3; i++) {
//			Scanner s = new Scanner(System.in);
//			String userinptut = s.nextLine(); 
//			cc
//			cc.add(new CC());
//		}
		cc.add(new CC("1반", students1));
		cc.add(new CC("2반", students2));
		cc.add(new CC("3반", students3));
//		for(int i = 0; i < cc.size(); i++) {
//			cc.get(i).init();
//			cc.get(i).sort();
//		}
//		Collections.sort(cc);

		System.out.println(students1.toString());System.out.println(students2.toString());System.out.println(students3.toString());
		System.out.println(cc.toString());
//		System.out.println(cc.get(0).classtotal); 
//		System.out.println(cc.get(0).classmid); 
//		System.out.println(cc.get(0).classfin); 
		


		}

}