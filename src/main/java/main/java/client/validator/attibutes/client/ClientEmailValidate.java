package main.java.client.validator.attibutes.client;

import main.java.client.classes.Client;
import main.java.client.validator.attibutes.Validator;
import org.springframework.stereotype.Component;

import static main.java.client.validator.ErrorValidator.EMAIL_LONG;
import static main.java.client.validator.ErrorValidator.EMAIL_SHORT;

@Component
public class ClientEmailValidate implements Validator<Client> {
    @Override
    public String validate(Client value) {
        String attibute = value.getEmail();
        if (attibute.length() < 3)
            return EMAIL_SHORT;
        else if (attibute.length() > 20)
            return EMAIL_LONG;
        return null;
    }
}
