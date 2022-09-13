package com.example.phone.config;

import com.example.phone.jwt.JwtFilter;
import com.example.phone.models.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;



@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private JwtFilter jwtFilter;

    @Autowired
    public SecurityConfig(JwtFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }

    @Bean
    public static BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }

      @Override
    protected void configure( HttpSecurity http) throws Exception {
        http
                .httpBasic()
                    .disable()
                .csrf()
                    .disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .antMatchers("/api/v1/user").hasAuthority(Role.USER.name())
                .antMatchers("/api/v1/auth", "/api/v1/reg").permitAll()
                .antMatchers("/registration","/login").permitAll()
                .and()
                .addFilterBefore( jwtFilter,UsernamePasswordAuthenticationFilter.class);
      }

}
