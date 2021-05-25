package Sort_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<People> class1 = new ArrayList<People>();
		for(int i = 0; i < 5; i++) {
			class1.add(new People());
		}
		System.out.println("-------------정렬전-------------");
		for(int i = 0; i < class1.size(); i++) {
			System.out.println(class1.get(i));
		}
		
		Collections.sort(class1);
		
		System.out.println("-------------정렬후-------------");
		for(int i = 0; i < class1.size(); i++) {
			System.out.println(class1.get(i));
		}
	}

}
