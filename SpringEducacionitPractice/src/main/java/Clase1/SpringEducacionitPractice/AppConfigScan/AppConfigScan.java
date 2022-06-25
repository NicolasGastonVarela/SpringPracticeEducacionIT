package Clase1.SpringEducacionitPractice.AppConfigScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.SpringEducacionitPractice.SpringEducacionitPractice"})
public class AppConfigScan {
}

//AppConfigScan: Call beans using @ComponentScan and @Service
