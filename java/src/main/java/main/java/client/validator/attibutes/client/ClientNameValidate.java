package main.java.client.validator.attibutes.client;

import main.java.client.classes.Client;
import main.java.client.validator.attibutes.Validator;
import org.springframework.stereotype.Component;

import static main.java.client.validator.ErrorValidator.NAME_LONG;
import static main.java.client.validator.ErrorValidator.NAME_SHORT;

@Component
public class ClientNameValidate implements Validator<Client> {
    @Override
    public String validate(Client client) {
        String attibute = client.getName();
        if (attibute.length() < 3)
            return NAME_SHORT;
        else if (attibute.length() > 20)
            return NAME_LONG;
        return null;
    }
}
