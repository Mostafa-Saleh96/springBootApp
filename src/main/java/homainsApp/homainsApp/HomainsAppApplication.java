package homainsApp.homainsApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(value = "com.store")
@EnableAutoConfiguration
@EntityScan(value = "com.store")
@EnableJpaRepositories("com.store")

public class HomainsAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(HomainsAppApplication.class, args);
	}

}
