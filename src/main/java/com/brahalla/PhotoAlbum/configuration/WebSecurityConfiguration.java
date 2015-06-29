package com.brahalla.PhotoAlbum.configuration;

import com.brahalla.PhotoAlbum.dao.AccountRepository;
import com.brahalla.PhotoAlbum.domain.entity.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Autowired
  AccountRepository accountRepository;

  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
    authenticationManagerBuilder
      .inMemoryAuthentication()
      .withUser("user")
        .password("password")
        .roles("USER")
      .and().withUser("admin")
        .password("password")
        .roles("ADMIN","USER");
  }

  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {
    httpSecurity
      .authorizeRequests()
        .anyRequest().fullyAuthenticated()
      //.and().authorizeUrls()
      /*.and().formLogin()
        .loginPage("/login")
        .permitAll()
      .and().logout()
        .permitAll()*/
      .and().httpBasic()
      .and().csrf()
        .disable();
  }

}
