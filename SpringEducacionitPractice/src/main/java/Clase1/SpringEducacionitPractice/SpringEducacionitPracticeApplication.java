package Clase1.SpringEducacionitPractice;

import Clase1.SpringEducacionitPractice.AppConfigScan.AppConfigScan;
import Clase1.SpringEducacionitPractice.Interface.UserContact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringEducacionitPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEducacionitPracticeApplication.class, args);
		//UserContactMail userContactMail = new UserContactMail();
		//System.out.println(userContactMail.getUserContact());
		//UserContactWp userContactWp = new UserContactWp();
		//System.out.println(userContactWp.getUserContact());
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigScan.class);
		UserContact bean = (UserContact) context.getBean("UserContact");
		System.out.println(bean.getUserContact());
	}

}
