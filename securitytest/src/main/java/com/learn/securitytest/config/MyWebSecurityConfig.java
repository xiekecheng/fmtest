package com.learn.securitytest.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * @description: 基于内存认证
 * @author: Kecheng Xie
 * @since: 2019-07-30 09:59
 **/
@Configuration
public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }



    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("123").roles("ADMIN", "USER").and().withUser("sang").password("123").roles("USER").and().withUser("root").password("123").roles("ADMIN","DBA");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/**")
                .hasRole("ADMIN")
                .antMatchers("/user/**")
                .access("hasAnyRole('ADMIN','USER')")
                .antMatchers("/db/**")
                .access("hasRole('ADMIN') and hasRole('DBA')")
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login_page")
                .loginProcessingUrl("/login")
                .usernameParameter("name")
                .passwordParameter("passwd")
                .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
                        Object principal = authentication.getPrincipal();
                        httpServletResponse.setContentType("application/json;charset=utf-8");
                        PrintWriter out = httpServletResponse.getWriter();
                        httpServletResponse.setStatus(200);
                        HashMap<String, Object> map = new HashMap<>();
                        map.put("status",200);
                        map.put("msg",principal);
                        ObjectMapper om = new ObjectMapper();
                        out.write(om.writeValueAsString(map));
                        out.flush();
                        out.close();
                    }
                })
                .failureHandler(new AuthenticationFailureHandler() {
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
                        httpServletResponse.setContentType("application/json;charset=utf-8");
                        PrintWriter out = httpServletResponse.getWriter();
                        httpServletResponse.setStatus(401);
                        HashMap<String, Object> map = new HashMap<>();
                        map.put("status",401);
                        if (e instanceof LockedException){
                            map.put("msg","账户被锁定,登陆失败!");
                        }else if (e instanceof BadCredentialsException){
                                map.put("msg","账户名或密码输入错误11,登陆失败!");
                        }else if (e instanceof DisabledException){
                            map.put("msg","账户被禁用,登陆失败!");
                        }else if (e instanceof AccountExpiredException){
                            map.put("msg","账户已过期,登陆失败!");
                        }else if (e instanceof CredentialsExpiredException){
                            map.put("msg","密码已过期,登陆失败!");
                        }else {
                            map.put("msg","登陆失败!");
                        }

                        ObjectMapper om = new ObjectMapper();
                        out.write(om.writeValueAsString(map));
                        out.flush();
                        out.close();
                    }
                })
                .permitAll()
                .and()
                .csrf()
                .disable();
    }
}
