package com.filipiaki.cursomc.repositories;

import com.filipiaki.cursomc.domain.Categorie;
import com.filipiaki.cursomc.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
