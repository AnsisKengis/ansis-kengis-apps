package banking.product.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import banking.product.client.ClientService;

@Slf4j
@Transactional
@Component
class ClientServiceBean implements ClientService {

    @Override
    public Long registerClient(RegisterClientCommand command) {
        ClientModel client = new ClientModel();

//        client.setEmail("tests");
//        System.out.println(client.getEmail());

        return null;

    }

}
