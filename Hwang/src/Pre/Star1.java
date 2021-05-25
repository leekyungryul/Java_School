package Pre;

public class Star1 {

	public static void main(String[] args) {
		for(int i=1;i<5;i++){
			//4줄 작성을 위해서 i는 4회전을 계획합니다.(첫줄부터 별이 출력되어야 하므로 i는 1부터 시작합니다.)
			for(int j=0;j<i;j++){
				//i가 1씩 증가할때마다 한줄에 i의 갯수만큼 별이 출력되게합니다.
				System.out.print("*");
				//별을 출력합니다.
			}
			System.out.println("");
			//한줄씩 뛰우기 위해 위 문장을 삽입합니다.
		}
	}

}
