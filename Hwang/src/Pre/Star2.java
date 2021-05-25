package Pre;

public class Star2 {

	public static void main(String[] args) {
		for(int i=4;i>0;i--){
			//4줄 작성을 위해서 i는 4회전을 계획합니다.
			for(int j=i;j>0;j--){
				/*각 줄이 증가하면서 별의 갯수가 하나씩 줄어들어 출력되게
				하기 위해서 j를 i의 갯수에서 하나씩 줄여 출력합니다..*/
				System.out.print("*");
				//별을 출력합니다.
			}
			System.out.println("");
			//한줄씩 뛰우기 위해 위 문장을 삽입합니다.
		}
	}

}
