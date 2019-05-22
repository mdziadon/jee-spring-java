package pl.coderslab.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.beans.Captain;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.Ship;

@Configuration
public class AppConfig {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }

    @Bean
    public Captain jackSparrow() {
        return new Captain();
    }

    @Bean
    public Ship blackPearl() {
        return new Ship(jackSparrow());
    }
}
