package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientServiceImpl;
import cigma.pfe.services.IClientService;

public class ClientController {
    IClientService clientService = new ClientServiceImpl();

    public Client save(Client c){
        System.out.println("ClientController level...");
        return clientService.save(c);
    }
}
