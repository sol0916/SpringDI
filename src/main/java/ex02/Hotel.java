package ex02;

public class Hotel {
	
	//호텔은 생성될 때 생성자 매개변수로 Chef를 받는다
	private Chef chef;
	
	
	//생성자
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	//getter
	public Chef getChef() {
		return chef;
	}

}
