package com.filipiaki.cursomc.services;

import com.filipiaki.cursomc.domain.Client;
import com.filipiaki.cursomc.repositories.ClientRepository;
import com.filipiaki.cursomc.services.exceptions.ObjectNotFoundExpection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repo;

    public Client find(Integer id) {
        Optional<Client> returnObj = repo.findById(id);
        return returnObj.orElseThrow(() -> new ObjectNotFoundExpection(
                "Obj not found id: " + id + " Type " + Client.class.getName()));
    }

}
