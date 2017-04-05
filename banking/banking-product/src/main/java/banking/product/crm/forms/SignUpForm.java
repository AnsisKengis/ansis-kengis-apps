package banking.product.crm.forms;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class SignUpForm {
    @NotEmpty
    @Email
    private String email;
    
    @NotEmpty
    @Length(min = 8)
    private String password;

}
