package com.filipiaki.cursomc.resources;

import com.filipiaki.cursomc.domain.Categorie;
import com.filipiaki.cursomc.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/categories")
public class CategorieResources {

    @Autowired
    private CategorieService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {

            Categorie obj = service.find(id);
            return ResponseEntity.ok().body(obj);

    }

}
