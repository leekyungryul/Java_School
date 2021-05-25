
public class first2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; // 정수
		a = 10;		
		double c = 3.54; //실수
		System.out.println(c);
		char d = 'A'; // 문자(한글자) 작은따옴표 사용(오직 여기서만)
		boolean e = true; // 불대수
		String f = "hello"; // 문자열 큰따옴표 사용
		System.out.println(f);
		String g = new String("hello onyu");
		int b = a+3;
		System.out.println(b);
		double result1 = 10/3; // 계산값을 정수로 입력하면 소숫점 뒤가 0으로 나온다.
		System.out.println(result1);
		double result2 = 10.0/3; // 계산값을 실수로 입력해야 소숫점 뒤가 출력된다.
		System.out.println(result2);
		double result3 = (double)10/3; 
		// 상수를 실수로 입력하지 않아도 상수앞에 실수를 선언해주면 실수로 결과값을 출력할 수있다..
		System.out.println(result2);
		

		//앞서 변수d에 A를 지정하였는데 뒤에 변수d에 다음 알파벳을 지정하고자 할때
		System.out.println(d);

		
	}

}
