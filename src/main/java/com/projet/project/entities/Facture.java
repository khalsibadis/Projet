package com.projet.project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Facture {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String TypeFacture;
    private String EtatPayement;
    private String Total;

    @ManyToOne
    @JsonIgnore
    private Fournisseur fournisseur;

    @ManyToOne
    @JsonIgnore
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeFacture() {
        return TypeFacture;
    }

    public void setTypeFacture(String typeFacture) {
        TypeFacture = typeFacture;
    }

    public String getEtatPayement() {
        return EtatPayement;
    }

    public void setEtatPayement(String etatPayement) {
        EtatPayement = etatPayement;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
