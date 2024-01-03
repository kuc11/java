package Linked;

public class linkedkList {	// 노드와 노드를 연결시켜주는 클래스

	static int cnt =0;
	private node head = null;	//링크드 맨앞에 있는 노드
	private node tail = null;	//링크드 맨뒤에 있는 노드
	
	
	//데이터 추가하는 메서드
	public void add(String name) {
		node temp = new node(name);	// 노드 클래스의 객체 생성
		temp.index=cnt;
		cnt++;
		if(head==null) {		// 노드가 하나밖에없는경우 그 노드가 처음이자 마지막
			head=temp;
			tail=temp;
		}else { 					// 헤드에 주소는 웬만하면 바뀌지 않는다 (테일은 상관없음)
			tail.setNext(temp);		// 새 노드의 주소를 앞에 있는 노드에 저장
			tail=temp;				// 새로운 노드가 마지막이 됨
		}
	}
	
	//데이터를 출력하기위한 메서드
	public node get(int index) {
		node find = head; // 링크드 리스트 첫번째노드부터시작
		while(find!=null) {
			if(find.index == index) {
				return find;
			}
			find = find.getNext();    // 현재노드의 다음 노드로 이동
		}
		return null;
	}
	
	//데이터를 삭제하기위한 메서드
	public boolean remove(int index) {
		
		node find = head; //첫번째 노드부터 시작
		
		if(find.index == index) { // 첫번째 노드 삭제
			head = head.getNext();
			reindex();
			cnt--;
//		}else if(tail.index == index) { // 마지막 노드 삭제
			
		}else {
		
			while(find.getNext() != null){		// 중간에 있는 노드를 삭제
			if(find.getNext().index == index) {
				node del = find.getNext();
				find.setNext( del.getNext());	// del의 next를 앞쪽 node next 에 저장
				return true;
			}
			find = find.getNext(); // 그다음 노드로 이동
			}
			
		}
		
		return false;
	}
	
	
	
	
	//원하는 위치에 데이터를 추가하는 메서드
	public void add(int index, String name) {
		
		node temp = new node(name);
		cnt++;
		
		node find = head; // 첫번째 노드부터 시작
		
		if(index==0) {			// 링크드리스트 맨앞에 추가삽입한다면
			temp.setNext(head);
			head=temp;
		}else {
			// 다음 주석 설명은 만약 4번째 위치에 새노드 삽입한다면 에 대한 설명
			while(find.getNext() != null) {
				if(find.getNext().index == index) {	 // find는 3번째 노드이다.
					temp.setNext(find.getNext());	 
					// 새로운 노드의 next에 3번째노드의 next(4번째)를 저장한다.
					find.setNext(temp);
					// 3번째 노드의 next에 새노드의 주소를 저장한다.
					break;
				}
				find = find.getNext();
			}
		}
		reindex();
	}
	
	private void reindex() {		// 인덱스 번호가 재배치 되도록
		node location = head; 		
		// 첫본째 노드부터 시작해서 인덱스 0부터 재설정
		int i=0;
		while(location !=null) { // 마지막 노드까지
			location.index= i++;
			
			location = location.getNext();   //다음 노드 이동
		}
		
	}
	
	
	//링크드 리스트 전체 출력
	@Override
	public String toString() {
		
		String out = "[";
		node move = head;//링크드리스트의 첫번째노드
		
		while(move!=null) {					//move 가 null 을 가질때 거짓이 되도록(마지막 노드의 next가 null 이기에)
		out += move.getName() +"\n";		
		move = move.getNext();				//move 가 알고있는 next를 move에게
		}
		
		out +="]";
		
		return	out;
		
	}
}
