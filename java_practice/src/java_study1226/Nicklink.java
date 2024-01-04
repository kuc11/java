package java_study1226;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Nicklink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<writer> fd = search();
		for(int i=0; i<fd.size(); i++) {
			System.out.println(fd.get(i));
		}
		 
	}
	public static ArrayList<writer> search(){
		ArrayList<writer> wd = new ArrayList<>();
		try(BufferedReader fd = new BufferedReader(new FileReader("c:/test/food.txt"))){
			
			while(true) {
				String memo = fd.readLine();
				if(memo==null)break;
				String[] list = memo.split("-");
				writer tmp = new writer(list[0],Integer.parseInt(list[1]),list[2]);
				wd.add(tmp);
			}
		}catch(Exception e){
			System.out.println("오류");
		}
		return wd;
	}
}
