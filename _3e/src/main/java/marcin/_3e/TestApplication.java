package marcin._3e;

import marcin._3e.calculate.rs.CalculationService;
import marcin._3e.calculate.rs.CalculationServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Bean
	public CalculationService calculationService() {
		return new CalculationServiceImpl();
	}

}
