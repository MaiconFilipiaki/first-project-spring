package com.filipiaki.cursomc;

import com.filipiaki.cursomc.domain.Categorie;
import com.filipiaki.cursomc.domain.City;
import com.filipiaki.cursomc.domain.Product;
import com.filipiaki.cursomc.domain.State;
import com.filipiaki.cursomc.repositories.CategorieRepository;
import com.filipiaki.cursomc.repositories.CityRepository;
import com.filipiaki.cursomc.repositories.ProductRepository;
import com.filipiaki.cursomc.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    private CategorieRepository categorieRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private StateRepository stateRepository;
    @Autowired
    private CityRepository cityRepository;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categorie cat1 = new Categorie(null, "Informatica");
        Categorie cat2 = new Categorie(null, "Escritorio");

        Product p1 = new Product(null, "Computador", 2000.00);
        Product p2 = new Product(null, "Impressora", 800.00);
        Product p3 = new Product(null, "Mouse", 80.00);

        cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
        cat2.getProducts().addAll(Arrays.asList(p2));

        p1.getCategories().addAll(Arrays.asList(cat1));
        p2.getCategories().addAll(Arrays.asList(cat1, cat2));
        p3.getCategories().addAll(Arrays.asList(cat1));

        State stat1 = new State("Minas Gerais");
        State stat2 = new State("São Paulo");

        City city1 = new City("Uberlandia", stat1);
        City city2 = new City("Sao Paulo", stat2);
        City city3 = new City("Campinas", stat2);

        stat1.getCitys().addAll(Arrays.asList(city1));
        stat2.getCitys().addAll(Arrays.asList(city2, city3));

        categorieRepository.saveAll(Arrays.asList(cat1, cat2));
        productRepository.saveAll(Arrays.asList(p1, p2, p3));
        stateRepository.saveAll(Arrays.asList(stat1, stat2));
        cityRepository.saveAll(Arrays.asList(city1, city2, city3));
    }
}
