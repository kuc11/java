package java_study1226;



public class music {
	String singer;
	String title;
	int playtime;
	music(){}
	music(String 가수,String 노래,int time){
		this.singer=가수;
		this.title=노래;
		this.playtime=time;
	}
public String toString() {
	return "가수:"+singer+"  노래:"+title+"  플레이타임:"+playtime;
}


}
