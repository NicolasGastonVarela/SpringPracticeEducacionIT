package Clase1.Autowire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringEducacionitPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEducacionitPracticeApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigScan.class);
		MyBeanWired bean = (MyBeanWired) context.getBean("bean");
		System.out.println(bean.getGreeting());
	}

}
