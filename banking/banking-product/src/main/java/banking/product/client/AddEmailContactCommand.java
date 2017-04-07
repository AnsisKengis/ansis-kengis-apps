package banking.product.client;

import lombok.Data;

@Data
public class AddEmailContactCommand {
    private String email;
    private Long clientId;
}
