package ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex02.Hotel;
import ex03.MemberDAO;

public class MainClass {

	public static void main(String[] args) {

		//자바 설정 파일을 읽을 때
		AnnotationConfigApplicationContext atx =
				new AnnotationConfigApplicationContext(JavaConfig.class);

		Hotel hotel = atx.getBean(Hotel.class);
		hotel.getChef().cooking();
		
		MemberDAO dao = atx.getBean(MemberDAO.class);
		System.out.println(dao.getDataSource().getUid());
		
	}

}
