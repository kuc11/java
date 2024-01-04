package java_study1226;

public class writer {
	private String food_name;
	private int price;
	private String spicy;
	
	writer(){}
	writer(String food, int price, String spicy){
		this.food_name=food;
		this.price=price;
		this.spicy=spicy;
	}
	@Override
	public String toString(){
		return "음식 :"+food_name+"  가격 :"+price+"원  맵기 :"+spicy+"\n";
	}
	
	
	
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSpicy() {
		return spicy;
	}
	public void setSpicy(String spicy) {
		this.spicy = spicy;
	}
}
