package arraylist;

public class book implements Comparable<book>{
	private String title;
	private String writer;
	private int year;
	
	public book() {}
	public book(String title, String writer, int year) {
		this.title=title;
		this.writer=writer;
		this.year=year;
		
	}
	//오버라이딩은 메서드 형태를 똑같이 해야한다
	@Override
	public int compareTo(book b) {	//정렬목적
		//책제목 정렬
		return this.title.compareTo(b.title);	//내림차순
	  //return this.title.compareTo(b.title)*-1;//오름차순	어차피 나오는값이 정수이기에 -1로 바꿀수있다.
		//년도로 정렬
		//return this.year - b.year;		//this 가 1번 b.year 가 2번이라하고 계산후 음수거난 0이면 그대로 있고 양수면 위치를 바꾼면서 정렬을 한다.(버블정렬)내림
		//return (this.year- b.year)*-1; 		오름
	}
	@Override
	public String toString() {
		return "제목 :"+title+" 저자 : "+writer+" 출간년도 : "+year+"년";
	}
	
	
}
// 정렬 - 두개의 데이터를 비교하여 크고 작다를 따져서 위치를 변경하는 방법
//	기본데이터타입에 대한 자바 내장 클래스들은 비교, 정렬, 검색을 위한 메서드들을 가지고 있다.
//	사용자(개발자)정의 클래스는 비교, 정렬, 검색을 위한 메서드들이 없기때문에
//	indexOf, contains, sort 와 같은 메서드 사용시 필요한 메서드들을 구현해야한다.
// javax = 그래픽처리