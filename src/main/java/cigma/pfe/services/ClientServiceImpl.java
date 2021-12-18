package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepositoryImpl;
import cigma.pfe.repositories.IClientRepository;

public class ClientServiceImpl implements IClientService{
    IClientRepository clientRepository = new ClientRepositoryImpl();

    public ClientServiceImpl() {
        System.out.println("Call ClientServiceImpl ....");
    }

    @Override
    public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(c);
    }
}
