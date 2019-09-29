package com.filipiaki.cursomc.repositories;

import com.filipiaki.cursomc.domain.Categorie;
import com.filipiaki.cursomc.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
