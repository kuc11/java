package Linked;

public class list_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedkList list = new linkedkList();
		
		list.add("이순신");		//첫번째 노드
		list.add("김유신");		//두번째 노드
		list.add("장영실"); 		//세번째 노드	이순신:head 김유신 장영실:temp
		list.add("이성계");
		list.add("문익점");
			
		System.out.println(list);
		
		System.out.println( list.get(4) );
		
		list.remove(1);
		System.out.println( list );
		
		list.add(4, "김의찬");
		System.out.println( list );
	}

}















		// 배열의 모든공간의 크기는 같아야한다. 장점 : 데이터를 빠르게 저장할 수 있다, 빠르게 출력도 할 수 있다.
		//							   단점 : 배열이 데이터가 많을수록 배열의 연속적인 특징 때문에 중간에 있는 데이터를 제거하거나 추가할 때 용이하지 못하다.
		// 배열의 단점을 보완한 linked
		// 자바에서 지원되는 linkede 리스트는 양방향이다.	데이터와 주소가 저장되어있는 공간을 node라고 한다.
		// 클래스 객체공간은 크기가 다르기에 index를 갖지않는다.