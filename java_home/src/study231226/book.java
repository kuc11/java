package study231226;

public class book {
	
	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		book.cnt = cnt;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getBook_num() {
		return book_num;
	}

	static int cnt=0;		// (static이 앞에 붙으면) 클래스 변수
	
//	private String title;		// 인스턴스 변수
	public String title;  
	String writer;		// 인스턴스 변수
	int book_num = 0;; // 인스턴스 변수
	
	
	book(){		// 생성자 메서드 (클래스 이름을 그대로 쓰는 메서드)
		book_num = 10;
	}
	
	static void init() {	// 클래스 메서드
		System.out.println("책 등록 시작");
	}
	
	void create() {	// create 는 인스턴스 메서드 이다.
		System.out.println("책 등록");
	}
	
}
// 인스턴스 변수는 인스턴스(객체)생성햐야지만 사용할수 있는 변수다.