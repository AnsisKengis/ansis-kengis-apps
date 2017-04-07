package banking.product.client;

import lombok.Data;

import java.time.LocalDate;

@Data
public class  RegisterClientCommand {
    private final String clientNumber;
    private final LocalDate effectiveForm;
}
