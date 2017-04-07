package banking.product.crm;

import banking.product.client.*;
import banking.product.crm.forms.SignUpForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Component
@Transactional
public class RegistrationService {

    @Autowired
    private ClientService clientService;


     public Long signUp(SignUpForm form) {
        final Long clientId = clientService.registerClient(new RegisterClientCommand(ClientNumberUtils.generateClientNumber(), TimeMachine.today()));

        AddEmailContactCommand emailCommand = new AddEmailContactCommand();
        emailCommand.setClientId(clientId);
        emailCommand.setEmail(form.getEmail());

        return clientId;
     }
}
