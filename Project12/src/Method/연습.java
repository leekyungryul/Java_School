package Method;

public class 연습 {
	
	int coins;
	public void deposit(int coin) {
		System.out.println("딸그랑 ");
		coins = coin + coins;
	}
	
	public void deposit2(String name,int coin) {
		System.out.println(name + "님 입금액은 "+ coin + "입니다.");
	}
	
	public void Last() {
		System.out.println("최종금액은" + coins + "입니다.");
	}



}
