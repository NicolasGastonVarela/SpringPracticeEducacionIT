package Clase1.Reference;

import Clase1.Reference.Entity.MyBeanReference;
import Clase1.Reference.AppConfigReference.AppConfigReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringEducacionitPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEducacionitPracticeApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigReference.class);
		MyBeanReference bean = (MyBeanReference) context.getBean("bean");
		System.out.println(bean.getGreeting());
	}

}
