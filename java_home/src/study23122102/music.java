package study23122102;

public class music {
	
	static int count = 0;	//클래스 변수, 명시적초기화로 0로 저장
	int playing_time;
	String singer;		// 가수
	String title;		// 제목
		// 재생시간
	
	music(){}	// 기본 생성자메서드
	music(String 가수, String 제목) { // 매개변수가 있는 생성자 메서드
		this.singer = 가수;
		this.title = 제목;
	}
	music(String singer, String title, int time){ // 매개변수가 있는 생성자 메서드		(매개변수갯수가 다르거나 매개변수타입이 다르거나 해야 오버로딩이 된다.)
		this(singer,title);		// music(String 가수, String 제목) 실행        this= 현재 객체 music
		this.playing_time=time;
	}
	
	
	@Override
	public String toString() {
		return "가수 : "+singer+" - "+title+"("+transform()+")";
	}
	
	String transform() {
		int min = playing_time/100;
		int sec = playing_time%100;
		
		return min+":"+sec;
	}
}
