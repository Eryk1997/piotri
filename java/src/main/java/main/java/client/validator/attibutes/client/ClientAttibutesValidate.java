package main.java.client.validator.attibutes.client;

import main.java.client.classes.Client;
import main.java.client.validator.attibutes.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class ClientAttibutesValidate {
    private final List<Validator<Client>> validators;

    @Autowired
    public ClientAttibutesValidate(List<Validator<Client>> validators) {
        this.validators = validators;
    }

    public List<String > validate(Client client){
        return validators.stream()
                .map(e ->e.validate(client))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
