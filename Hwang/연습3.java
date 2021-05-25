import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 연습3 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int[][] array = new int[20][20];
		for(int i = 0; i < array.length; i++) {
//			System.out.println(Arrays.toString(array[i]));
		}
		for (int i = 0; i < array.length ; i++) {
			for (int j = 0; j < array.length ; j++) {
				for(int k = 1; k <= 400; k++) {
					array[i][j] = k;
				}
			}
		}
		System.out.println("여우의 x축 좌표");
		int wx = s.nextInt();
		System.out.println("여우의 y축 좌표");
		int wy = s.nextInt();
		System.out.println("토끼1의 x축 좌표");
		int rx = s.nextInt();
		System.out.println("토끼1의 y축 좌표");
		int ry = s.nextInt();
		System.out.println("토끼2의 x축 좌표");
		int rx2 = s.nextInt();
		System.out.println("토끼2의 y축 좌표");
		int ry2 = s.nextInt();
		// x축 내 있는지 검색
		int cnt1 = 0;
		for(int i = 0; i < array.length; i ++) {
			if(array[rx][i] == array[wx][wy]) {
				cnt1 = cnt1+1;
			}
			if(array[rx2][i] == array[wx][wy]) {
				cnt1 = cnt1+1;
			}
		}
		System.out.println(cnt1);
		// y축 내 있는지 검색
		int cnt2 = 0;
		for(int i = 0; i < array.length; i ++) {
			if(array[i][ry] == array[wx][wy]) {
				cnt2 = cnt2+1;
			}
			if(array[i][ry2] == array[wx][wy]) {
				cnt2 = cnt2+1;
			}
		}
		System.out.println(cnt2);
		System.out.println(cnt1+cnt2);
		System.out.println();
	}

}
