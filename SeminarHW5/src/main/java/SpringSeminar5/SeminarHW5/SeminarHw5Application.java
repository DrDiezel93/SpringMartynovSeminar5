package SpringSeminar5.SeminarHW5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SeminarHw5Application {

	public static void main(String[] args) {
		SpringApplication.run(SeminarHw5Application.class, args);
	}

}
