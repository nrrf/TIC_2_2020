package mintic.unal.art;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("mintic.unal.art")
public class ArtApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(ArtApplication.class, args);
	}

}
