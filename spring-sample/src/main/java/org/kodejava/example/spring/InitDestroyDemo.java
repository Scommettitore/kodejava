package org.kodejava.example.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyDemo {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("AutoEngine.xml");

        AutoEngine engine = (AutoEngine) context.getBean("engine");

        //
        // context.close will remove the bean from the container.
        // This will call our bean destroy method.
        //
        context.close();
    }
}
