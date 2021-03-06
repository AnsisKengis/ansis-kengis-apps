package banking.product.client;

import banking.product.client.db.ClientEntity;
import banking.product.crm.forms.SignUpForm;
import com.sun.security.ntlm.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import banking.product.client.ClientService;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Transactional
@Component
class ClientServiceBean implements ClientService {

    @Override
    public Long registerClient(RegisterClientCommand command) {

        ClientEntity client = new ClientEntity();
        String clientNumber = command.getClientNumber();
        client.setNumber(clientNumber);
        client.setEffectiveFrom(command. getEffectiveForm());

//        List<String> clientList = new ArrayList<>();
//        clientList.add(client.getId());
//        clientList.add(client.getNumber());

//        System.out.println(clientList);
        System.out.println("Client id: " + client.getId());
        System.out.println("Client number: " + client.getNumber());
        System.out.println("Date client registred: " + client.getEffectiveFrom());

        return null;
    }

}
