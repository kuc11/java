package inherit_test;

public class aircon extends house{	// 자식: aircon  부모:house (부모는 아무것도 하지않고 자식이 한다.)

	int temp; 	// 온도
	int speed;	// 풍속
	public void power() {
		onoff = !onoff;
	}
}
