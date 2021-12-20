package com.projet.project.service;

import com.projet.project.entities.Fournisseur;
import com.projet.project.entities.SuperAdmin;
import com.projet.project.repository.AdminRepository;
import com.projet.project.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    FournisseurRepository fournisseurRepository;

    @Override
    public void addFournisseur(Fournisseur fournisseur) {
        fournisseurRepository.save(fournisseur);
    }

    @Override
    public void supprimerFournisseur(Long id) {
        fournisseurRepository.deleteById(id);
    }

    @Override
    public void updateFrounisseur(Fournisseur fournisseur) {
        fournisseurRepository.save(fournisseur);
    }

    @Override
    public void afficherListe() {
        fournisseurRepository.findAll();
    }


}
