package com.example.wypozyczalnia.service;

import com.example.wypozyczalnia.model.Client;
import com.example.wypozyczalnia.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private final ClientRepository clientRepository;

    public List<Client> listAll() {
        return clientRepository.findAll();
    }

    public void save(Client client) {
        clientRepository.save(client);
    }

    public Client get(Long id) {

        return clientRepository.findById(id).get();
    }

    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    public ClientService(ClientRepository clientRepository) {

        this.clientRepository = clientRepository;
    }
}
