package sandeepweek1.Javaweekproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // starting of application and only springbootapplication
public class JavaweekprojectApplication implements CommandLineRunner {

	@Autowired // the helps to wired the object in the application


	// here we can define obje
	apple obj; // but we get the error we can't define the static keyboard
	// so basically we need to implement command line linterface


	@Autowired
	DBservices dbs;

	public static void main(String[] args) {
		SpringApplication.run(JavaweekprojectApplication.class, args);


		// apple obj = new apple(); -> we can't use new keyboard everytime
		// that is not  bean
		//obj.eatapplye();
	}


	@Override
	public void run(String... args) throws Exception {
		//obj.eatapplye();
		System.out.println(dbs.getData());
	}
}
