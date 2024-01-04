package javaSet;

import java.util.TreeSet;

public class set_study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tree = new TreeSet<Integer>();
								//set 은 기본적으로 중복을 허용치 않는다.
		
		do {
			int num = (int)(Math.random()*50)+1;
			tree.add(num);
//			System.out.println(num);
		}while( tree.size()<10);		// num 값이 중복이 나와도 현제 do while 문은 tree 의 크기가 10이하인 이상 끝나지않고 tree는 중복을 허용치 않는다.
		
		System.out.println( tree );
		
		// 검색
		System.out.println( tree.floor(20) );		
		// 1.일치하는 데이터 찾기 
		// 2.일치하는게 없다면 찾는 값보다 작은값중 가장 가까운 값을 찾는다. 
		// 3.일치하는게 없고 그보다도 작은 값이 없을경우 null 이나온다.
		
		System.out.print( tree.headSet(25));
		// 지정한 값보다 작은 값 전체 출력
		System.out.println( tree.tailSet(25));
		// 지정한 값보다 큰 값 전체 출력
		System.out.println( tree.higher(40));
		// 지정한 값보다 큰 캆들 중에서 가장 가까운 값 출력
		System.out.println( tree.lower(20));
		// 지정한 값보다 작은값중에서 가장 가까운값 출력 , 지정합 값과 같은 값이있어도 작은값을 출력
		
		System.out.println( tree.subSet(10, 30));
		// from과 to 사이의 값 출력( 10이상 30미만)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
