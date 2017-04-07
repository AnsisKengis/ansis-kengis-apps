package banking.product.crm;


import banking.product.crm.ClientNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Random;


@Component
public class ClientNumberUtils {

    private static ClientNumberGenerator clientNumberGenerator;

    @Autowired
    public ClientNumberUtils(ClientNumberGenerator clientNumberGenerator) {
        ClientNumberUtils.clientNumberGenerator = clientNumberGenerator;
    }

    public static String generateClientNumber() {
        return clientNumberGenerator.newNumber(7);
    }
}
