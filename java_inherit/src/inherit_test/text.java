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


//	웹사이트 제작 	-> 회원가입 저장
//			  	-> 게시물저장
//				-> 문의사항 등록
//				-> 공지사항 저장

// 정리
//		다양성 - 하나의 타입(클래스)코 여러 타입(클래스)을 사용하기 위한 방법
//			 - 다형성이 되려면 상속, 오버라이딩이 꼭 필요하다.
//			 - 상속은 extends를 이용하여 자식클래스들에게 적용된다.
//			 - 오버라이딩은 부모클래스에 추상메서드로 정의하고 자식클래스들에서 메서드를 구현한다.
//			 

//			 상속 관계가 되려면 각각의 클래스들의 유사성이 있어야한다.
//			 animal - 개, 고양이, 곰, 사자
//			 게임유닛 - 마린, 저글링, 히드라, 시즈탱크, 질럿
//			 자동차   - 소나타, 그랜저, e클래스, 쏘렌토

// 		추상메서드를 가진 클래스는 반드시 추상클래스가 되어야한다.
//		상속관계에서는 추상메서드가 자식에게 물려지게 된다.
//		자식클래스가 추상메서들르 실체화 구현 하지않으면 자식클래스도 추상클래가 되어야한다ㅣ.
//		추상클래스는 객체 생성이 안된다.





















