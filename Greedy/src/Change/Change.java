package Change;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Change {

	public static void main(String[] args) throws Exception{
//		주화의 갯수가 주어진다.
//		주화의 종류가 주어진다.
//		돈을 낸다
//		상품의 가격이 주어진다.
		System.setIn(new FileInputStream("src/input_change.txt"));		
		Scanner s = new Scanner(System.in);
		System.out.println("거스름돈으로 줄 주화의 종류를 입력하세요");
		int n = s.nextInt();
		int [] changes = new int[n];
		for(int i = 0; i < changes.length; i++) {
			changes[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(changes));
//		Arrays.sort(changes);
		System.out.println("내실 돈을 입력하세요");
		int money = s.nextInt();
		System.out.println("상품의 가격을 입력하세요");
		int product = s.nextInt();
		int change = money - product;
		int sum = 0;
		for(int j = 0; j < changes.length; j++) {
			if(changes[j] > change) {
				continue;
			}
		
			int a = change / changes[j];
			sum = sum + a;
			int b = change % changes[j];
			change = b;
			
		}
		System.out.println(sum);
		
	}

}
