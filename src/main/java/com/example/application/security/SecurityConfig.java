package com.example.application.security;

//
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.config.http.SessionCreationPolicy;
//
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//
//	private final CustomUserDetailsService userDetailsService;
//	private final JwtAuthorizationFilter jwtAuthorizationFilter;
//
//	public SecurityConfig(CustomUserDetailsService customUserDetailsService,
//			JwtAuthorizationFilter jwtAuthorizationFilter) {
//		this.userDetailsService = customUserDetailsService;
//		this.jwtAuthorizationFilter = jwtAuthorizationFilter;
//
//	}
//
//	@Bean
//	public AuthenticationManager authenticationManager(HttpSecurity http, NoOpPasswordEncoder noOpPasswordEncoder)
//			throws Exception {
//		AuthenticationManagerBuilder authenticationManagerBuilder = http
//				.getSharedObject(AuthenticationManagerBuilder.class);
//		authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(noOpPasswordEncoder);
//		return authenticationManagerBuilder.build();
//	}
//
//	@SuppressWarnings("deprecation")
//	@Bean
//	public NoOpPasswordEncoder passwordEncoder() {
//		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//	}
//
//
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
////		
////		http.csrf(csrf -> csrf.disable())
////        .exceptionHandling(exception -> exception.authenticationEntryPoint(unauthorizedHandler))
////        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
////        .authorizeHttpRequests(auth -> 
////          auth.requestMatchers("/api/auth/**").permitAll()
////              .requestMatchers("/api/test/**").permitAll()
////              .anyRequest().authenticated()
////        );
////    
////   http.authenticationProvider(authenticationProvider());
//////
////  http.addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
//////    
////   return http.build();
//		
//		
//		
//				http.csrf().disable().authorizeHttpRequests().requestMatchers("/auth/**").permitAll().anyRequest().authenticated();
//
//				return http.build();
//	}
//
//}
