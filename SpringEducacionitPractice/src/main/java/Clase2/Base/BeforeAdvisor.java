package Clase2.Base;

import org.aopalliance.aop.Advice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdvisor implements MethodBeforeAdvice {
    @Override
    public void before (Method method, Object[] args, Object target){
        System.out.println("Before");
    }
}
