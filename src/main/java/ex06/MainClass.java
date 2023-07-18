package ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("battery-context.xml");
		
		Car car = ctx.getBean(Car.class);
		car.getBattery().energy();

		Airplane airplane = ctx.getBean(Airplane.class);
		airplane.getBattery().energy();
		

	}

}
