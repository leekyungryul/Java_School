import java.util.Scanner;

public class 연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[20][20];
		Scanner s = new Scanner(System.in);

		System.out.println("토끼의 y축번호");
		int y = s.nextInt();
		System.out.println("토끼의 x축번호");
		int x = s.nextInt();
		
		System.out.println("대각선 아래로 y축");
		for(int y1 = y; y1<20; y1++) {
			System.out.println(y1);
		}
		System.out.println("대각선 아래로 x축");
		for(int x1 = x; x1 >=1; x1-- ) {
			System.out.println(x1);
		}
		
		System.out.println("");
		System.out.println("대각선 위로 y축");
		for(int y2 = y; y2>=1; y2--) {
			System.out.println(y2);
		}
		System.out.println("대각선 위로 x축");
		for(int x2 = x; x2<20; x2++) {
			System.out.println(x2);
		}
	}

}
