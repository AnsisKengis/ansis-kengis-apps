package banking.api.pub;


import banking.api.config.security.LoginService;
import lombok.Data;
import lombok.ToString;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Slf4j
@RestController
public class PublicLoginApi {

    @Autowired
    private LoginService loginService;

    @RequestMapping(path = "/api/public/web/login", method = RequestMethod.POST)
    public LoginResponse login(@Valid @RequestBody LoginRequest login) {

//        String token = loginService.login(login.getEmail(), login.getPassword());
//        return new LoginResponse(token);
        return null;
    }


    @Data
    @ToString(exclude = "password")
    public static class LoginRequest {
        @NotEmpty
        private String email;
        @NotEmpty
        private String password;
    }

    @Value
    public static class LoginResponse {
        private final String token;
    }

}
