package Bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueEx {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
//		삽입(5) - 삽입(2) - 삽입(3) - 삭제(5) - 삽입(1) - 삽입(4) - 삭제(2)
//		q.poll: 앞에 들어간거 먼저 삭제한다.
		q.offer(5);
		q.offer(2);
		q.offer(3);
		q.poll();
		q.offer(1);
		q.offer(4);
		q.poll();
//		앞에 들어간거부터 출력한다(원소가 남아있을때까지)
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
