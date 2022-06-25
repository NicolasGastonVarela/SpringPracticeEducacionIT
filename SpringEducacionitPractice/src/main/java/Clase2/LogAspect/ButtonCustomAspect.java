package Clase2.LogAspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ButtonCustomAspect {
    @After("@annotation(CustomAnnotation)")
    public void customAdvice(){
        System.out.println("LOG: from after custom");
    }
}
