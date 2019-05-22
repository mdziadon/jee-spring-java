package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.Ship;

public class SpringDiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.hello();

        Ship ship = context.getBean("blackPearl", Ship.class);
        ship.getCaptain().startSailing();
    }
}
