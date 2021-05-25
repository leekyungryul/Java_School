import java.util.Arrays;

public class 이중배열 {

	public static void main(String[] args) {
		int[][] array = new int[8][9];
		for(int i = 0; i < array.length; i++) {
			System.out.println(i);
			System.out.println(Arrays.toString(array[0]));
		}
	}

}
