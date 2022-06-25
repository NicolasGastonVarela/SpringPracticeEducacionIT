package Clase2.LogAspect;

import org.springframework.stereotype.Component;

@Component
public class Button {
    @CustomAnnotation
    public String push(){
        return "pushed button aspect";
    }
}
