package Clase2.Base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("vehicle")
public class Car implements Vehicle{

    @Autowired
    Button button;

    @Override
    public String engineStart() {
        return "Car engine started: " + button.push();
    }
}
