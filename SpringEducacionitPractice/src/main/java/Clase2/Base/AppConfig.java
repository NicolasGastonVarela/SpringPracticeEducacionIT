package Clase2.Base;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"Clase2.base"})
public class AppConfig {

    @Autowired
    Car car;

    @Bean("proxy")
    public ProxyFactoryBean proxy(){
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTarget(car);
        proxyFactoryBean.addAdvice(new BeforeAdvisor());
        return proxyFactoryBean;
    }
}
