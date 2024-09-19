package sandeepweek1.Javaweekproject;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

// @Primary // if two beans created we need to remove one beansß


@ConditionalOnProperty(name="deploy.env" , havingValue = "production")
public class ProdDB implements  DB {


  public   String getData(){
        return  "Prod DB";
    }
}
