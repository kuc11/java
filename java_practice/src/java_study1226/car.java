package java_study1226;

import java.util.Scanner;



class design{
	int displacement;
	int weight;
	String color;
	String maker;
	
}
class sedan extends design{
	public String make( int displacement , int weight, String color, String maker) {
	return "세단 배기량: "+displacement+"cc, 차중량: "+weight+"kg, 색상: "+color+", 메이커: "+maker;
	}
}
class suv extends design{
	public String make(int displacement , int weight, String color, String maker) {
	return "suv 배기량: "+displacement+"cc, 차중량: "+weight+"kg, 색상: "+color+", 메이커: "+maker;
	}
}
class supercar extends design{
	public String make(int displacement , int weight, String color, String maker) {
	return "수퍼카 배기량: "+displacement+"cc, 차중량: "+weight+"kg, 색상: "+color+", 메이커: "+maker;
	}
}
class truck extends design{
	public String make(int displacement , int weight, String color, String maker) {
	return "트럭 배기량: "+displacement+"cc, 차중량: "+weight+"kg, 색상: "+color+", 메이커: "+maker;
	}                   
}

public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		sedan s1 =  new sedan();
		int cc,kg;
		cc = scan.nextInt();
		kg = scan.nextInt();
		scan.nextLine();
		String col = scan.nextLine();
		
		String mak = scan.nextLine();
		
		System.out.println(s1.make(cc,kg,col,mak));
	}

}
