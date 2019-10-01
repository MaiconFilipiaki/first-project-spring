package com.filipiaki.cursomc.resources;

import com.filipiaki.cursomc.domain.Client;
import com.filipiaki.cursomc.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientResources {

    @Autowired
    private ClientService clientService;

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {

        Client obj = clientService.find(id);
        return ResponseEntity.ok().body(obj);

    }

}
