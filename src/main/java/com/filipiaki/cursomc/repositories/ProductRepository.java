package com.filipiaki.cursomc.repositories;

import com.filipiaki.cursomc.domain.Categorie;
import com.filipiaki.cursomc.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
