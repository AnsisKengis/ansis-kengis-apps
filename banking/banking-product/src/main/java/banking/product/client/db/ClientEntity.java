package banking.product.client.db;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ClientEntity {

    private String id;

    private String number;

    private LocalDate effectiveFrom;
}
