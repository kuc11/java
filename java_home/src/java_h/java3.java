package java_h;

import java.util.Arrays;

public class java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// {30, 4, 50, 60, 14, 80, 45, 72, 94, 25}
		// 출력 결과 - F,F,A,A,F,A,F,A,F,
		
		int[] array = {30, 4, 50, 60, 14, 80, 45, 72, 94, 25};
		int total=0;
		int len = array.length;
		
		for(int i=0; i < len; i++) {
			total=total+array[i];
		}
		total = total/len;
		
		char[] result = new char[10];
		
		for(int k=0; k < len; k++) {
			if(array[k]>=total) {
				result[k] = 'A';			//문자는 작은따옴표('') 문자열은 큰따옴표("")
			}
			else
				result[k] = 'F';
			
			System.out.printf("%2c", result[k]);
			
		}
		System.out.println();
		System.out.println(Arrays.toString(result));
		
	}

}
