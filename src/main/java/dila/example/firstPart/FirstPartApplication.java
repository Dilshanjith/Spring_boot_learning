package dila.example.firstPart;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstPartApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstPartApplication.class, args);
		System.out.println("Hello");
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
