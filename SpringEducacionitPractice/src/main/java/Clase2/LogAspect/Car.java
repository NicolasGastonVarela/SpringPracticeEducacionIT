package Clase2.LogAspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

    @Autowired
    Button button;

    @Override
    public String engineStart() {
        System.out.println("control");
        return "Car engine started aspect: " + button.push();
    }
}
