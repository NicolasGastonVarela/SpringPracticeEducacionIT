package Clase2.Aspect;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"Clase2.Aspect"})
public class Main {
    public static void main(String[] args){
        ApplicationContext context = SpringApplication.run(Main.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle.engineStart());
    }
}
