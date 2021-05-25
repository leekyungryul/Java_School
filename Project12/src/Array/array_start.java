package Array;

import java.util.Arrays;
import java.util.Scanner;

public class array_start {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] grades = new int[5];
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
		}//end for
		System.out.println("처리할 점수는 다음과 같습니다.");
		System.out.println(Arrays.toString(grades));
		
		
		int a[] = {0,0,0,0};
		int b[] = new int[5];
		//배열의 내용물들을 미리 정하지 않고 껍데기만 칸수를 정해서 만들었다.
		a[0] = 10;
		a[0]++;
		a[1]=3;
		a[2]=a[0]+a[1];
		
		a[3] = 50;
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
		//활용도 높지 않다.
	} 	

}
