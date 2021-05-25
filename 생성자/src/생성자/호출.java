package 생성자;

public class 호출 {

	public int val1;
	
//	public 호출() {
//
//	}
	
//	public 호출(int val1) {
//
//		this.val1 = val1;
//	}



	public int getVal1() {
		return val1;
	}

	public void setVal1(int val1) {
		if (val1<0) {
			val1 = 0;
		}
		this.val1 = val1;
	}

	public void calc() {
		// TODO Auto-generated method stub
		System.out.println("calc함수 호출완료");

	}



}
