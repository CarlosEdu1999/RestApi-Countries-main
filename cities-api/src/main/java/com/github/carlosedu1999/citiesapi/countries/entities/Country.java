package com.github.carlosedu1999.citiesapi.countries.entities;

import javax.persistence.*;

@Entity
@Table(name = "pais")
public class Country {
    @Id
    private Long id;
    @Column(name = "nome")
    private String name;
    @Column(name = "nome_pt")
    private String portugueseName;
    @Column(name = "sigla")
    private String code;
    private Integer bacen;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPortugueseName() {
        return portugueseName;
    }

    public String getCode() {
        return code;
    }

    public Integer getBacen() {
        return bacen;
    }

    public Country() {

    }
}
