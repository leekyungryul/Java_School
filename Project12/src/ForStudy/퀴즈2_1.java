package ForStudy;

public class 퀴즈2_1 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			int number = i + 1;
			//사용할 숫자를 하나 만들어 준다.
			if (number % 2 == 1) {
				continue;
				//홀수인경우에는 그냥 넘어간다.
			} 
			if (number == 6) {
				break;
				//number가 6이되면 for문을 중단시킨다.
			}
				System.out.println(number);
			
		} 
	}

}