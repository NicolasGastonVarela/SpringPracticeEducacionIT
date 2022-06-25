package Clase2.Aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Car implements Vehicle {

    @Autowired
    Button button;

    @Override
    public String engineStart() {
        return "Car engine started aspect: " + button.push();
    }
}
