package Array;

import java.util.Arrays;
import java.util.Scanner;

public class 배열에성적담기with_for {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] grades = new int[5];
		//int grades[] = {0,0,0,0,0}와 동일하다.
		for(int i = 0; i < grades.length; i++) {
			int no = i + 1;
			String no1 = "";
			if(no==1) {
				no1 = "첫번째";
			}
			if(no==2) {
				no1 = "두번째";
			}
			if(no==3) {
				no1 = "세번째";
			}
			if(no==4) {
				no1 = "네번째";
			}
			if(no==5) {
				no1 = "다섯번째";
			}
			System.out.println(no1 + " 성적점수를 넣어주세요.");
			int userinput = scanner.nextInt();
			grades[i] = userinput;
			//grades[i] = scanner.nextInt();와 동일하다.
		}//end for
		System.out.println("처리할 점수는 다음과 같습니다.");
		System.out.println(Arrays.toString(grades));
	} 	
	

}
