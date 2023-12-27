package java_study1226;

import java.util.Arrays;

public class java_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		music[] melon = new music[10];
		melon[0] = new music("LE SSERAFIM","Perfect Night",239);
		melon[1] = new music("EXO","첫 눈",329);
		melon[2] = new music("aespa","Drama",335);
		melon[3] = new music("태연","To.X",250);
		melon[4] = new music("정국","Seven",304);
		melon[5] = new music("제니","You&Me",259);
		melon[6] = new music("아이브","Baddie",234);
		melon[7] = new music("정국","Standing Next to You",326);
		melon[8] = new music("AKMU","Love Lee",259);
		melon[9] = new music("IVE","I AM",303);
		for(int i=0;i<melon.length;i++)
		System.out.println(melon[i]);
	}

	}

