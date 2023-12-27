package poly;
import inherit_test.house;

public class fan extends house{
	
	int sn=1234;
	
	fan(){}
	fan(String brand){
		super(brand);
		
	}
	
	@Override
	public void power() {
		onoff = !onoff;
	}
}
