package com.projet.project.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Fournisseur  implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String password;
@ManyToMany(mappedBy = "fournisseurs")
    private Set<SuperAdmin>superAdmins;
}
