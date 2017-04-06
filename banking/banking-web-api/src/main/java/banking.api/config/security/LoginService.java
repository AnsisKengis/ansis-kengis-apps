package banking.api.config.security;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.nio.file.AccessDeniedException;


import static java.time.Instant.now;


@Slf4j
@Component
public class LoginService {

//    @Autowired
//    private WebJwtTokenService jwtTokenService;
//
//    @Autowired
//    private WebUserDetailsService detailsService;
//
//    public String login(String email, String password) throws AccessDeniedException {
//        try {
//            UserDetails user = detailsService.loadUserByUsername(email);
//            if (!PasswordHash.verifyPassword(password, user.getPassword())) {
//                log.info("Login failed with email {}, wrong password", email);
//                throw new AccessDeniedException("Invalid username or password");
//            }
//            String token = jwtTokenService.generate(user.getUsername(), now().plus(DEFAULT_TOKEN_VALID_DURATION));
//            return token;
//        } catch (UsernameNotFoundException e) {
//            log.info("Login failed with email {}, unknown email", email);
//            throw new AccessDeniedException("Invalid username or password");
//        }
//    }
}