package com.projet.project.service;

import com.projet.project.entities.SuperAdmin;

public interface AdminService {
    public void addFournisseur (SuperAdmin Admin);
    void supprimerFournisseur(Long id);
    public void updateFrounisseur(SuperAdmin admin);
    public void afficherListe();

}
