package org.exampledriven.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.net.MalformedURLException;

@EnableZuulProxy
@EnableOAuth2Sso
@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SpringCloudZuulExampleApplication extends WebSecurityConfigurerAdapter {

    public static void main(String[] args) throws MalformedURLException {

        SpringApplication.run(SpringCloudZuulExampleApplication.class, args);

    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.logout().and().antMatcher("/**").authorizeRequests()
                .antMatchers("/login","/auth/**").permitAll()
                .anyRequest().authenticated().and().csrf().disable();
    }

}
