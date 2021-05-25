package Pre;

public class 연습 {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			System.out.println(i + "단");
			for(int j = 1; j < 10; j++) {
				if(j%2 == 0) {
					System.out.println(i + "*" + j + "=" + i*j);

				}
			}
		}
	}

}
