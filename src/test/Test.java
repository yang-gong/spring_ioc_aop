package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.Book;
import entity.User;
import service.UserService;

public class Test {
	public static void main(String[] args) {
		//���������ļ�
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ����
		User user=(User) ac.getBean("user");
//		//���÷���
//		System.out.println(user.getUsername()+"....."+user.getPassword());
//		user.run();
//		UserService ser=(UserService) ac.getBean("userService");
//		ser.service();
		/*Book b=(Book) ac.getBean("book");
		b.show();*/
	 String[] arr=	user.getArrs();
		for (String st : arr) {
			System.out.println(st);
		
	
	System.out.println(user.getMap());
	System.out.println(user.getList());
	}
	}
}
