package java_h;

public class java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// {30, 4, 50, 60, 14, 80, 45, 72, 94, 25}
		// 출력 결과 - F,F,A,A,F,A,F,A,F,
		
		int[] array = {30, 4, 50, 60, 14, 80, 45, 72, 94, 25};
		int total=0;
		
		for(int i=0; i<array.length; i++) {
			total=total+array[i];
		}
		total = total/array.length;
		
		String[] result = new String[10];
		
		for(int k=0; k<array.length; k++) {
			if(array[k]>=total) {
				result[k] = "A";
			}
			else
				result[k] = "F";
			
			System.out.printf(" %s", result[k]);
		}
			
		
		
	}

}
