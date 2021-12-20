package com.projet.project.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Fournisseur  implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String password;
@ManyToMany(mappedBy = "fournisseurs")
    private Set<SuperAdmin>superAdmins;

@ManyToMany
    private Set<User> users;

@OneToMany(mappedBy = "fournisseur")
    private Set<Facture> factures;

}
