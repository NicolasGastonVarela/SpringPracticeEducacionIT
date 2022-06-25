package Clase1.Autowire;

import org.springframework.stereotype.Service;

@Service("something")
public class Something {
    public String getSomething(){
        return "something";
    }
}
