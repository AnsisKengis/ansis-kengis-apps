package banking.api.pub;

import banking.api.config.security.LoginService;
import banking.product.crm.RegistrationService;
import banking.product.crm.forms.SignUpForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import javax.validation.ValidationException;
import java.io.IOException;


@Slf4j
@RestController
public class PublicSignUpApi {

    @Autowired
    private LoginService loginService;

    @Autowired
    private RegistrationService registrationService;

    @RequestMapping(path = "/api/public/web/signup", method = RequestMethod.POST)
    public PublicLoginApi.LoginResponse signUp(@Valid @RequestBody SignUpForm form) {

        System.out.println("Registering as client {}" + form.getEmail());
//
//        try {
//            registrationService.signUp(form);
//        } catch (IOException e) {
//            return null;
//        }
//            String token = loginService.login(form.getEmail(), form.getPassword());
//            return new PublicLoginApi.LoginResponse(token);
        return null;
        }
}
