package jose.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaApplication {

	public static void main(String[] args) {
		System.out.println("Hola Mundo!");
		SpringApplication.run(PruebaApplication.class, args);
	}

}
