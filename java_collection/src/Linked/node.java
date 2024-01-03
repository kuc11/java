package Linked;

public class node {				// node에 공간을 만들어주는 클래스
	
	private String name;		
	public int index;
	private node next=null;			// 다음순서에 노드의 주소 		(주소가 저장되는 참조변수)
									// next에 주소가 없는경우(null) 마지막 공간이다.
	
	public node() {}
	public node(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public node getNext() {
		return next;
	}
	public void setNext(node next) {
		this.next = next;		// 현재 노드에 next를 저장해란
	}

	
	
	
	
	
	
	
	
	
	
}
