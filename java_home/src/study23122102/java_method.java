package study23122102;

import java.util.Scanner;

public class java_method {

	static void list_print( music[] mylist) {
		for ( music obj : mylist) {
			System.out.println(obj);
		}
	}
	static void song_search(music[] mylist,String keyword) { //가수 또는 노재제목으로 검색
		boolean issong= false;
		/*
		 * for(music obj:mylist){
		 *  	if(obj.singer.equals(keyword) || obj.title.equals(keyword)){
		 *  	System.out.println(mylist[i]);
				issong = true
		 *  	}
		 * }
		 */
		
		for( int i=0; i<mylist.length; i++) {
			if(mylist[i].singer.equals(keyword) || mylist[i].title.equals(keyword) )
			{
				System.out.println(mylist[i]);
				issong = true;
			}
		}
		if(!issong) {
			System.out.println("등록되지 않은 음원입니다");
		}
		
		
	}
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		music[] mylist = new music[10];
		mylist[0] = new music("LE SSERAFIM","Perfect Night",239);
		mylist[1] = new music("EXO","첫 눈",329);
		mylist[2] = new music("aespa","Drama",335);
		mylist[3] = new music("태연","To.X",250);
		mylist[4] = new music("정국","Seven",304);
		mylist[5] = new music("제니","You&Me",259);
		mylist[6] = new music("아이브","Baddie",234);
		mylist[7] = new music("정국","Standing Next to You",326);
		mylist[8] = new music("AKMU","Love Lee",259);
		mylist[9] = new music("IVE","I AM",303);
		
//		music[] mylis = new music[] {
//				new music("LE SSERAFIM","Perfect Night",239),new music("EXO","첫 눈",329),
//				new music("aespa","Drama",335),new music("태연","To.X",250),
//				new music("정국","Seven",304),new music("제니","You&Me",259),
//				new music("아이브","Baddie",234),new music("정국","Standing Next to You",326),
//				new music("AKMU","Love Lee",259),new music("IVE","I AM",303)
//		};

//		list_print(mylist);
		
		String keyword = scan.nextLine();
		song_search(mylist,keyword);
		
	}

}
