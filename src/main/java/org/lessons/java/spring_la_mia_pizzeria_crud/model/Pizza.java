package org.lessons.java.spring_la_mia_pizzeria_crud.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "pizze")
public class Pizza {
    @Id
    private Integer id;

    private String nome;
    private String descrizione;

    @Column(name="foto_url")
    private String fotoUrl;

    private BigDecimal prezzo;

    // Getter and Setter

    // Id
    public Integer getId() {
        return this.id;
    }

    // Nome
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.equals("")) {
            this.nome = nome;
        }
    }

    // Descrizione
    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        if(descrizione != null && !descrizione.equals("")) {
            this.descrizione = descrizione;
        }
    } 

    // Foto
    public String getFotoUrl() {
        return this.fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        if(fotoUrl != null && !fotoUrl.equals("")) {
            this.fotoUrl = fotoUrl;
        }
    }

    // Prezzo
    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        if(prezzo.compareTo(BigDecimal.ZERO) > 0) {
            this.prezzo = prezzo;
        }
    }
}
