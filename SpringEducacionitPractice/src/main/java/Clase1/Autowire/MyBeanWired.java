package Clase1.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bean")
public class MyBeanWired {

    @Autowired
    Something something;

    public String getGreeting(){
        return "Hello from wired: " + something.getSomething();
    }
}
