package Clase2.Base;

import org.springframework.stereotype.Service;

@Service("button")
public class Button {
    public String push(){
        return "pushed button";
    }
}
