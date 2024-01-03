package ArrayList_test;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class test_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<food> fd = loading();
		
		for( int i =0; i < fd.size(); i++) {// 배열의 크기는 size 메서드로 알 수 있다.
			System.out.println(  fd.get(i)  ); //ArrayList에 저장되어있는 배열의값을 가져오려면 get 메서드 사용
		}
		
	}
	
	
	public static ArrayList<food> loading(){
		ArrayList<food> fd= new ArrayList<>();
		
		try(BufferedReader bf= new BufferedReader(new FileReader("c:/test/food.txt")))
		{	
			while(true) {
				String line = bf.readLine();
				if(line==null)break;
				String[] tmp = line.split("-");
				food data = new food(tmp[0],Integer.parseInt(tmp[1]),tmp[2]);
				fd.add(data);
				
			}
		}
		catch(Exception e) {
			System.out.println("파일 로드 및 반환 실패");
			e.printStackTrace();
		}
		
		return fd;
		}
	}
	
	


