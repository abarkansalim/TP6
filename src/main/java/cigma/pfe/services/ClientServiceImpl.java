package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.IClientRepository;

public class ClientServiceImpl implements IClientService{
    IClientRepository clientRepository ;
    public ClientServiceImpl(IClientRepository clientRepository) {
        System.out.println("Call ClientServiceImpl with ClientRepository param....");
        this.clientRepository = clientRepository;
    }

    public ClientServiceImpl() {
        System.out.println("Call ClientServiceImpl ....");
    }

    @Override
    public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(c);
    }
}
