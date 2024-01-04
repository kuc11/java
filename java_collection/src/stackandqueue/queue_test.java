package stackandqueue;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class queue_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		
		//LinkedList 메소드 중에는 Queue 위한 것들이 있다.
		q.add("김민수");
		q.offer("노재홍");
		q.offer("서종우");
		q.offer("박종권");
		
		System.out.println(q);
		System.out.println( q.remove() );
		System.out.println( q.poll() );
	//	remove는 큐에서 꺼낼 값이 없는경우 오류
	//	poll은 큐에서 꺼낼 값이 없는경우 null값 출력
		System.out.println( q.peek() );
		System.out.println( q.isEmpty() );
		
		// 우선순위 큐
		
		Queue<String> pq = new PriorityQueue<String>();
		
		pq.offer("라디오");
		pq.offer("하마");
		pq.offer("나비");
		pq.offer("Boy");
		pq.offer("가방");
		
		System.out.println( pq );			// 내가 입력한 순서대로 저장이 되지 안된다.
		System.out.println( pq.poll() );	// 값이 작을수록 우선순위가 높다
		System.out.println( pq.poll() );
		
		// Deque - 이중 큐 ( 입출이 이중으로 되어 있는 큐)
		
		Deque<Integer> dq = new ArrayDeque<>();
		dq.addFirst(10);
		dq.offerFirst(20);
		
		dq.addLast(5);		// add 메서드 실행과 동일
		dq.offerLast(11);	// offer 메서드 실행과 동일
		
		// removefirst, pollFirst, removeLast, pollLast
		
		//deque를 스택으로 사용한다면
		// push, pop 메서드 사용가능
		dq.push(111);
		
		System.out.println(dq);
		
		
		
		
		
		
		
	}

}


// 큐 - 선입선출, FIFO( 처음들어온 값이 첫번째로 출력된다. )