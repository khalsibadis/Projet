package com.projet.project.service;

import com.projet.project.entities.Facture;
import com.projet.project.entities.Fournisseur;
import com.projet.project.entities.SuperAdmin;

public interface FournisseurService {
    public void ajouterFacture(Facture facture);

    public void modifierFacture(Facture facture);

    void supprimerFacture(Long id);

    public void afficherListe();


}
