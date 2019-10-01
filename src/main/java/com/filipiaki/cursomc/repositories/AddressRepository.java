package com.filipiaki.cursomc.repositories;

import com.filipiaki.cursomc.domain.Address;
import com.filipiaki.cursomc.domain.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
