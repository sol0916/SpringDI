package ex07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ex01.SpringTest;
import ex02.Chef;
import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;

@Configuration
public class JavaConfig {
	
	//<bean id="test" class="ex01.SpringTest" />
	@Bean
	public SpringTest test() {
		return new SpringTest();
	}
	
	
	/*
	<!-- id = 이름, class= 경로 -->
	<bean id="chef" class="ex02.Chef"/>
	
	<!-- ref = 참조할 빈의 아이디 -->
	<bean id="hotel" class="ex02.Hotel">
		<constructor-arg ref="chef"/>
	</bean>
	*/
	@Bean
	public Chef chef() {
		return new Chef();
	}
	
	@Bean
	public Hotel hotel() {
		return new Hotel(chef());
	}
	
	
	/*
	 <bean id="dev" class="ex03.DatabaseDev">
		<property name="url" value="jdbc:mysql://localhost"/>
		<property name="uid" value="coding404"/>
		<property name="upw" value="1234"/>
	</bean>
	
	<bean id="memberDAO" class="ex03.MemberDAO">
		<property name="dataSource" ref="dev" />
	</bean>
	 */
	
	@Bean
	public DatabaseDev dev() {
		DatabaseDev dev = new DatabaseDev();
		dev.setUrl("자바 파일로 생성");
		dev.setUid("hello");
		dev.setUpw("레오니");
		
		return dev;
	}
	
	
	@Bean
	public MemberDAO dao() {
		
		MemberDAO dao = new MemberDAO();
		dao.setDataSource(dev());
				
		return dao;
	}

}
