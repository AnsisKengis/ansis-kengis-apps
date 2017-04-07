package banking.product.crm;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.apache.commons.lang3.RandomStringUtils;


import java.util.Random;

@Slf4j
@Component
public class ClientNumberGenerator {

    public String newNumber(int length) {
        if (true) {
            String number = RandomStringUtils.randomNumeric(length);
            log.debug("Generated new client number: {}", number);
            return number;
        }
            else {
            return "Tests";
        }
    }
}

