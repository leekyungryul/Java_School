package ForStudy;

public class 퀴즈 {
//1부터10까지 숫자 중에서 짝수만 화면에 출력
	public static void main(String[] args) {
		for(int i = 1; i < 11; i++) {
			if (i%2==0) {
				System.out.println(i+"=짝수입니다.");
				} else {
					System.out.println(i + "=홀수입니다.");
				}
		}
	}

}
