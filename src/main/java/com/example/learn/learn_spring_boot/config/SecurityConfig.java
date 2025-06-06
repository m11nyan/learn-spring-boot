package com.example.learn.learn_spring_boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
        .formLogin(org.springframework.security.config.Customizer.withDefaults())
        .build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
       UserDetails user = User.withDefaultPasswordEncoder()
       .username("admin")
       .password("admin")
       .roles("ADMIN")
       .build();
    return new InMemoryUserDetailsManager(user);
    }
}
