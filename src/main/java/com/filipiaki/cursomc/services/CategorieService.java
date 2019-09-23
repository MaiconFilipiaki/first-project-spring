package com.filipiaki.cursomc.services;

import com.filipiaki.cursomc.domain.Categorie;
import com.filipiaki.cursomc.repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository repo;

    public Categorie find(Integer id) {
        Optional<Categorie> obj = repo.findById(id);
        return obj.orElse(null);
    }

}
