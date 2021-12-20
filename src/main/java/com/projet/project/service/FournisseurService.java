package com.projet.project.service;

import com.projet.project.entities.Fournisseur;
import com.projet.project.entities.SuperAdmin;

public interface FournisseurService {
    public void ajouterFacture(Fournisseur fournisseur);

    public void modifierFacture(Fournisseur fournisseur);

    void supprimerFacture(Long id);

    public void afficherListe();


}
