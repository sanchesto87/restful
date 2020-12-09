package com.sample.restful.common.aop.config;

import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
  
  /*
   * 스프링 시큐리티 룰을 무시하게 하는 Url 규칙.
   */
  @Override
  public void configure(WebSecurity web) throws Exception {
      web.ignoring()
          .antMatchers("/v1/**")
      ;
  }

}
