package spring.in.the.cloud.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"spring.in.the.cloud.rest.services"})
public class ConfigApp {
	
}