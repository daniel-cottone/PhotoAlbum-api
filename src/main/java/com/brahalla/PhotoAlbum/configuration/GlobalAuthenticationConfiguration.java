package com.brahalla.PhotoAlbum.configuration;

import com.brahalla.PhotoAlbum.dao.AccountRepository;
import com.brahalla.PhotoAlbum.domain.entity.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
public class GlobalAuthenticationConfiguration extends GlobalAuthenticationConfigurerAdapter {



  @Override
  public void init(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
    authenticationManagerBuilder.userDetailsService(userDetailsService());
  }

  @Bean
  UserDetailsService userDetailsService() {
    return new UserDetailsService() {

      @Autowired
      AccountRepository accountRepository;

      @Override
      public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = this.accountRepository.findByUsername(username);
        if(account != null) {
          return new User(
            account.getUsername(),
            account.getPassword(),
            true, true, true, true,
            AuthorityUtils.createAuthorityList("USER")
          );
        } else {
          throw new UsernameNotFoundException("could not find the user '" + username + "'");
        }
      }

    };
  }

}
