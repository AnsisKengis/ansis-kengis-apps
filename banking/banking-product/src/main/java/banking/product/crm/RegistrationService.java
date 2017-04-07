package banking.product.crm;

import banking.product.client.AddEmailContactCommand;
import banking.product.client.ClientModel;
import banking.product.client.ClientService;
import banking.product.client.RegisterClientCommand;
import banking.product.crm.forms.SignUpForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;


@Slf4j
@Component
@Transactional
public class RegistrationService {

    @Autowired
    private ClientService clientService;


     public Long signUp(SignUpForm form) {
        final Long clientId = clientService.registerClient(new RegisterClientCommand(ClientNumberUtils.generateClientNumber()));

        AddEmailContactCommand emailCommand = new AddEmailContactCommand();
        emailCommand.setClientId(clientId);
        emailCommand.setEmail(form.getEmail());

        return clientId;
     }
}
