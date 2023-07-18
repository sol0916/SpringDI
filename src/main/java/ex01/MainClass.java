package ex01;

import java.util.Arrays;

import org.springframework.context.support.GenericXmlApplicationContext;

import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;

public class MainClass {

	public static void main(String[] args) {
		
		//SpringTest st = new SpringTest();
		//st.hello();
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("application-context.xml");
		//1st
		SpringTest st = (SpringTest)ctx.getBean("test");
		st.hello();
		
		//2nd
		SpringTest st2 = ctx.getBean(SpringTest.class);
		st2.hello();
		
		System.out.println(st == st2);
		
//		Hotel hotel = ctx.getBean(Hotel.class);
//		hotel.getChef().cooking();
		
		//
//		MemberDAO dao = ctx.getBean(MemberDAO.class);
//		
//		DatabaseDev dev = dao.getDataSource();
//		System.out.println(dev.getUrl());
//		System.out.println(dev.getUid());
//		System.out.println(dev.getUpw());
		
		//IoC컨테이너 안에 있는 bean의 이름 반환
		//System.out.println(Arrays.toString(ctx.getBeanDefinitionNames())); 

	}

}
