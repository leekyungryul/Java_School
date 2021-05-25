package ForStudy;

public class 중복반복문연습 {

	public static void main(String[] args) {
		for(int i = 0; i < 9; i++) {
			int num1 = i + 1;
			for(int j = 0; j < 9; j++) {
				int num2 = j + 1;
				System.out.println(num1*num2);
			}
		}
	}

}
