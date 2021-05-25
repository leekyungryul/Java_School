package ForStudy;

public class 퀴즈2 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			int number = i + 1;
			//사용할 숫자를 하나 만들어 준다.
			if (number % 2 == 0) {
			System.out.println(""+number+":"+"짝수입니다.");
			} else {
				System.out.println(""+number+":"+"홀수입니다.");
			}
		} 
	}

}
