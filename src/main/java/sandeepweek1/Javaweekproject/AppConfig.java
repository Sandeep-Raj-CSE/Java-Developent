package sandeepweek1.Javaweekproject;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean

    apple getApple(){
        return  new apple();
    }


}
