package Clase2.Aspect;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Button {
    public String push(){
        return "pushed button aspect";
    }
}
