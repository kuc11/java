package inherit_test;

public class computer extends house{
	
	float cpu;		// cpu 성능
	int ram;  		// 렘 용량
	
	computer(){};
	computer(String brand, float cpu, int ram){
		super(brand);
		this.cpu=cpu;
		this.ram=ram;
		

	}
	public void power() {
		onoff = !onoff;
	}
}
