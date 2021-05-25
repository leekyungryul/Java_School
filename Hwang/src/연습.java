
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;


public class 연습 {

	public static void main(String args[]) {
		System.out.println("--------기본 문형 1--------");
		// 외워야 할것
		List<Integer> mylist = new ArrayList<Integer>(); //ArrayList mylist = new ArrayList(); // List mylist = new LinkedList();
		mylist.add(0);
		mylist.add(1);
		mylist.add(2);
//		System.out.println(mylist.get(0));
		mylist.remove(0);
//		System.out.println(mylist.get(0));
		
		// 1. 순회하면서 프린트를 하거나 조회를 할때(구 실무방식)
		Iterator it = mylist.iterator(); // 실무유형1
		//존재여부 확인
		while(it.hasNext()){
			// 다음값을 담는다
		    int value = (int) it.next();
//		    System.out.println(value);                 
		}
		// 1. object = 모든것의 아버지
		for(Object i : mylist) {   // 실무유형2   
//			System.out.println(i);
		}
		// 3. 하나만 외운다면 이것만 외우자.
		for(int i=0; i < mylist.size(); i++) { 
			System.out.println(mylist.get(i));
		}
		
		System.out.println("--------기본 문형 2--------");
		List<Integer> mylist2 = new ArrayList<Integer>(); //ArrayList mylist = new ArrayList(); // List mylist = new LinkedList();
		mylist2.add(1);
		mylist2.add(2);
		mylist2.add(3);
//		System.out.println(mylist2.get(0));
		mylist2.remove(0);
//		System.out.println(mylist2.get(0));
		
		Iterator<Integer> it2 = mylist2.iterator(); //print all elements
		while(it2.hasNext()){
		    int value = (int) it2.next();
//		    System.out.println(value);                 
		}
		
		for(Integer i : mylist2) {       //print all elements
//			System.out.println(i);
		}
		
		for(int i=0; i < mylist2.size(); i++) { //print all elements
//			System.out.println(mylist2.get(i));
		}
		
//		System.out.println("--------------------------------");
		
		ArrayList list = new ArrayList();
		list.add(1);
//		System.out.println(list.get(0));
		
	}
}