package br.marmitafitnes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"br.marmitafitnes.repository"})
@EntityScan(basePackages ={"br.marmitafitnes.model"})
public class MarmitafitnesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarmitafitnesApplication.class, args);
	}

}
