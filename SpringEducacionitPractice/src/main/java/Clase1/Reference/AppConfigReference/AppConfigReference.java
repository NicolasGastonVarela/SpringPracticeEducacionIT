package Clase1.Reference.AppConfigReference;

import Clase1.Reference.Entity.MyBeanReference;
import Clase1.Reference.Entity.MyNumber;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigReference {

    @Bean(name= "number")
    public MyNumber myNumber(){
        return new MyNumber();
    }

    @Bean(name= "bean")
    public MyBeanReference myBean(){
        return new MyBeanReference(myNumber());
    }
}

// AppConfig using beans inside the AppConfig class