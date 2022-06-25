package Clase2.LogAspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CarAroundAspect {
    @Around("execution (* Clase2.LogAspect.Car.engineStart())")
    public Object engineStartAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("LOG: engine start from around");
        Object value = proceedingJoinPoint.proceed();
        System.out.println("LOG: engine start result has: " + value.toString().length() + "characters");
        return value;
    }
}
