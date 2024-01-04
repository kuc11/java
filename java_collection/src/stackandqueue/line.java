package stackandqueue;
import java.util.Stack;
import java.util.Scanner;

public class line {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack= new Stack<String>();  					//collection interface 에 있는거라 제네릭 타입을 사용해야한다.
		
//		stack.push("치즈버거");
//		stack.push("한우불고기");
//		stack.push("모짜렐라인더버거");
//		stack.push("데리버거");
//		stack.push("새우버거");
//		
//		System.out.println(stack);
//		
//		System.out.println(stack.pop());
//		System.out.println( stack.empty() );
//		System.out.println( stack );
//		System.out.println( stack.peek() );
//		System.out.println( stack );
//		System.out.println( stack.search("데리버거") );	// 뺀 위에 있는게 1이다.
		
		Stack<String> web = new Stack<>();
		Stack<String> front = new Stack<>();
		Stack<String> back = new Stack<>();
		String now = "네이버 메인";
		
		// 브라우저에서 페이지 이동시 스택에서 저장되는 방문기록
		
		while(true) {
		now = pageMove(back,front,now);
		}
		
	}
	static String pageMove(Stack<String> back, Stack<String> front, String now) {
		System.out.print("이동할 페이지 입력(뒤-1, 앞-2): ");
		String url = scan.nextLine();
		
		if( url.equals("1")) {
			if( back.empty() ) {
				System.out.println("이전 페이지가 없습니다.");
				url=now;
			}else {
				url=back.pop();
				front.push(now);
			}
		}
		else if( url.equals("2")) {
			if( front.empty()) {
				System.out.println("방문한 페이지가 없습니다.");
				url=now;
			}else {
				url = front.pop();
				back.push(now);
			}
		}else {
			back.push(now);
		}
		
		
		System.out.println("현재 페이지 : "+url);
		System.out.println("\n======뒤======");
		System.out.println( back );
		System.out.println("\n======앞======");
		System.out.println( front + "\n\n");
		
		
		return url;
	}
	
}

// ? return 값이 있을 때만 메소드 앞에 타입이 있어야하는가
// 데이터 처리를 위한 공간
// stack FILO(First In Last Out) 자바에서 배열에 구조
//	Que FIFO(First In First Out) 자바에서 링크드 리스트 구조

// stack - 선형자료구조이며, FILO( 첫번째 입력된 값은 마지막에 출려된다.)
//						LIFO( 마지막에 입력된 값은 첫번째로 출력된다.)
// 	사용처: 계산기, 프로그램의 실행취소및 되살리기, 웹브라우저의 뒤로, 앞으로버튼 등등
// 	스택에서 입력은 push, 출력은 pop			


// 동기화	  : 단일실행
// 비동기화 : 멀티테스킹 다중실행
// ArrayList 는 자동크기조정이 지원되지않는다 (데이터를 추가할때 공간이 늘어나지만 공간에 들어간 데이터가 삭제되도 공간은 줄어들지 않는다. 그리고 데이타양에 맞게 늘어나는게아니라 한번에 몇배는 늘어난다)