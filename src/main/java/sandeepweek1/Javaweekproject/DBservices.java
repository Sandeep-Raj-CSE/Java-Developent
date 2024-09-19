package sandeepweek1.Javaweekproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DBservices {

    //@Autowired
   // DevDB devdb;

    // using constructor injection

    public  DBservices(DB devdb){
        this.devdb=devdb;

    }

    DB devdb;

    String getData(){
        return  devdb.getData();
    }


}
