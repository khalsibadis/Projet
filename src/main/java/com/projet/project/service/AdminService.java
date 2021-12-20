package com.projet.project.service;

import com.projet.project.entities.Fournisseur;
import com.projet.project.entities.SuperAdmin;

public interface AdminService {
    public void addFournisseur(Fournisseur fournisseur);
    void supprimerFournisseur(Long id);
    public void updateFrounisseur(Fournisseur fournisseur);
    public void afficherListe();

}
