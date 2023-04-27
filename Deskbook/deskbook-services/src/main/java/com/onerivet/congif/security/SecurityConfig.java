package com.onerivet.congif.security;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig {

	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		
		http
			.cors()
		.and()
			.authorizeHttpRequests(
					(authorize)->authorize.requestMatchers("/api/deskbook").permitAll()
					.anyRequest().authenticated()
					)
			.oauth2ResourceServer().jwt();
		
		return http.build();
		
	}
	
	
	JwtDecoder jwtDecoder(OAuth2ResourceServerProperties properties) {
		
	}
}
