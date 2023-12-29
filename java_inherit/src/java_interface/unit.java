package java_interface;

public interface unit {

	
	public void move();		// abstract 를 안넣어도 추상메서드로 처리	(인터페이스에서는)
	public void attack();
	public void dead();
	
	
	
// 추상클래스
// abstract class score{
//		abstract void method();
//  }
	
//	public final int run=10;	// final 제어자가 붙은 변수(사웃) 선언 가능
//	public static void output() {	// 클래스 메서드 정의 가능
//		
//	}
//	
//	public void input() {	// 인스턴스 메서드 정의 불가
//		
//	}
//	static int num=0; // 클래스변수 선언 가능하지만 초기값지정 필수
	
}

// 인스턴스페이스에서는 일반적인 변수생성 불가
