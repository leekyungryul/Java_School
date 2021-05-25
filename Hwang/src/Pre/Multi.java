package Pre;

public class Multi {

	public static void main(String[] args) {
		int Num1 = 6;
		//6단을 위해 6을 전역변수에 설정합니다.
		for(int i = 0; i < 9; i++) {
			//9단을 위해 9회전을 계획합니다.
			int Num2 = i+1;
			//Num1에 i의 값을 누적합니다.
			int result = Num1 * Num2;
			//Num1과 Num2의 값을 곱한값을 result변수에 담아냅니다.
			System.out.println(result);
			//결과를 출력합니다.
		}
	}

}
