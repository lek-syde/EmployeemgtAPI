package com.biosec.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<String> {

	public Optional<String> getCurrentAuditor() {
		// TODO Auto-generated method stub
		return Optional.of("Anonymous");
	}
	
	
	

  
}
