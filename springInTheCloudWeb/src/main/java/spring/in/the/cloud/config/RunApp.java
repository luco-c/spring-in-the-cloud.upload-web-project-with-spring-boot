package spring.in.the.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"spring.in.the.cloud.config"})
public class RunApp {
	
	public static void main(String args[]) {
		SpringApplication.run(RunApp.class, args);
	}
}