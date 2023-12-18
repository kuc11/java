// 프로젝트명 -> 마우스 오른쪽크릭 -> team -> Add to index 클릭
//	-> commit message 작성 -> commit and push 버튼 클릭
package java_h;

import java.util.Arrays;
import java.util.Scanner;

public class java2 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 16개의 정수를 중복없이 배열에 저장하기
		int[] number = new int[16];
		
		for(int i=0; i<number.length; i++) {
			number[i] = (int)(Math.random()*50)+1;
				for(int k=0; k<i; k++) {
					if(number[k] == number[i]) {
						i--;
						break;  
					}
				}
		
		
	}
// 자바스크립트 배열에 특정값 존재여부 - indexOf(특정값), includes(특정값)
// 자바배열은 indexOf, includes 가 없다
// indexOf와 contains로 존재여부로 알 수 없지만,
// String 과 List 클래스에서만 사용가능
		
		System.out.println(Arrays.toString(number)+"  -  java2" );
		
		
		// number 배열을 한줄에 4개씩 4줄로 출력하세요
//		System.out.println("┌──┐─┐───┐────┐");
//		for(int i=0; i<number.length; i++) {
//			if(i%4==0)
//				System.out.println("│\n│───│───│───│");
//			System.out.printf("│ %2d" , number[i] );
//		}
//		System.out.println("│\n└───────────┘");
		
		
		int[][] arr2 = new int[3][2];
		arr2[0][0] = 100;
		arr2[0][1] = 30;
		
		arr2[1][0] = 50;
		arr2[1][1] = 10;
		
//		int[][] bingo = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		
		int[][] bingo = new int[][] {
			{5,23,40,7} ,{45,14,2,37} ,{3,29,33,22} ,{39,9,27,10}
		};
		
		for( int i=0; i<bingo.length; i++) {
			for(int k=0; k<bingo[i].length; k++) {
				System.out.printf(" %2d",bingo[i][k]);
				}
			System.out.println();
		}
		
		// bingo 배열에서 25이하는 숫자대신 ★ 출력
		for (int i=0; i<bingo.length; i++) {
			System.out.println();
			for(int k=0; k<bingo.length; k++) {
				if(bingo[i][k]<=25)
					System.out.printf(" %2s","★");			// %c 는 문자로 한자리만 차리하지만 %s 는 문자열로 여러자리 차지가능
				else
					System.out.printf(" %2d",bingo[i][k]);
			}
			
		}
		
		
		// 크기가 다른 2차원배열	비전방배열
		
		// int[0] a, b, c;
		int[][] arr5 = new int[3][];
		int[] a= new int[] {1,2,3,4};
		int[] b= {10,20,30};
		int[] c= {11,22,33,44,55,66};
		
		arr5[0] = a;
		arr5[1] = b;
		arr5[2] = c;
		
		for(int i=0; i<arr5.length; i++) {
			System.out.println("");
			for(int k=0; k<arr5[i].length; k++) {
				System.out.print(arr5[i][k]+" ");
			}
		}
		// 자바스크립트 - 배열에 정수나 실수나 문자열을 복합적으로 저장할 수 있다.
		// 자바 - 배열생성시 부여한 데이터 타입에 맞는 데이터만 저장 가능
		
//		int num11 = scan.nextInt();
//		scan.nextLine();
//		String word = scan.nextLine();
//		
//		System.out.println( num11+" "+word );
		
		String[][] info = new String[3][3];
		
		for(int i=0; i<info.length; i++) {
			System.out.print("이름: ");
			info[i][0]	= scan.nextLine();
			System.out.print("나이: ");
			int age = scan.nextInt();
			info[i][1] = Integer.toString(age); 		// 숫자를 문자열로 변경	실수를 문자로 floor.toString double.toString
								 // 문장열을 숫자로변경	- integer.parseInt();
								 // 문자열을 실수로		- Float.parseFloat(); Double.parseDouble();
			scan.nextLine();
			System.out.print("직업: ");
			info[i][2] = scan.nextLine();
		}
		for(int i=0; i<info.length; i++) {
			for(int k=0; i<info[i].length; k++) {
				
				System.out.printf("이름: %s , 나이: %s , 직업: %s \n", 
						info[i][k], info[i][k],info[i][k]);
			}
		}
		// 1차원 배열만 잘 다룰 수 있으면 된다.
		// 그럼 자연스레 2차원 배열도 된다.
		// 배열의 사용은 인덱스 사용이 중요하다. 0번 인덱스 부터 시작한다	!!
		
		
		
		// 과제 - 자바 배열 문제
		// {30, 4, 50, 60, 14, 80, 45, 72, 94, 25}
		// 10개의 상수가 저장된 배열의 값을 확인하고
		//	평균을 구하시오.
		// 10개 정수의 평균 이하인 숫자들은 F, 평균 이상인 숫자들을 A 라고 표기되는
		// 배열을 만들어 출력하세요
		
		// 출력 결과 - F,F,A,A,F,A,F,A,F,
		
		
		
		
		
		
}
}
