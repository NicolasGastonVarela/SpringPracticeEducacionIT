package Clase2.Base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle vehicle = (Vehicle) context.getBean("vehicle");
        System.out.println(vehicle.engineStart());
        vehicle = (Vehicle) context.getBean("proxy");
        System.out.println(vehicle.engineStart());
    }
}
