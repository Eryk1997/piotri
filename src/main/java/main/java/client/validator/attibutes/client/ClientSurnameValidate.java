package main.java.client.validator.attibutes.client;

import main.java.client.classes.Client;
import main.java.client.validator.attibutes.Validator;
import org.springframework.stereotype.Component;

import static main.java.client.validator.ErrorValidator.SURNAME_LONG;
import static main.java.client.validator.ErrorValidator.SURNAME_SHORT;

@Component
public class ClientSurnameValidate implements Validator<Client> {
    @Override
    public String validate(Client value) {
        String attibutes = value.getSurname();
        if (attibutes.length() < 3)
            return SURNAME_SHORT;
        else if (attibutes.length() > 20)
            return SURNAME_LONG;

        return null;
    }
}
