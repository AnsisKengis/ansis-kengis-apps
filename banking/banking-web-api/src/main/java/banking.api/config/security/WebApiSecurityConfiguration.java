package banking.api.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebApiSecurityConfiguration extends WebSecurityConfigurerAdapter{

//    @Override
//    protected void cofigure(HttpSecurity http) throws Exception {
//
//    }
}
