package 중복제거오름차순;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 0~10 자연수 배열을 중복을 제거하고 오름차순으로 출력하시오.
 */
public class dupcheck {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/input3.txt"));
		Scanner sc = new Scanner(System.in);
//		계산을 반복하는 턴의 횟수를 정하는 숫자를 받는다.
		int T = sc.nextInt();
		int N;
		int[] arr;
		int[] cnt;
//		반복하는 턴의 숫자에 기준해서 반복문을 생성한다.
		for (int test_case = 1; test_case <= T; test_case++) {
//			배열의 길이를 받는다.
			N = sc.nextInt();
			cnt = new int[11];
//			위에서 받은 배열의 길이를 기준해서 새로운 배열을 생성한다.
			arr = new int[N];
//			생성된 배열의 길이만큼 반복을 수행한다.
			for(int i=0; i < N; i++) {
				arr[i] = sc.nextInt();
	            cnt[arr[i]]++;
			}
//			System.out.println(Arrays.toString(arr));

			for(int i=0; i < 11; i++) {
//				if(cnt[i] > 0) System.out.print(i);
				
//				중복제거 없이 오름차순 출력 
//				if(cnt[i]>0) {
//					for(int j=0; j < cnt[i]; j++) {
//						System.out.print(i);
//					}
//				}
			}
			System.out.println();

		}
		
		
		


		  
	}

}