import java.util.Scanner;
public class first4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=0;
		int result;
		
		Scanner c = new Scanner(System.in);
		System.out.println("첫번째 값을 입력하세요");
		a = c.nextInt();
		System.out.println("두번째 값을 입력하세요");
		b = c.nextInt();
		result = a+b;
		System.out.println("결과값은 " + result + "입니다.");
	}

}
