package Clase2.LogAspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CarBeforeAspect {
    @Before("execution (public String engineStart())")
    public void engineStartAdvice(){
        System.out.println("LOG: engine start from before");
    }
}
