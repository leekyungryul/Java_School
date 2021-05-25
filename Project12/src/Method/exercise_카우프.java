package Method;

import java.util.Random;
import java.util.Scanner;

public class exercise_카우프 {
	public static void main(String[] args) {
		exercise kaup = new exercise();
		
		double weight = kaup.userInputweight();
		double height = kaup.userInputheight();
		kaup.calcKaup(weight,height);
	}
}