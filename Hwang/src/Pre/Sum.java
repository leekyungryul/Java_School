package Pre;

public class Sum {
	public static void main(String[] args) {
		int sum = 0;
		//합계를 담을 전역변수를 설정합니다.
		for
		(int i = 1; i < 101; i++) {
			sum = sum + i;
			//i가 1~100까지 돌면서 누적합니다.
		}
		System.out.println(sum);
		//합계를 출력합니다.
	}
}
