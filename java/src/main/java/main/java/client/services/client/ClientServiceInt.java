package main.java.client.services.client;

import main.java.client.classes.Client;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface ClientServiceInt {
    List<Client> selectAllClients();

    void deleteClient(Long id);

    List<String> addClient(Client client);

    List<String> updateClient(Long id, Client client);

    UserDetails getClient(Long id);

}
