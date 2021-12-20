package com.projet.project.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Facture {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String TypeFacture;
    private String EtatPayement;
    private String Total;

    @ManyToOne
    private Fournisseur fournisseur;
}
