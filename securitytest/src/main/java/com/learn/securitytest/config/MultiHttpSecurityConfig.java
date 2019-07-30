package com.learn.securitytest.config;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-30 13:38
 **/
// @Configuration
public class MultiHttpSecurityConfig {
    //
    // @Bean
    // PasswordEncoder passwordEncoder(){
    //     return new BCryptPasswordEncoder(10);
    // }
    //
    // @Autowired
    // protected void configure(AuthenticationManagerBuilder auth) throws Exception{
    //     auth.inMemoryAuthentication()
    //             .withUser("admin").password("$2a$10$RMuFXGQ5AtH4wOvkUqyvuecpqUSeoxZYqilXzbz50dceRsga.WYiq").roles("ADMIN","USER")
    //             .and()
    //             .withUser("sang").password("$2a$10♀eUHbAOMq4bpxTvOVz331IehLe3fu6NwqC9tdOcxJXEhyZ4simqXTC").roles("USER");
    // }
    //
    // @Configuration
    // @Order(1)
    // public static class AdminSecurityConfig extends WebSecurityConfigurerAdapter {
    //     @Override
    //     protected void configure(HttpSecurity http) throws Exception {
    //         http.antMatcher("/admin/**").authorizeRequests().anyRequest().hasRole("ADMIN");
    //     }
    // }
    //
    //
    // @Configuration
    // public static class OtherSecurityConfig extends WebSecurityConfigurerAdapter {
    //     @Override
    //     protected void configure(HttpSecurity http) throws Exception {
    //         http.authorizeRequests()
    //                 .anyRequest().authenticated()
    //                 .and()
    //                 .formLogin()
    //                 .loginProcessingUrl("/login")
    //                 .permitAll()
    //                 .and()
    //                 .csrf()
    //                 .disable();
    //     }
    // }
}
