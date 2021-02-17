package main.java.client.controllers;

import main.java.client.classes.Client;
import main.java.client.services.client.ClientServiceInt;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ClientController {
    private final ClientServiceInt clientServiceInt;

    public ClientController(ClientServiceInt clientServiceInt) {
        this.clientServiceInt = clientServiceInt;
    }


    @GetMapping("/getAllClients")
    public List<Client> selectAllClients() {
        return clientServiceInt.selectAllClients();
    }

    @GetMapping("/getClient/{id}")
    public UserDetails getClient(@PathVariable Long id){
        return clientServiceInt.getClient(id);
    }

    @DeleteMapping("/deleteClient/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable Long id) {
        clientServiceInt.deleteClient(id);
        return ResponseEntity.ok("Client is removed");
    }

    @PostMapping("/createClient")
    public List<String> addClient(@Valid @RequestBody Client client) {
        return clientServiceInt.addClient(client);
    }

    @PutMapping("/updateClient/{id}")
    public List<String> updateClient(@PathVariable Long id, @RequestBody Client client) {
        return clientServiceInt.updateClient(id, client);
    }



}
