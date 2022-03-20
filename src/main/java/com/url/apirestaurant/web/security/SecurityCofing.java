package com.url.apirestaurant.web.security;

import com.url.apirestaurant.domain.service.UsuarioDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityCofing extends WebSecurityConfigurerAdapter {

    @Autowired
    private UsuarioDetailsService usuarioDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(usuarioDetailsService);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/v2/api-docs/**");
        web.ignoring().antMatchers("/swagger.json");
        web.ignoring().antMatchers("/swagger-ui.html");
        web.ignoring().antMatchers("/swagger-resources/**");
        web.ignoring().antMatchers("/webjars/**");
    }
}
