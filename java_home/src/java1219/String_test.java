package java1219;

import java.util.Arrays;

public class String_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		String song = "나는 바나나 알러지 원숭이 그래도 나는 바나나 좋아해";
		
		// 1. 원본은 유지하고 모든 바나나를 오랜지로 변경하여 출력하세요
		// 2. 과일 알러지 있는 원숭이, 어떤 과일에 알러지 있는지 출력하세요
		// 		( 알러지 문자열 앞의 과일 이름만 추출)
		// 3. song 문자열 앞에 "상상만 해도 웃음이 나요" 합쳐서 하나의 문자열로 출력
//		System.out.println(song.replace("바나나","오랜지"));
//		System.out.println("알러지"+song.substring(song.indexOf(" "),song.indexOf("알러지")));
//		String sing = "상상만 해도 웃음이 나요 ";
//		System.out.println(sing.concat(song));
		
		//과제
		song = " 크리스마스 에는 많은 것을 원하지 않아요 # 내가 원하는건 딱 하나에요 # "
				+"트리 아래의 선물 같은것도 신경쓰지 않아요 # 당신을 원해요"
				+" 당신이 생각하는 것보다 더 # 내 소원을 이뤄줘요#"
				+" 내가 크리스마스 에 원하는건 당신이에요";
		/*
		 * 1. # 기준으로 한줄씩 출력 하세요( #은 출력창에도 나요면 안되요)
		 * 2. 당신 이라는 단어 대신 "그대" 라고 바꾸어서 출력하세요
		 * 3. 크리스마스를 영어로 변경하여 출력하세요(대문자로)
		 * 4. 세번째#뒤의 가사가 무엇인지 출력하세요
		 */
		String chr = "chrismas";
		
		String temp = song.replaceAll("#","\n").replaceAll("당신", "그대").replaceAll("크리스마스",chr.toUpperCase());
//		String temp2 = song.substring(song.indexOf("#")+1,song.length()-1);
//		String temp3 = temp2.substring(temp2.indexOf("#")+1,temp2.length()-1);
//		String temp4 = temp3.substring(temp3.indexOf("#")+1,temp3.length()-1);
//		temp4 = temp4.substring(0,temp4.indexOf("#"));
		// trim 양쪽끝에 공백 제거
		String temp2 = song;
		for(int i=0; i<3; i++) {
			temp2 = temp2.substring(temp2.indexOf("#")+1,temp2.length()-1);
		}
		temp2 = temp2.substring(0,temp2.indexOf("#"));
		
		System.out.println("원본: "+song);
		System.out.println("");
		System.out.println(temp);
		System.out.println("");
		System.out.println(temp2);
		
		
		
	}

}
