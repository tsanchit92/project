package farm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class FarmMicroApplication {
	
	@LoadBalanced

	@Bean
	public WebClient.Builder getWebClientBuilder() {
		return WebClient.builder();
	}
	
	@Bean
	public WebClient WebClient() {
		
		return WebClient.create();
	}
	public static void main(String[] args) {
		SpringApplication.run(FarmMicroApplication.class, args);
	}

}
