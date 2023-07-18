package ex06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	//batter1 주입해주세요
	
	@Autowired
	@Qualifier("battery1")
	private IBattery battery;
	
	public Car() {}

	public Car(IBattery battery) {
		this.battery = battery;
	}
	
	//getter
	public IBattery getBattery() {
		return battery;
	}
	
	
}
