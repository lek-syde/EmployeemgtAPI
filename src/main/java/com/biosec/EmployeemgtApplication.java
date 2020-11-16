package com.biosec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.biosec.config.AuditorAwareImpl;


@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class EmployeemgtApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemgtApplication.class, args);
	}

	 @Bean
	    public AuditorAware<String> auditorAware() {
	        return new AuditorAwareImpl();
	    }

}
