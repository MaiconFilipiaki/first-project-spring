package com.filipiaki.cursomc.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Address implements Serializable {

    private static final long serialVersionUID = -6547916553016534656L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String PublicPlace; // logradouro
    private String number;
    private String complement;
    private String neighborhood; // Bairro
    private String cep;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    public Address() {
    }

    public Address(String publicPlace, String number, String complement, String neighborhood, String cep, Client client, City city) {
        PublicPlace = publicPlace;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.cep = cep;
        this.client = client;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public String getPublicPlace() {
        return PublicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        PublicPlace = publicPlace;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return id.equals(address.id) &&
                Objects.equals(PublicPlace, address.PublicPlace) &&
                Objects.equals(number, address.number) &&
                Objects.equals(complement, address.complement) &&
                Objects.equals(neighborhood, address.neighborhood) &&
                Objects.equals(cep, address.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, PublicPlace, number, complement, neighborhood, cep);
    }
}
