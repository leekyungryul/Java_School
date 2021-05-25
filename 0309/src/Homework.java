import java.util.Scanner;
import java.util.Random;

public class Homework {
	public static void main(String[] args) {

		int inputNum, randNum = 0;
		int result1, result2, result3, result5;

		Scanner s = new Scanner(System.in);
		// Scanner 클래스를 사용한다.
		Random r = new Random(10);
		// Random 클래스를 사용한다.
		System.out.print("첫번째 숫자를 입력하세요==> ");
		inputNum = s.nextInt(); // 첫번째 숫자를 입력한다.
		randNum = r.nextInt(10); // 랜덤 숫자를 축출한다.
		System.out.println("랜덤으로 축출된 숫자는 " + randNum + "입니다");
		result1 = inputNum + randNum; // 입력숫자와 랜덤숫자의 합을 result1변수에 담는다.
		System.out.println(inputNum + "+" + randNum + "=" + result1);
		// "입력숫자+랜덤숫자=result1"을 출력한다.
		result2 = inputNum - randNum; // 입력숫자와 랜덤숫자의 차를 result2변수에 담는다.
		System.out.println(inputNum + "-" + randNum + "=" + result2);
		// "입력숫자-랜덤숫자=result2"을 출력한다.
		result3 = inputNum * randNum; // 입력숫자와 랜덤숫자의 곱을 result3변수에 담는다.
		System.out.println(inputNum + "*" + randNum + "=" + result3);
		// "입력숫자*랜덤숫자=result3"을 출력한다.
		double result4 = inputNum / randNum; // 입력숫자에서 랜덤숫자를 나눈값을 result4변수에 담는다.
		System.out.println(inputNum + "/" + randNum + "=" + result4);
		// "입력숫자/랜덤숫자=result4"을 출력한다.
		result5 = inputNum % randNum; // 입력숫자를 랜덤숫자로 나눈 나머지를 result5변수에 담는다.
		System.out.println(inputNum + "%" + randNum + "=" + result5);
		// "입력숫자%랜덤숫자=result5"을 출력한다.

	}

}
