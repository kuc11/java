package study231221;

public class student {
	String name; // 이름 - 인스턴스 변수
	int kor; // 국어성적 - 인스턴스 변수
	int mat; // 수학성적 - 인스턴스 변수
	int eng; // 영어성적 - 인스턴스 변수
	int total; // 총점 - 인스턴스 변수
	float avg; // 평균 - 인스턴스 변수
	
	// 생성자 메서드는 클래스명으로 매서드이름을 사용한다. 클래스 생성시 student(){} 이 생량되있다.
	// 같은 이름의 메서드는 사용 가능 (단, 매개변수는 달라야한다) 
	// 오버로딩 - 메서드의 이름은 같아야한다.
	//			매개변수는 같으면 안된다.( 타입이 다르거나, 매개변수 갯수가 다르거나)
	//			동일한 클래스에만 오버로딩 할 수 있다.
	student(){
		
	}
	
	
	student(String name , int k, int m, int e){
		this.name=name;	// 인스턴스 변수 name 에 매개변수 name을 저장
		this.kor=k;
		this.mat=m;
		this.eng=e;
		this.calc();
	}
	

	
	@Override
	public String toString() {
		return name+"["+kor+" , "+mat+" , "+eng+"] 총점 : "+
				total+" 평균 : "+String.format("%.1f", avg);	// String format 에서 자릿수 설정
	}	
	
	// 메서드 구조 - 반환타입 메서드이름(매개변수){  }
	// void - 아무것도 없다 (return 이 없다)
	void calc() {	// 총점 , 평균
		this.total = kor+mat+eng;				// this 를 안넣어 줘도 된다.
		avg = total/3.0f;							// 정수/정수 = 정수   정수/실수 = 실수   더큰영역 타입쪽으로 결과 값이 나온다.	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
