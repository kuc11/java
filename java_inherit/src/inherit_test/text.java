package inherit_test;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tv t = new tv();
	}

}


// 상속 - 여러개의 클래스들을 부모 자식 관계로 연결 해주는 것
//	   - 여러개의 클래스 중에서 부모 클래스는 하나이다. 
//	   - 클래스에서의 상속은 단일상속만 가능( 부모클래스는 하나뿐 )
//	   - 부모클래스의 인스턴스변수, 메서드를 자식 클래스에서 사용 할 수 있다.
//	   - 단, final이 붙은 메서드는 오버라이딩 안됨
//	   - final이 붙은 클래스는 부모 클래스가 될 수 없다.

// 		- 자식클래스의 객체를 생성하면 부모클래스의 객체도 생성된다.